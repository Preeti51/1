package com.example.completeProject.springbootajaxcrud.restController;

import com.example.completeProject.springbootajaxcrud.entity.Price;
import com.example.completeProject.springbootajaxcrud.entity.Price;
import com.example.completeProject.springbootajaxcrud.repository.PriceRepository;
import com.example.completeProject.springbootajaxcrud.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class PriceRestController {
    @Autowired
    PriceService priceService;

    @GetMapping("/price")
    public List<Price> getPriceList(){
        return priceService.getPriceList();
    }

    @GetMapping("/price/{priceId}")
    public Price getPrice(@PathVariable String priceId)
    {
        return priceService.getPriceById(Integer.parseInt(priceId));
    }

    @PostMapping(path = "/price",consumes = "application/json")
    public Price addPrice(@RequestBody Price price){
        priceService.saveOrUpdatePrice(price);
        return price;
    }

    @PutMapping(path = "/price", consumes = "application/json")
    public Price updatePrice(@RequestBody Price price){
        priceService.saveOrUpdatePrice(price);
        return price;
    }

    @DeleteMapping(value = "/price/{priceId}")
    public ResponseEntity<HttpStatus> deletePrice(@PathVariable("priceId") String priceId)
    {
        try{
            priceService.deletePrice(Integer.parseInt(priceId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
