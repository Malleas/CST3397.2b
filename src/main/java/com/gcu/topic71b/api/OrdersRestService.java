package com.gcu.topic71b.api;

import com.gcu.topic71b.business.OrdersBusinessService;
import com.gcu.topic71b.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service")
public class OrdersRestService {

    @Autowired
    OrdersBusinessService ordersBusinessService;

    @GetMapping("/orders")
    public ResponseEntity<?> getOrders(){
        try {
            List<OrderModel> orders = ordersBusinessService.getAllOrders();
            if(orders == null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }else {
                return new ResponseEntity<>(orders, HttpStatus.OK);
            }
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
