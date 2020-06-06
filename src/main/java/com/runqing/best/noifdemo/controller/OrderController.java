package com.runqing.best.noifdemo.controller;

import com.runqing.best.noifdemo.hasif.OrderDTO;
import com.runqing.best.noifdemo.noif.VIPOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private VIPOrderServiceImpl vipOrderService;

    @RequestMapping("/test")
    public String test(@RequestParam("orderType") String orderType) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderType(orderType);
        return vipOrderService.orderHandle(orderDTO);
    }
}
