package com.udacity.pricingmicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Price {

    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long id;
    private String currency;
    private BigDecimal price;
   @Id
    private Long vehicleid;

    public Price() {
    }

    //public Price(Long id, String currency, BigDecimal price, Long vehicleId) {
    public Price(String currency, BigDecimal price, Long vehicleid) {
        this.currency = currency;
        this.price = price;
        this.vehicleid = vehicleid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getVehicleId() {
        return vehicleid;
    }

    public void setVehicleId(Long vehicleid) {
        this.vehicleid = vehicleid;
    }

}