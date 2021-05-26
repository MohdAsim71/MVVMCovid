package com.example.kotlincovid19.pojoClass


class Livedetails {
    var country: String? = null
    var cases: String? = null
    var todayCases: String? = null
    var recovered: String? = null
    var active: String? = null
    var deaths: String? = null
    var todayDeaths: String? = null
    var critical: String? = null
    var isExpanded = false


    constructor(
        country: String?,

        cases: String?,
        todayCases: String?,
        recovered: String?,
        active: String?,
        deaths: String?,
        todayDeaths: String?,
        critical: String?
    ) {
        this.country = country

        this.cases = cases
        this.todayCases = todayCases
        this.recovered = recovered
        this.active = active
        this.deaths = deaths
        this.todayDeaths = todayDeaths
        this.critical = critical
        isExpanded = false
    }
}




