package com.ifeng.cms.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Date;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/7.
 */
public class HelloWorldTag extends SimpleTagSupport{
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Hello World " + new Date());
    }
}
