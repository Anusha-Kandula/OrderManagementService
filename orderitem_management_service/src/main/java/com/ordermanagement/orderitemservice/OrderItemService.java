package com.ordermanagement.orderitemservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
	
	@Autowired
	OrderItemRepository orderItemRepository;
	
	public Optional<OrderItem> getOrderItem(int orderId){
		return orderItemRepository.findById(orderId);
	}
	
	public List<OrderItem> saveOrderItem(List<OrderItem> orderItems){
		return   orderItemRepository.saveAll(orderItems);
	}

}
