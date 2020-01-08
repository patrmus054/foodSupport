package com.example.foodsupport.data

class DB {

    var dao = DBDao()
        private set

    companion object{
        @Volatile private var instace: DB? = null

        fun getInstance() =
            instace ?: synchronized(this){
                instace ?: DB().also { instace = it }
            }
    }

    //co

}