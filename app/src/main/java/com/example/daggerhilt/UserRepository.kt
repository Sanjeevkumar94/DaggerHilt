package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject
import kotlin.math.log

const val TAG = "MyTag"
class UserRepository @Inject constructor( private val loggerService: LoggerService) {

    fun saveUser(email:String,password:String){
        loggerService.log("User save in db")

    }
}