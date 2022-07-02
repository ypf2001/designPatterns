package com.ypf.design.structural.adapter;

/**
 * @program: design-patterns
 * @author: yanpengfan
 * @create: 2022-07-02 20:32
 **/
public class JPMoviePlayer  implements Player{
    private Player player;
    private Translator translator = new Translator();

    public JPMoviePlayer(Player player) {
        this.player = player;
    }

    @Override
    public void play(String str) {
        System.out.println(translator.translate(str));
    }
}
