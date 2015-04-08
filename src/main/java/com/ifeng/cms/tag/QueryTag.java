package com.ifeng.cms.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;
import java.sql.*;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/7.
 */
public class QueryTag extends SimpleTagSupport {
    private String driver;
    private String url;
    private String user;
    private String pass;
    private String sql;

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ResultSetMetaData rsmd = null;

    @Override
    public void doTag() throws JspException, IOException {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            Writer out = getJspContext().getOut();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
