package com.example.kotlincovid19.pojoClass

class PagerDetail {
    internal constructor() {}
    constructor(tittle: String?) {
        this.tittle = tittle
    }

    var tittle: String? = null
}