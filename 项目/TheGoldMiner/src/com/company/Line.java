package com.company;

import java.awt.*;

/**
 * 红线绘制
 */
public class Line {
    //起点坐标
    int x = 360;
    int y = 170;
    //终点坐标
    int endx = 500;
    int endy = 500;

    //线长
    double length = 100;
    //角度
    double n = 0;
    //方向
    int dir = 1;
    //设置红线状态:1为向下抓取，2为摇摆，3为收回
    int state;

    void paintSelf(Graphics g){

        switch (state){
            case 2:
                //设置线颜色
                g.setColor(Color.red);
                g.drawLine(x,y,endx,endy);
                //设置线段终点坐标
                n = n + 0.005*dir;
                endx = (int) (x + length*Math.cos(n*Math.PI));
                endy = (int) (y + length*Math.sin(n*Math.PI));
                //设置线段方向，到达终点后线段返回
                if (n < 0.1){
                    dir = 1;
                }else if ((n > 0.9)){
                    dir = -1;
                }
                break;
            case 1:
                //设置线长范围
                if (length < 500){
                    length = length +10;
                    //设置线段终点坐标
                    endx = (int) (x + length*Math.cos(n*Math.PI));
                    endy = (int) (y + length*Math.sin(n*Math.PI));
                }else {state = 0;}
                break;

        }
    }

}
