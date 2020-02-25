package com.udacity.pricingmicroservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.udacity.pricingmicroservice.entity.Price;

public interface PriceRepository extends CrudRepository <Price, Long> {
}
