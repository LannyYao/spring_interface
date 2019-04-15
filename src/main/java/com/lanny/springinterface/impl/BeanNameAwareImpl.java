package com.lanny.springinterface.impl;

import static com.lanny.springinterface.CommonBean.COMMON_BEAN_NAME;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 4/15/2019 5:32 PM
 */
@Slf4j
@Component
public class BeanNameAwareImpl implements BeanNameAware {

    /**
     * if (bean instanceof BeanNameAware) {((BeanNameAware) bean).setBeanName(beanName); }
     */
    @Override
    public void setBeanName(String name) {
        log.info("******* BeanNameAware *******  : Set bean name : {}", name);
    }
}
