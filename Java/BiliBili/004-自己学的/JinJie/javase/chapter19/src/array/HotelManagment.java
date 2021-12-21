package array;

import java.util.Scanner;

public class HotelManagment {

    public static void main(String[] args) {
        System.out.println("欢迎使用酒店管理系统，请认真查阅以下使用说明");
        System.out.println("功能编号，【1】查看房间列表，【2】订房，【3】退房，【0】退出");

//创建酒店对象
        Hotel h = new Hotel();
        for (int count = 1 ; count < 100000000; count++){

            Scanner s = new Scanner(System.in);
            System.out.print("请输入功能编号:");
            int input = s.nextInt();

            if (input == 1){
                //打印房间信息
                h.print();
            }else if (input == 2){
                //订房
                System.out.print("请输入要订的房间编号:");
                int orderNumber = s.nextInt();
                h.checkIn(orderNumber);
            }else if (input == 3){
                //退房
                System.out.print("请输入要退的房间编号:");
                int checkOutNumber = s.nextInt();
                h.checkOut(checkOutNumber);
            }else if (input == 0){
                //退出
                System.out.println("已退出，欢迎下次使用。");
                break;
            }
        }

    }

}
