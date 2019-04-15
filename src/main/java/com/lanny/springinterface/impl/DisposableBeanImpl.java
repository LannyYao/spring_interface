package com.lanny.springinterface.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * 在关闭容器前做一些操作
 * @author Lanny Yao
 * @date 4/15/2019 6:25 PM
 */
@Slf4j
@Component
public class DisposableBeanImpl implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        log.info("******* DisposableBean ******* : destroy");
    }
}
