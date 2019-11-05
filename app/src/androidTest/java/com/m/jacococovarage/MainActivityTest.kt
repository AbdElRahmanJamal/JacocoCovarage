package com.m.jacococovarage

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    var activityActivityTestRule: ActivityTestRule<MainActivity> =
        object : ActivityTestRule<MainActivity>(MainActivity::class.java) {

        }

    @Test
    @Throws(Exception::class)
    fun test_text() {
        Thread.sleep(2000)
        onView(withId(R.id.text)).perform(click())

    }

    @Test
    @Throws(Exception::class)
    fun test_button() {
        Thread.sleep(2000)
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.text)).check(matches(withText("Hello")))

    }
}