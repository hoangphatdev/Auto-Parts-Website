package com.vku.autoparts_api.controller;


import com.vku.autoparts_api.model.Cart;
import com.vku.autoparts_api.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Test {
    CartService cartService;
    public Test(CartService cartService) {
        this.cartService = cartService;
    }
    @GetMapping("/v2")
    public ResponseEntity<String> test(){
        Cart cart = new Cart();
        cartService.addCart(cart);
       return ResponseEntity.ok("Success");
    }
}
