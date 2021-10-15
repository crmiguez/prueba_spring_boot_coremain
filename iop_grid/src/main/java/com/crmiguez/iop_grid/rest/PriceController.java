package com.crmiguez.iop_grid.rest;

import com.crmiguez.iop_grid.entities.Price;
import com.crmiguez.iop_grid.exception.ResourceNotFoundException;
import com.crmiguez.iop_grid.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api_iop/v1")
public class PriceController {

    @Autowired
    @Qualifier("priceService")
    private PriceService priceService;

    @GetMapping("/prices")
    public List<Price> getAllPrices() {
        return priceService.findAllPrices();
    }

    @GetMapping("/prices/{id}")
    public ResponseEntity<Price> getPriceByBrandId(
            @PathVariable(value = "id") Integer brandId) throws ResourceNotFoundException {
        Price price = priceService.findPriceByBrandId(brandId)
                .orElseThrow(() -> new ResourceNotFoundException("Price not found on :: "+ brandId));
        return ResponseEntity.ok().body(price);
    }

    @GetMapping("/prices/{date}/{productid}/{brandid}")
    public ResponseEntity<Price> getPriceByParameters(
            @PathVariable(value = "date") String endDate,
            @PathVariable(value = "productid") Integer productId,
            @PathVariable(value = "brandid") Integer brandId) throws ResourceNotFoundException {
        Price price = priceService.findPriceByParameters(endDate, productId, brandId)
                .orElseThrow(() -> new ResourceNotFoundException("Date, product and brandId not found on :: "+ endDate + " "+ productId +" "+brandId));
        return ResponseEntity.ok().body(price);
    }

}

