package com.grigoriliev.jsampler.samplercs.test;

import android.test.ActivityInstrumentationTestCase2;
import com.grigoriliev.jsampler.samplercs.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

