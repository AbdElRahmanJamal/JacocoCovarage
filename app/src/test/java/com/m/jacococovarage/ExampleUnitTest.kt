package com.m.jacococovarage

import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val mainActivity = MainActivity()
        Assert.assertEquals(mainActivity.add(6), 5)
    }

    @Test
    fun addition_isCorrect1() {
        val mainActivity = MainActivity()
        Assert.assertEquals(mainActivity.adds(6), 7)
    }

    @Test
    fun addition_isCorrect6() {
        val mainActivity = MainActivity()
        Assert.assertEquals(mainActivity.adds(), 6)
    }

    @Test
    fun addition_Peopel_isCorrect() {
        val mainActivity = Peopel()
        Assert.assertEquals(mainActivity.add(), 10)
    }


}
