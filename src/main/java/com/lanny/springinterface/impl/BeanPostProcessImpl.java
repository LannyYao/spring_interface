package com.lanny.springinterface.impl;

import static com.lanny.springinterface.CommonBean.COMMON_BEAN_NAME;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 4/15/2019 4:54 PM
 */
@Slf4j
@Component
public class BeanPostProcessImpl implements BeanPostProcessor {

    /**
     * 所有bean初始化之前
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
//        log.info("-------- Before bean initialization --------");

        if (beanName.equals(COMMON_BEAN_NAME)) {
            log.info("******* BeanPostProcessor ******* : common bean is creating");
        }

        return bean;
    }

    /**
     * 所有bean初始化之后
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
//        log.info("-------- After bean initialization --------");

        if (beanName.equals(COMMON_BEAN_NAME)) {
            log.info("******* BeanPostProcessor ******* : common bean is created");
        }

        return bean;
    }
}
