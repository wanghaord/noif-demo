package com.runqing.best.noifdemo.noif;

import com.runqing.best.noifdemo.hasif.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@OrderHandlerType("02")
public class GroupHandler extends AbstractHandler {
    @Override
    String handle(OrderDTO orderDTO) {
        System.out.println("处理团购订单...");
        return "处理团购订单";
    }
}
