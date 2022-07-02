package com.ypf.design.creatation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:00
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class phone {
    private String cpu;
    private String mem;
    private String disk;
    private String cam;
}
