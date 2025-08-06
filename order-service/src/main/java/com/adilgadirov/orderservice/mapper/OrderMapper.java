package com.adilgadirov.orderservice.mapper;

import com.adilgadirov.orderservice.dto.OrderLineItemsDto;
import com.adilgadirov.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

@Service
public class OrderMapper {
    public OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItems.getQuantity());
        orderLineItems.setSkuCode(orderLineItems.getSkuCode());
        return orderLineItems;
    }
}
