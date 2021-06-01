package com.mexcelle.data.repository.hospitals.dataSourceImpl

import com.mexcelle.data.db.HospitalDao
import com.mexcelle.data.model.hospitalsPojo.MedicalCollege
import com.mexcelle.data.repository.hospitals.dataSource.HospitalsLocalDataSource

class HospitalsLocalDataSourceImpl(private val hospitalDao: HospitalDao):HospitalsLocalDataSource
{
    override suspend fun getHospitalFromDB(): List<MedicalCollege> {
    return hospitalDao.getHospital()
    }

    override suspend fun savesaveHospitalToDB(medicalCollege: List<MedicalCollege>) {
    return hospitalDao.saveHospital(medicalCollege)
    }

}