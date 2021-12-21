package com.company;

import java.awt.*;

public class Bg {

    //载入背景
    Image bg1 = Toolkit.getDefaultToolkit().getImage("imgs/bg1.jpg");
    Image bg = Toolkit.getDefaultToolkit().getImage("imgs/bg.jpg");
    Image peo = Toolkit.getDefaultToolkit().getImage("imgs/peo.jpg");

    void paintSelf(Graphics g){
        //传入画笔
        g.drawImage(bg1,0,0,null);
        g.drawImage(bg,0,200,null);
        g.drawImage(peo,310,90,null);
    }

}
