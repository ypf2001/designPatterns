package com.ypf.design.creatation.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 17:03
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Cloneable {
    private  String name;
    private  String age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = new User();

        return super.clone();
    }
}
