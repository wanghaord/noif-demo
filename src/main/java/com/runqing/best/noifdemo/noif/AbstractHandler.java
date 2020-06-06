package com.runqing.best.noifdemo.noif;

import com.runqing.best.noifdemo.hasif.OrderDTO;

/**
 * @author wanghao
 * 策略抽象类，用来定义所有订单类型操作
 */
public abstract class AbstractHandler {
    abstract String handle(OrderDTO orderDTO);
}
