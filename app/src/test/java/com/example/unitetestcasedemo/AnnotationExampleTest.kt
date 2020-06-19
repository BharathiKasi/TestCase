package com.example.unitetestcasedemo

import junit.framework.Assert.assertEquals
import org.junit.*
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.Spy

class AnnotationExampleTest {
    private lateinit var mAnnotationExample:AnnotationExample

    companion object{

        @JvmStatic
        @BeforeClass
        fun callBeforeClassStart(){
            print("this will execute before the class starts its execution")
        }
        @JvmStatic
        @AfterClass
        fun callAfterCallEnd(){
            print("this will execute after the class end its execution")
        }
    }
    @Before
    fun callBeforeAllMethod(){
        //mAnnotationExample = AnnotationExample()
        println("this will execute before all the method execution ")
    }

    @After
    fun callAfterAllMethod(){
        println("this will execute after all the method execution")
    }

    @Test
    fun reversedStringTest(){
        var pString = "Bharathi"
        assertEquals("ihtarahB",mAnnotationExample.revereseGiveString(pString))
    }
    @Test
    fun reveredStringWithNullTest(){
        assertEquals("ihtarahB",mAnnotationExample.revereseGiveString(null))
    }

    @Test
    fun reveredStringWithNullTest2(){
        assertEquals("",mAnnotationExample.revereseGiveString(null))
    }

    /**
     * before run this  method command the @Before method...
     * this is explain about mock and when method...
     */
    @Test
    fun reversedStringWithMockTest(){
       var mAnnotationExample = Mockito.mock(AnnotationExample::class.java)
        var pString = "ihtarahB"
       //initially comment and run then uncomment and run
        Mockito.`when`(mAnnotationExample.revereseGiveString("Bharathi")).thenReturn("ihtarahB")
        assertEquals(pString,mAnnotationExample.revereseGiveString("Bharathi"))
    }

    /**
     * This method is explain about spy() method...
     */
    @Test
    fun reversedStringWithSpyTest(){
        var mAnnotationExample = Mockito.spy(AnnotationExample::class.java)
        var pString = "ihtarahB"
        assertEquals(pString,mAnnotationExample.revereseGiveString("Bharathi"))
    }

    @Test
    fun reversedStringWithVerifyTest(){
        var mAnnotationExample = Mockito.spy(AnnotationExample::class.java)
        mAnnotationExample.revereseGiveString("san")
        mAnnotationExample.revereseGiveString("Bharathi")
        mAnnotationExample.revereseGiveString("Bharathi")
        verify(mAnnotationExample, times(1)).revereseGiveString("Bharathi")
    }

    @Test
    fun reversedStringWithSpyTest2(){
        var mMockList = Mockito.mock(ArrayList::class.java) as ArrayList<String>
        var mSpyList = Mockito.spy(ArrayList::class.java) as ArrayList<String>
        assertEquals(0,mMockList.size)
        mMockList.add("Bharathi")
        assertEquals(0,mMockList.size)
        assertEquals(0,mSpyList.size)
        mSpyList.add("San")
        assertEquals(1,mSpyList.size)
    }



}