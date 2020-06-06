package com.runqing.best.noifdemo.noif;

import com.runqing.best.noifdemo.hasif.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@OrderHandlerType("01")
public class NomalHandler extends AbstractHandler{
    @Override
    String handle(OrderDTO orderDTO) {
        System.out.println("处理普通订单...");
        return "处理普通订单...";
    }
}
