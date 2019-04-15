package com.lanny.springinterface.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 4/15/2019 5:45 PM
 */
@Component
@Slf4j
public class BeanFactoryAwareImpl implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("******* BeanFactoryAware ******* : setBeanFactory");
    }
}
