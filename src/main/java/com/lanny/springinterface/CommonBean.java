package com.lanny.springinterface;

import static com.lanny.springinterface.CommonBean.COMMON_BEAN_NAME;

import org.springframework.stereotype.Component;

/**
 * @author Lanny Yao
 * @date 4/15/2019 4:56 PM
 */
@Component(value = COMMON_BEAN_NAME)
public class CommonBean {

    public static final String COMMON_BEAN_NAME = "common_bean";

}
