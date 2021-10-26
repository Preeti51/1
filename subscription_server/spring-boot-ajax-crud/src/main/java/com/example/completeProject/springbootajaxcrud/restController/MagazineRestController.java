package com.example.completeProject.springbootajaxcrud.restController;


import com.example.completeProject.springbootajaxcrud.entity.Cart;
import com.example.completeProject.springbootajaxcrud.entity.Magazine;
import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.CartRepository;
import com.example.completeProject.springbootajaxcrud.service.CartService;
import com.example.completeProject.springbootajaxcrud.service.MagazineService;
import com.example.completeProject.springbootajaxcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MagazineRestController {
    @Autowired
    private MagazineService magazineService;

    @GetMapping("/name")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/magazine")
    public ResponseEntity<List<Magazine>> getMagazineList() {
        return new ResponseEntity<List<Magazine>>(magazineService.getMagazineList(), HttpStatus.OK);
    }

    @GetMapping("/magazine/{id}")
    public ResponseEntity<Magazine> getMagazine(@PathVariable Integer id) {
        return new ResponseEntity<Magazine>(magazineService.getMagazineById(id), HttpStatus.OK);
    }

    @PostMapping("/magazine/save")
    public ResponseEntity<Void> saveOrUpdateMagazine(@RequestBody Magazine magazine) {
        magazineService.saveOrUpdateMagazine(magazine);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/magazine/delete/{id}")
    public ResponseEntity<Void> deleteMagazine(@PathVariable Integer id) {
        magazineService.deleteMagazine(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }





}
