package com.runqing.best.noifdemo.hasif;

import org.springframework.stereotype.Service;

/**
 * @author wanghao
 * @describe 传统方法使用equals判断类型，会有一堆if-else
 */
@Service
public class OrderServiceImpl implements IOrderSerive{

    @Override
    public String orderHandle(OrderDTO orderDTO) {
        // 不同订单类型走不同的处理逻辑，伪代码
        String orderType = orderDTO.getOrderType();
        if ("01".equals(orderType)) {
            System.out.println("普通订单处理中...");
        } else if ("02".equals(orderType)) {
            System.out.println("团购订单处理中...");
        } else if ("03".equals(orderType)) {
            System.out.println("优惠订单处理中...");
        } else if ("04".equals(orderType)) {
            System.out.println("促销订单处理中...");
        }
        return null;
    }

}
