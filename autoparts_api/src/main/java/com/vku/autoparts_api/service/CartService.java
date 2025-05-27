package com.vku.autoparts_api.service;

import com.vku.autoparts_api.model.Cart;
import com.vku.autoparts_api.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private CartRepository cartRepo;
    public CartService(CartRepository cartRepo) {
        this.cartRepo = cartRepo;
    }

    public void addCart(Cart cart){
        cartRepo.save(cart);
    }

}
