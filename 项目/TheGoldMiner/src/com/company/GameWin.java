package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 创建窗口
 */

public class GameWin extends JFrame {

    //创建背景对象
    Bg bg1 = new Bg();
    Bg bg = new Bg();
    Bg peo = new Bg();
    Line line = new Line();

    //绘制方法
    public void paint(Graphics g){
        bg.paintSelf(g);
        line.paintSelf(g);
    }

    //初始化窗口信息
    void launch(){
        //        设置窗口可见
        this.setVisible(true);
        //        设置窗口尺寸
        this.setSize(768,1000);
        //        设置窗口居中
        this.setLocationRelativeTo(null);
        //        设置窗口标题
        this.setTitle("尚学堂黄金矿工");
        //        设置关闭窗口的方法
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /*
        设置鼠标事件 :点击
        红线状态:鼠标左键0为摇摆，鼠标左键1为向下抓取，鼠标左键2为收回

         */
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == 1){ line.state = 1; }
                else if(e.getButton() == 2){ line.state = 2; }
                else if(e.getButton() == 0){ line.state = 0; }
            }
        });


        //让线段不停的动
        while (true){
            repaint();

            //间隔10ms刷新一次
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }



    //设置主方法
    public static void main(String[] args){
        GameWin gameWin = new GameWin();
        gameWin.launch();
    }

}
