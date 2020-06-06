package com.runqing.best.noifdemo.noif;

import com.runqing.best.noifdemo.hasif.IOrderSerive;
import com.runqing.best.noifdemo.hasif.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghao
 * 策略模式下订单处理器
 */
@Service
public class VIPOrderServiceImpl implements IOrderSerive {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String orderHandle(OrderDTO orderDTO) {
        AbstractHandler handler = handlerContext.getInstance(orderDTO.getOrderType());
        return handler.handle(orderDTO);
    }
}
