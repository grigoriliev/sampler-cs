package com.grigoriliev.jsampler.samplercs.test;
import com.grigoriliev.jsampler.samplercs.JSamplerActivity;

import android.test.ActivityInstrumentationTestCase2;

public class SamplerCSTest extends ActivityInstrumentationTestCase2<JSamplerActivity> {

    public SamplerCSTest() {
        super(JSamplerActivity.class); 
    }

    public void testActivity() {
        JSamplerActivity activity = getActivity();
        assertNotNull(activity);
    }
}

