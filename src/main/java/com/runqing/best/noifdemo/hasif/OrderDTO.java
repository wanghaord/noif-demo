package com.runqing.best.noifdemo.hasif;

import java.math.BigDecimal;

/**
 * @author wanghao
 * 订单 DTO
 */
public class OrderDTO {
    private String orderNo;
    private String orderName;
    private BigDecimal orderPrice;
    // 订单类型 团购、优惠、促销、普通
    private String orderType;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
