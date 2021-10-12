package com.cicd.pipline.TutospringBoot.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class tutoResourceTest {

    @Autowired
    HealthCheck mHealthCheck;
  
    @Autowired
    DataResource mDataResource;

    @Test
    void health() {
        assertEquals( "HEALTH CHECK OK!", mHealthCheck.healthCheck());
    }


    @Test
    void nationsLength() {
        Integer nationsLength = mDataResource.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = mDataResource.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

}
