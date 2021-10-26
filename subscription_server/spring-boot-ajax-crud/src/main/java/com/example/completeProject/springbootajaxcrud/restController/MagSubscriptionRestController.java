package com.example.completeProject.springbootajaxcrud.restController;

import com.example.completeProject.springbootajaxcrud.entity.MagSubscription;
import com.example.completeProject.springbootajaxcrud.entity.MagSubscription;
import com.example.completeProject.springbootajaxcrud.repository.MagSubscriptionRepository;
import com.example.completeProject.springbootajaxcrud.service.MagSubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
public class MagSubscriptionRestController {
    @Autowired
    MagSubscriptionService magSubscriptionService;

    @GetMapping("/magSubscription")
    public List<MagSubscription> getMagSubscriptionList(){
        return magSubscriptionService.getMagSubscriptionList();
    }

    @GetMapping("/magSubscription/{magSubscriptionId}")
    public MagSubscription getMagSubscription(@PathVariable String magSubscriptionId)
    {
        return magSubscriptionService.getMagSubscriptionById(Integer.parseInt(magSubscriptionId));
    }

    @PostMapping(path = "/magSubscription",consumes = "application/json")
    public MagSubscription addMagSubscription(@RequestBody MagSubscription magSubscription){
        magSubscriptionService.saveOrUpdateMagSubscription(magSubscription);
        return magSubscription;
    }

    @PutMapping(path = "/magSubscription", consumes = "application/json")
    public MagSubscription updateMagSubscription(@RequestBody MagSubscription magSubscription){
        magSubscriptionService.saveOrUpdateMagSubscription(magSubscription);
        return magSubscription;
    }

    @DeleteMapping(value = "/magSubscription/{magSubscriptionId}")
    public ResponseEntity<HttpStatus> deleteMagSubscription(@PathVariable("magSubscriptionId") String magSubscriptionId)
    {
        try{
            magSubscriptionService.deleteMagSubscription(Integer.parseInt(magSubscriptionId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
