package com.crmiguez.iop_grid.service;

import com.crmiguez.iop_grid.entities.Price;

import java.util.List;
import java.util.Optional;

public interface IPriceService {
    public List<Price> findAllPrices();
    public Optional<Price> findPriceByBrandId(Integer brandId);
    public Optional<Price> findPriceByProductId(Integer productId);
    public Optional<Price> findPriceByParameters(String date, Integer productId, Integer brandId);
    public Price addPrice(Price price);
    public Price updatePrice(Price priceDetails, Price price);
    public void deletePrice (Price Price);
}
