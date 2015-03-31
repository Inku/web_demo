package com.ifeng.cms.test.xml;

import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParserFactory;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/30.
 */
public class SAXDemo {
    private static String str = "src/main/webapp/dtdDemo.xml";

    public static void main(String[] args) throws Exception {
        XMLReader reader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();

        reader.setContentHandler(new MyContentHandler());
        reader.parse(str);
    }
}
