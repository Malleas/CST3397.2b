package com.gcu.topic71b.business;

import com.gcu.topic71b.data.entity.OrderEntity;
import com.gcu.topic71b.data.repository.OrdersRepository;
import com.gcu.topic71b.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersBusinessService {

    @Autowired
    private OrdersRepository ordersRepository;

    public OrdersBusinessService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<OrderModel> getAllOrders(){
        List<OrderEntity> orderEntities = ordersRepository.findAll();
        List<OrderModel> orders = new ArrayList<>();
        for(OrderEntity order : orderEntities){
            orders.add(new OrderModel(order.getId(), order.getOrderNo(), order.getProductName(), order.getPrice(), order.getQuantity()));
        }
        return orders;
    }
}
