package com.adilgadirov.orderservice.service;

import com.adilgadirov.orderservice.dto.OrderLineItemsDto;
import com.adilgadirov.orderservice.dto.OrderRequest;
import com.adilgadirov.orderservice.mapper.OrderMapper;
import com.adilgadirov.orderservice.model.Order;
import com.adilgadirov.orderservice.model.OrderLineItems;
import com.adilgadirov.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMapper orderMapper;
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDtoList()
                .stream()
                .map(orderLineItemsDto -> orderMapper.mapToDto(orderLineItemsDto))
                .toList();

        order.setOrderLineItemsList(orderLineItems);
    }


}
