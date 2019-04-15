package com.lanny.springinterface.impl;

import static com.lanny.springinterface.CommonBean.COMMON_BEAN_NAME;

import java.beans.PropertyDescriptor;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 该接口继承了BeanPostProcess接口，并在此的基础上又增加了3个方法，增加了扩展bean的功能
 * postProcessBeforeInstantiation->postProcessAfterInstantiation->postProcessPropertyValues
 * ->postProcessBeforeInitialization->@PostConstruct注解修饰的方法（如果有的话）->postProcessAfterInitialization
 *
 * @author Lanny Yao
 * @date 4/15/2019 5:05 PM
 */
@Slf4j
@Component
public class InstantiationAwareBeanPostProcessorImpl implements InstantiationAwareBeanPostProcessor {

    /**
     * 所有bean实例化之前
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if (beanName.equals(COMMON_BEAN_NAME)) {
            log.info("******* InstantiationAwareBeanPostProcessor ******* : common bean is instantiating");
        }

        return null;
    }

    /**
     * 所有bean实例化之后
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

        if (beanName.equals(COMMON_BEAN_NAME)) {
            log.info("******* InstantiationAwareBeanPostProcessor ******* : common bean is instantiated");
        }
        return false;
    }

    /**
     * 所有bean处理属性之前
     */
    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
            String beanName) throws BeansException {

        if (beanName.equals(COMMON_BEAN_NAME)) {
            log.info("******* InstantiationAwareBeanPostProcessor ******* : postProcessPropertyValues");
            log.info("pvs: {}", pvs);
            log.info("pds: {}", Arrays.toString(pds));
        }
        return pvs;
    }

    /**
     * 所有bean初始化之前 同BeanPostProcessImpl，不再打印
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean;
    }

    /**
     * 所有bean初始化之后 同BeanPostProcessImpl，不再打印
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        return bean;
    }
}
