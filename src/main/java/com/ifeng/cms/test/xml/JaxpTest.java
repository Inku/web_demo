package com.ifeng.cms.test.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/30.
 */
public class JaxpTest {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        File file = new File("src/main/webapp/dtdDemo.xml");

        Document document = builder.parse(file);
        NodeList nodeList = document.getElementsByTagName("PRICE");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            node.setTextContent("text");

            TransformerFactory.newInstance().newTransformer().transform(new DOMSource(document),new StreamResult(file));
            System.out.println(node.getTextContent());
        }
    }
}
