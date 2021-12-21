package array;

//定义一个房间类
public class Room{

    //房间号:如101，102，103
    private int roomNumber;

    //房间类型：单人间，标准间，豪华间
    private String roomType;

    //房间空余状态：空或满，false表示空闲可以被预定，true表示被占用不可以被预订
    private boolean roomState;

    public Room(int roomNumber, String roomType, boolean roomState) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomState = roomState;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isRoomState() {
        return roomState;
    }

    public void setRoomState(boolean roomState) {
        this.roomState = roomState;
    }


    //编程素养：定义一个类时，equals方法应该重写，toString方法也应该重写


    //toString方法不重写时，默认调用内存地址

    public String toString(){

        return "[" + roomNumber + "," + roomType + "," + (roomState ? "占用" : "空闲") + "]";

    }

    //重写equals方法
    public boolean equals(Object obj){

        if(obj == null || !(obj instanceof Room)) return false;
        if(this == obj) return true;

        Room room = (Room)obj;
        return this.getRoomNumber() == room.getRoomNumber();

    }

/*
    //测试一下
    public static void main(String[] args) {

        //测试toString方法改写是否成功，房间编号类型为同一个房间
        Room room = new Room(101,"单人间", false);
        System.out.println(room.toString());

        System.out.println("------------------");

        //println方法打印引用时，会自动调用引用的toString方法
        System.out.println(room);

        //测试equals方法改写是否成功，房间编号类型为同一个房间
        Room room1 = new Room(101,"单人间", false);
        System.out.println(room.equals(room1));

    }
*/

}
