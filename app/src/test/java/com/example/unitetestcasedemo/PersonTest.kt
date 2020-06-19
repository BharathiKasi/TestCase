package com.example.unitetestcasedemo

import junit.framework.Assert.assertEquals
import org.junit.*;
import org.mockito.Mockito
import org.mockito.Mockito.doReturn
import org.mockito.Mockito.verify

class PersonTest {


    /**
     * In this method we used mock for mocking the person object
     * so it will create a dummy object
     * when we call addpersondetails it will that method will all null parameter.
     * so here we want really object to call that addpersondetails() method
     * We are going for Spy conecpt...
     */
    @Test
    fun addPersonDetailsUsingMockTest(){
        var mPerson = Mockito.mock(Person::class.java)
        //Mockito.`when`(mPerson.getPersonAddress()).thenReturn(null)
        mPerson.addPersonDetails(null,29,"Male","Chennai")
        assertEquals("Ponneri",mPerson.getPersonAddress())
    }

    /**
     * In this method we used to spy to create an person object
     * so it will create person object with simulation
     * by using this object we can access the person class methods and variables.
     * Here also we can mock any method if we want.
     */
    @Test
    fun addPersonDetailsUsingSpyTest(){
        var mPerson = Mockito.spy(Person::class.java)
        mPerson.addPersonDetails("Bharathi",23,"Male","Ponneri")
        //doReturn("san").`when`(mPerson).getPersonName() mock getpersonName method
        assertEquals("bharathi",mPerson.getPersonName())
        mPerson.addPersonDetails("san",22,"female","Chennai")
        verify(mPerson, Mockito.times(1)).addPersonDetails("Bharathi",23,"Male","Ponneri")
        verify(mPerson, Mockito.times(1)).addPersonDetails("san",22,"female","Chennai")
    }

}