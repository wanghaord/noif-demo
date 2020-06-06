package com.runqing.best.noifdemo.noif;

import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * @author wanghao
 * 解析注解获取对应策略类，构造单例Bean并将上一步的信息注入
 */
@Component
public class HandleProcesserVIP implements BeanFactoryPostProcessor, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        ConcurrentMap<String, Class> contextMap = Maps.newConcurrentMap();
        Map<String, Object> beansWithAnnotation = applicationContext.getBeansWithAnnotation(OrderHandlerType.class);
        for (Map.Entry<String, Object> bean : beansWithAnnotation.entrySet()) {
            Object map = bean.getValue();
            OrderHandlerType annotation = map.getClass().getAnnotation(OrderHandlerType.class);
            String value = annotation.value();
            contextMap.put(value, map.getClass());
        }
        HandlerContext handlerContext = new HandlerContext(contextMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), handlerContext);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

}
