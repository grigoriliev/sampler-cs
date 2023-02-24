package org.jsampler.android.test;

import android.test.ActivityInstrumentationTestCase2;
import org.jsampler.android.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<JSamplerActivity> {

    public HelloAndroidActivityTest() {
        super(JSamplerActivity.class); 
    }

    public void testActivity() {
        JSamplerActivity activity = getActivity();
        assertNotNull(activity);
    }
}

