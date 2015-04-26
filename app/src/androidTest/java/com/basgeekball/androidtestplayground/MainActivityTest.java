package com.basgeekball.androidtestplayground;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    Activity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testWelcome() {
        onView(withText(activity.getResources().getString(R.string.welcome))).check(matches(isDisplayed()));
    }

}
