package com.example.demo.Services;


import com.example.demo.Entity.Order;
import com.example.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> placeOrders(List<Order> order) {
        // Add any additional logic here (e.g., validation)
        return orderRepository.saveAll(order);
    }



    public void cancelOrder(Long id) {
        // Add any additional logic here (e.g., check if order exists before canceling)
        orderRepository.deleteById(id);
    }

    public Order getOrderById(Long id) {

        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public Order updateOrder(Long id, Order order) {

        return order;
    }
}
