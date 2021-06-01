package com.mexcelle.data.repository.hospitals

import android.util.Log
import android.view.View
import com.mexcelle.data.domain.repository.HospitalsRepository
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsLocalDataSource
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsRemoteDataSource
import com.mexcelle.view.contact.ContactActivity
import com.mexcelle.view.hospital.Hospitals
import java.lang.Exception

class HospitalsRepositoryImpl(
    private val hospitalsLocalDataSource: HospitalsLocalDataSource,
    private val hospitalsRemoteDataSource: HospitalsRemoteDataSource
):HospitalsRepository
{
    override suspend fun getHospitals(): List<MedicalCollege> {
        return getHospitalsFromAPI()
    }



    suspend fun getHospitalsFromAPI():List<MedicalCollege> {
        var hospitalsList: List<MedicalCollege> = ArrayList<MedicalCollege>()

        Log.e("response","running")

        try {
            val response = hospitalsRemoteDataSource.getHospitals()
            val body = response.body()
            Log.e("response1", body.toString())
            if(body!=null){
                hospitalsList=body.data.medicalColleges
                Hospitals.shimmerFrameLayout!!.stopShimmerAnimation()
                Hospitals.shimmerFrameLayout!!.visibility = View.GONE
                Log.e("response list",hospitalsList.toString())

            }
        } catch (exception: Exception) {
            Log.e("MyTag", exception.message.toString())
        }
        return hospitalsList
    }

    suspend fun getHospitalsFromDB():List<MedicalCollege>{
        var countryList: List<MedicalCollege> =  ArrayList<MedicalCollege>()

        try {
            countryList = hospitalsLocalDataSource.getHospitalFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(countryList!=null){
            return countryList
        }else{
            countryList=getHospitalsFromAPI()
            hospitalsLocalDataSource.savesaveHospitalToDB(countryList)
        }

        return countryList
    }



}








