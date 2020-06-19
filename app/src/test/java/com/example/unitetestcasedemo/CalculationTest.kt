package com.example.unitetestcasedemo

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito


class CalculationTest {

    @Test
    fun addTest(){
        var mCalculation = Calculation();
        assertEquals(10,mCalculation.add(5,5))
    }

    @Test
    fun addWithNullTest(){
        var mCalculation = Calculation();
        assertEquals(null,mCalculation.add(null,null))
    }

    @Test
    fun addWithNullTest2(){
        var mCalculation = Calculation();
        assertEquals(10,mCalculation.add(null,null))
    }

    @Test
    fun addWithNullTest3(){
        var mCalculation = Calculation();
        assertEquals(10,mCalculation.add(10,null))
    }

    @Test
    fun addDataToListTest(){
        //var mCalculation = Calculation()
        //var mCalculation = Mockito.mock(Calculation::class.java)
        //assertEquals(1,mCalculation.addDataToList("hai"))
    }

}