package com.crmiguez.iop_grid.service;

import com.crmiguez.iop_grid.entities.Price;
import com.crmiguez.iop_grid.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("priceService")
public class PriceService implements IPriceService {

    @Autowired
    @Qualifier("priceRepository")
    private PriceRepository priceRepository;

    @Override
    public List<Price> findAllPrices() {
        return (List<Price>) priceRepository.findAll();
    }

    @Override
    public Optional<Price> findPriceByBrandId(Integer brandId){
        return priceRepository.findById(brandId);
    }

    @Override
    public Optional<Price> findPriceByProductId(Integer productId){
        return (Optional<Price>) priceRepository.findByProductId(productId);
    }

    @Override
    public Optional<Price> findPriceByParameters(String date, Integer productId, Integer brandId){
        return (Optional<Price>) priceRepository.findByStartDateAndProductIdAndBrandId(date, productId, brandId);
    }

    @Override
    public Price addPrice(Price price){
        return priceRepository.save(price);
    }

    @Override
    public void deletePrice (Price price){
        priceRepository.delete(price);
    }

    @Override
    public Price updatePrice(Price priceDetails, Price price){

        price.setPrice(priceDetails.getPrice());

        return priceRepository.save(price);
    }

}