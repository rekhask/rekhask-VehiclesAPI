package com.udacity.pricingmicroservice.repository;


import com.udacity.pricingmicroservice.entity.Price;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PriceRepositoryTest {

    @Autowired
    private PriceRepository priceRepository;

    @Test
    public void findVehicleID1(){
        Assert.assertNotNull(priceRepository.findById(1L));
    }

    @Test
    public void saveTest(){
        Price newPrice = new Price();
        newPrice.setCurrency("Dollar");
        newPrice.setPrice(new BigDecimal(10000));
        newPrice.setVehicleId(11L);
        priceRepository.save(newPrice);
        Assert.assertNotNull(priceRepository.findById(11L));


    }
}
