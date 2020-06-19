package com.example.unitetestcasedemo

class AnnotationExample {

    fun revereseGiveString(pString:String?):String? {
        var reveresedString = ""
         if(pString!=null){
            for (pPostion in pString.length downTo 1){
                reveresedString += pString[pPostion-1]
            }
        }
        return reveresedString
    }
}