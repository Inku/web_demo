package com.ifeng.cms.test.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/30.
 */
public class Dom4jDemo {
    private static String str = "src/main/webapp/dtdDemo.xml";

    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(str);
        Element root = document.getRootElement();

        System.out.println(document.selectNodes("//PRICE"));
    }
}
