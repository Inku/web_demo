package com.ifeng.cms.module;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/12.
 */
public class PersonTest {

    @Test
    public void testBeanUtil() throws Exception {
        Person p = new Person();
        BeanUtils.setProperty(p, "name", "bean name");

        System.out.println(p.getName());

    }
}