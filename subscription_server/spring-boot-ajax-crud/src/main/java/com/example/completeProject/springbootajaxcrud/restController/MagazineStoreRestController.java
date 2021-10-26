package com.example.completeProject.springbootajaxcrud.restController;

import com.example.completeProject.springbootajaxcrud.entity.Magazine;
import com.example.completeProject.springbootajaxcrud.entity.MagazineStore;
import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.MagazineStoreRepository;
import com.example.completeProject.springbootajaxcrud.service.MagazineStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins="*")
public class MagazineStoreRestController {
    @Autowired
    MagazineStoreService magazineStoreService;

    @GetMapping("/magazineStore")
    public List<MagazineStore> getMagazineStoreList(){
        return magazineStoreService.getMagazineStoreList();
    }

    @GetMapping("/magazineStore/{magazineStoreId}")
    public MagazineStore getMagazineStore(@PathVariable String magazineStoreId)
    {
        return magazineStoreService.getMagazineStoreById(Integer.parseInt(magazineStoreId));
    }

    @PostMapping(path = "/magazineStore",consumes = "application/json")
    public MagazineStore addMagazineStore(@RequestBody MagazineStore magazineStore){
        magazineStoreService.saveOrUpdateMagazineStore(magazineStore);
        return magazineStore;
    }

    @PutMapping(path = "/magazineStore", consumes = "application/json")
    public MagazineStore updateMagazineStore(@RequestBody MagazineStore magazineStore){
        magazineStoreService.saveOrUpdateMagazineStore(magazineStore);
        return magazineStore;
    }

    @DeleteMapping(value = "/magazineStore/{magazineStoreId}")
    public ResponseEntity<HttpStatus> deleteMagazineStore(@PathVariable("magazineStoreId") String magazineStoreId)
    {
        try{
            magazineStoreService.deleteMagazineStore(Integer.parseInt(magazineStoreId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
