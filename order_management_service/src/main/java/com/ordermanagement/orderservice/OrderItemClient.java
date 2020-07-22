package com.ordermanagement.orderservice;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ordermanagement.orderitemservice.OrderItem;

@FeignClient(name="ORDERITEMSERVICE" /*, url = "http://localhost:8080/orderItem"*/)
public interface OrderItemClient {
	
	@RequestMapping(value = "/orderItem/saveOrderItem", method = RequestMethod.POST, consumes = "application/json")
	public List<OrderItem> saveOrderItem(@Valid @RequestBody List<OrderItem> orderItems);
	
	@RequestMapping(value = "/getOrderItem/{id}", method = RequestMethod.GET)
	public Optional<OrderItem> getOrderItem(@PathVariable(value = "id") int id);
}
