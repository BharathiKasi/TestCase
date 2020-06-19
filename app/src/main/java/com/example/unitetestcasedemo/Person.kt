package com.example.unitetestcasedemo

import android.util.Log
import java.lang.NullPointerException
import java.util.logging.Logger

class Person {
    private var mName:String? = null
    private var mAge:Int? = 0
    private var mGender:String? = null
    private var mAddress:String? = null

    fun addPersonDetails(pName: String?, pAge:Int?, pGender:String?, pAddress:String?){
        if (pName!=null && pAge!=null && pGender!=null && pAddress!=null){
            mName = pName
            mAge = pAge
            mGender = pGender
            mAddress = pAddress
        }else{
            throw NullPointerException()
        }
    }
    fun getPersonName():String?{
        return mName
    }
    fun getPersonAge():Int?{
        return mAge
    }
    fun getPersonGender():String?{
        return  mGender
    }
    fun getPersonAddress():String?{
        return mAddress
    }

}