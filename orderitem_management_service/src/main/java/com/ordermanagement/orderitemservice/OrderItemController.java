package com.ordermanagement.orderitemservice;

import java.util.List;
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
@RequestMapping(value = "/orderItem")
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;

	@RequestMapping(value = "/getOrderItem/{id}", method = RequestMethod.GET)
	public Optional<OrderItem> getOrderItem(@PathVariable int id) {

		Optional<OrderItem> item = orderItemService.getOrderItem(id);

		if (item.isPresent())
			return item;
		else
			throw new OrderNotFoundException("Not Found!");

	}

	@RequestMapping(value = "/saveOrderItem", method = RequestMethod.POST)
	public List<OrderItem> saveOrderItem(@Valid @RequestBody List<OrderItem> orderItems) {
		return orderItemService.saveOrderItem(orderItems);

	}

}
