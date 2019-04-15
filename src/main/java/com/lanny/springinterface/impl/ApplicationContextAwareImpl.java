package com.lanny.springinterface.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 4/15/2019 5:44 PM
 */
@Slf4j
@Component
public class ApplicationContextAwareImpl implements ApplicationContextAware{

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("******* ApplicationContextAware ******* : setApplicationContext");
    }
}
