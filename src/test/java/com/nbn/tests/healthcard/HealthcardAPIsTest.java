package com.nbn.tests.healthcard;

import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("env.properties")
@RunWith(ZeroCodeUnitRunner.class)
public class HealthcardAPIsTest {

    @Test
    @JsonTestCase("healthcard/healthcard_positive.json")
    public void testGet() throws Exception {
    }
    
    @Test
    @JsonTestCase("healthcard/healthcard_negative.json")
    public void testGet1() throws Exception {
    }

}
