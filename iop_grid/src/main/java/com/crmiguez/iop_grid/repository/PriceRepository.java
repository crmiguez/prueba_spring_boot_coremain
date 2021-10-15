package com.crmiguez.iop_grid.repository;

import com.crmiguez.iop_grid.entities.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("priceRepository")
public interface PriceRepository extends CrudRepository<Price, Integer> {
    Object findByBrandId(Integer brandId);
    Object findByProductId(Integer productId);
    Object findByEndDateAndProductIdAndBrandId(String endDate, Integer productId, Integer brandId);
}
