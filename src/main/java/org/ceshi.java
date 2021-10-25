package org;

public class ceshi {
    public static void main(String[] args) {

        GiTa giTa = new GiTa();
        GangQin gangQin = new GangQin();

        YueShou yueShou = new YueShou();
        yueShou.play(giTa);
        yueShou.play(gangQin);
    }
}
