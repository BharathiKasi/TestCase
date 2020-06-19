package com.example.unitetestcasedemo

class Calculation {

    fun add(pValue1:Int?,pValue2:Int?): Int? {
        return if (pValue1!=null && pValue2!=null){
             pValue1.plus(pValue2)
        }else{
            null
        }
    }

    fun addDataToList(pString:String):Int{
        var lArrayList = arrayListOf<String>()
        lArrayList.add(pString)
        return lArrayList.size
    }
}