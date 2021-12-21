package array;
/*
定义一个酒店类
 */
public class Hotel {

    private Room[][] rooms = new Room[3][10];//酒店楼层数和房间号分别为3和10

    //创建酒店对象时遍历二维数组
    public Hotel() {

        for(int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[i].length; j++){
                //小细节：一层时i为0，而不是1
                if(i == 0){
                    //一层
                    rooms[i][j] = new Room((i+1)*100 + j,"单人间",false);
                }else if (i == 1){
                    //二层
                    rooms[i][j] = new Room((i+1)*100 + j,"标准间",false);
                }else if(i == 2){
                    //三层
                    rooms[i][j] = new Room((i+1)*100 + j,"豪华间",false);
                }
            }
        }

    }

/*    //遍历二维数组
    public hotel(){
        for(int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[i].length; j++){
                //小细节：一层时i为0
                if(i == 0){
                    //一层
                    rooms[i][j] = new Room((i+1)*100 + j,"单人间",false);
                }else if (i == 1){
                    //二层
                    rooms[i][j] = new Room((i+1)*100 + j,"标准间",false);
                }else if(i == 2){
                    //三层
                    rooms[i][j] = new Room((i+1)*100 + j,"豪华间",false);
                }
            }
        }
    }*/

    //打印所有房间状态
    public void print() {

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                //System.out.println("[" + rooms[i][j].getRoomNumber() + "," + rooms[i][j].getRoomType() + "," + (rooms[i][j].isRoomState() ? "占用" : "空闲") + "]");
                System.out.println(rooms[i][j]);
            }
            System.out.println("----------------------------------------");
        }

    }

    //定义订房方法：把roomState变成true则订房成功
    //先选房、再查询是否被订、再告知订房结果
    public void checkIn(int checkInNumber){

        int i = checkInNumber/100 - 1;
        int j = checkInNumber%100;
        if(rooms[i][j].isRoomState() == false ){
            System.out.println(rooms[i][j].getRoomType() + rooms[i][j].getRoomNumber() + "预定成功");
            //修改为被预定
            rooms[i][j].setRoomState(true);
        }else{
            System.out.println(rooms[i][j].getRoomType() + rooms[i][j].getRoomNumber() + "预定失败，已被预定");
        }
    }

    //定义退房方法：把roomState变成false则订房成功
    //先选房、再查询是否被订、再告知订房结果
    public void checkOut(int checkOutNumber){

        int i = checkOutNumber/100 - 1;
        int j = checkOutNumber%100;
        if(rooms[i][j].isRoomState() == false ){
            System.out.println(rooms[i][j].getRoomType() + rooms[i][j].getRoomNumber() + "未被预定，退房失败");
        }else{
            //修改为空闲
            rooms[i][j].setRoomState(false);
            System.out.println(rooms[i][j].getRoomType() + rooms[i][j].getRoomNumber() + "退房成功");
        }
    }

    //遍历二维数组，老思路
    //存在问题：创建对象后给对象的属性赋值，没有想到用调构造方法

    //比较好的思路：可以用户自定义酒店楼层数和房间号
    //动态初始化
 /*       for (int i = 0; i < room.length; i++){

            for (int j = 0; j < room[i].length; j++){

                System.out.println(room[i][j]);
                System.out.println("-------------------------------------------------------------------");

//              int room[i][j].roomNumber = i*100 + j;

                //创建房间对象
                Room Room = room[i][j];

                //初始化房间属性：房间号
                room[i][j].roomNumber = i*100 + j;

                //初始化房间属性：房间类型
                //每一层楼1-2号房间为单人间，3-6为标准间，7-9为豪华间
                if( j < 3){

                    room[i][j].roomType = "单人间";

                }else if (j < 7){

                    room[i][j].roomType = "标准间";

                }else {

                    room[i][j].roomType = "豪华间";

                }


                //没必要初始化，因默认初始值为false
                //初始化房间属性：房间空余状态
                Room.roomState = false;


                //输出初始化的值
                System.out.println(room[i][j].roomNumber);
                System.out.println(room[i][j].roomType);
                System.out.println(room[i][j].roomType);

                System.out.println("-------------------------------------------------------");
            }
        }*/
}
