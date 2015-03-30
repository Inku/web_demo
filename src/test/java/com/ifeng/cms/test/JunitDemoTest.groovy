package com.ifeng.cms.test

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/3/30.
 */
class JunitDemoTest extends GroovyTestCase {
    def jd = new JunitDemo();
    void testEat() {
        jd.eat()
    }

    void testRun() {
        jd.run();
    }
}
