package com.example.completeProject.springbootajaxcrud.restController;


import com.example.completeProject.springbootajaxcrud.entity.Cart;
import com.example.completeProject.springbootajaxcrud.entity.Cart;
import com.example.completeProject.springbootajaxcrud.repository.CartRepository;
import com.example.completeProject.springbootajaxcrud.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CartRestController {
    @Autowired
    CartService cartService;
    
    @GetMapping("/cart")
    public List<Cart> getCartList(){
        return cartService.getCartList();
    }

    @GetMapping("/cart/{cartId}")
    public Cart getCart(@PathVariable String cartId)
    {
        return cartService.getCartById(Integer.parseInt(cartId));
    }

    @PostMapping(path = "/cart",consumes = "application/json")
    public Cart addCart(@RequestBody Cart cart){
        cartService.saveOrUpdateCart(cart);
        return cart;
    }

    @PutMapping(path = "/cart", consumes = "application/json")
    public Cart updateCart(@RequestBody Cart cart){
        cartService.saveOrUpdateCart(cart);
        return cart;
    }

    @DeleteMapping(value = "/cart/{cartId}")
    public ResponseEntity<HttpStatus> deleteCart(@PathVariable("cartId") String cartId)
    {
        try{
            cartService.deleteCart(Integer.parseInt(cartId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
