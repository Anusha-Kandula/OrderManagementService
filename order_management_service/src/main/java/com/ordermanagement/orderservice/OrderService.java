package com.ordermanagement.orderservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermanagement.orderitemservice.OrderItem;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	OrderItemClient orderItemClient;

	public Optional<Order> getOrder(int orderId) {
		return orderRepository.findById(orderId);
	}

	public Order saveOrder(Order order) {
		
		List<OrderItem> orderItems = order.getOrderItems();
		orderItemClient.saveOrderItem(orderItems);
		
		return orderRepository.save(order);
	}

}
