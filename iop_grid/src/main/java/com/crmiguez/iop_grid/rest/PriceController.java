package com.crmiguez.iop_grid.rest;

import com.crmiguez.iop_grid.entities.Price;
import com.crmiguez.iop_grid.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            @PathVariable(value = "date") String startDate,
            @PathVariable(value = "productid") Integer productId,
            @PathVariable(value = "brandid") Integer brandId) throws ResourceNotFoundException {
        Price price = priceService.findPriceByParameters(startDate, productId, brandId)
                .orElseThrow(() -> new ResourceNotFoundException("Date, product and brandId not found on :: "+ startDate + " "+ productId +" "+brandId));
        return ResponseEntity.ok().body(price);
    }

}

