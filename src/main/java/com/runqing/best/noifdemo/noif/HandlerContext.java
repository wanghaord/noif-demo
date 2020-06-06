package com.runqing.best.noifdemo.noif;

import com.google.common.base.Preconditions;

import java.util.Map;

/**
 * @author wanghao
 * Context：策略环境
 */
public class HandlerContext {

    /**
     * 用于获取标有注解OrderType的策略实现类以key、value形式保存在handlerMap
     * key:   注解中的值
     * value：该注解对应策略实现类
     */
    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    /**
     * 持有抽象策略，自动选择对应处理策略，供客户端调用
     * @param type  用户订单类型
     * @return
     */
    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        Preconditions.checkArgument(clazz != null, "类型参数异常");
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
