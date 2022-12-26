package com.pelatro.pelatrocartapp.service;

import java.io.IOException;

import com.pelatro.pelatrocartapp.commonresponse.PelatrocartResponse;
import com.pelatro.pelatrocartapp.entity.Order;


public interface OrderService {

	PelatrocartResponse placeOrder(Order order) throws IOException;
}
