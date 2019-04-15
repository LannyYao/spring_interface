package com.lanny.springinterface.impl;

import static com.lanny.springinterface.CommonBean.COMMON_BEAN_NAME;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Spring允许在Bean创建之前，读取Bean的元属性，并根据自己的需求对元属性进行改变
 * @author Lanny Yao
 * @date 4/15/2019 5:51 PM
 */
@Slf4j
@Component
public class BeanFactoryPostProcessorImpl implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("******* BeanFactoryPostProcessor *******  : postProcessBeanFactory");

        BeanDefinition bean = beanFactory.getBeanDefinition(COMMON_BEAN_NAME);
        log.info("******* BeanFactoryPostProcessor *******  bean class name : {}", bean.getBeanClassName());
        log.info("******* BeanFactoryPostProcessor *******  bean scope : {}", bean.getScope());
        log.info("******* BeanFactoryPostProcessor *******  bean description : {}", bean.getDescription());
    }
}
