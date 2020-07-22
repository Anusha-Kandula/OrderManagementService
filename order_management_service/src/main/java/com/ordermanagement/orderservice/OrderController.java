package com.ordermanagement.orderservice;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ordermanagement.util.OrderNotFoundException;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value = "/getOrder/{id}", method = RequestMethod.GET)
	public Optional<Order> getOrder(@PathVariable int id){
		
		Optional<Order> order = orderService.getOrder(id);
		
		if(order.isPresent())
			return order;
		else	
			throw new OrderNotFoundException("Not Found!");
		
	}
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public Order saveOrder(@Valid @RequestBody Order order){
		return orderService.saveOrder(order);
		
	}

}
