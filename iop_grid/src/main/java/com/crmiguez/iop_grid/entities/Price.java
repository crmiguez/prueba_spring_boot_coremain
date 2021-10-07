package com.crmiguez.iop_grid.entities;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity(name = "prices")
@Table

public class Price implements Serializable{
    @Id
    @Size(max = 10)
    @Column(name = "BrandId")
    private Integer brandId;

    @Column(name = "StarDate")
    private String startDate;

    @Column(name = "EndDate")
    private String endDate;

    @Column(name = "PriceList")
    private Integer priceList;

    @Column(name = "ProductId")
    private Integer productId;

    @Column(name="Priority")
    @ColumnDefault(value = "0")
    private byte priority;

    @Column(name = "Price")
    private Double price;

    @Size(max = 3)
    @Column(name = "Currency")
    private String currency;

    @Column(name = "LastUpdate")
    private String lastUpdate;

    @Column(name = "LastUpdateBy")
    private String lastUpdateBy;

    public Price(){

    }

    public Price(String startDate, String endDate, Integer priceList, Integer productId, byte priority, Double price, String currency, String lastUpdate, String lastUpdateBy) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceList = priceList;
        this.productId = productId;
        this.priority = priority;
        this.price = price;
        this.currency = currency;
        this.lastUpdate = lastUpdate;
        this.lastUpdateBy = lastUpdateBy;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
}
