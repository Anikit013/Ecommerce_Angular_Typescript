package com.pelatro.pelatrocartapp.service;

import org.springframework.stereotype.Service;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.dto.CartItemDto;
import com.pelatro.pelatrocartapp.entity.Cart;
import com.pelatro.pelatrocartapp.entity.Users;

public interface CartService {
	
	PelatrocartResponse addToCart(Cart cart);
	//PelatrocartResponse getCartByUserId(int id);

	CartItemDto listCartItems(int userid);
	
	//void updateQtyByCartId(long cartId,int qty,double price) throws Exception;

}
