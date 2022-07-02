package com.ypf.design.structural.adapter;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:32
 **/
public class MainTest {
    public static void main(String[] args) {
        JPMoviePlayer jpMoviePlayer = new JPMoviePlayer(new MoviePlayer());
        jpMoviePlayer.play("123");
    }
}
