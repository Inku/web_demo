package com.ifeng.cms.servlet.cookie;

import com.ifeng.cms.module.Book;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/5/21.
 */
public class SimuDB {
    private static Map<String, Book> map = new LinkedHashMap<>();

    static {
        map.put("1", new Book("1", "javaweb", "老张", "一本好书"));
        map.put("2", new Book("2", "spring", "老赵", "一本好书"));
        map.put("3", new Book("3", "struts", "老钱", "一本好书"));
        map.put("4", new Book("4", "hibernate", "老孙", "一本好书"));
        map.put("5", new Book("5", "ajax", "老李", "一本好书"));
    }

    public static Map<String, Book> getAll() {
        return map;
    }
}
