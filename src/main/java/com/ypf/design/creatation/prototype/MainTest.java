package com.ypf.design.creatation.prototype;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 16:59
 **/
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestMybatis mybatis1 = new TestMybatis();

        User zhangsan = mybatis1.getUser("zhangsan");

        System.out.println(zhangsan);
        User zhangsan2 = mybatis1.getUser("zhangsan");
        zhangsan2.setAge("23");
        System.out.println(zhangsan2);
        User zhangsan3 = mybatis1.getUser("zhangsan");
        System.out.println(zhangsan3);
    }

}
