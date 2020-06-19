package com.example.unitetestcasedemo

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mockito
import org.mockito.Mockito.times
import kotlin.concurrent.timer
import kotlin.text.Typography.times

@RunWith(Parameterized::class)
class ParameterizedPersonTest(pName:String?, pAge:Int?, pGender:String?, pAddress:String?) {
    var mName:String? = pName
    var mAge  = pAge
    var mGender = pGender
    var mAddress = pAddress
    @Captor
    private val mArgumentCaptor = ArgumentCaptor.forClass(Person::class.java)
companion object {
    @JvmStatic
    @Parameterized.Parameters
    fun getPersonDetailsTest(): List<Array<out Any?>> {
        return listOf(
            arrayOf("Bharathi", 23, "Male", "Ponneri"), arrayOf("San", 22, "Female", "Ponneri"),
            arrayOf("babu", 30, "Male", "Ponneri"), arrayOf("",20,"","")
        )
    }
}

    @Test
    fun addPersonalDetailsTest(){
        var mPerson = Mockito.spy(Person::class.java)
        var list = arrayOf(mName,mAge,mGender,mAddress)
        mPerson.addPersonDetails(mName,mAge,mGender,mAddress)
        assertEquals(mName,mPerson.getPersonName())
        assertEquals(mAge,mPerson.getPersonAge())
        assertEquals(mGender,mPerson.getPersonGender())
        assertEquals(mAddress,mPerson.getPersonAddress())
    }


}