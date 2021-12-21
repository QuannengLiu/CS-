public class Test05 {

    public static void main(String[] args) {
//        Address a = new Address( "重庆","沙坪坝区","123456" );
        User u1 = new User("张三",new Address( "重庆","沙坪坝区","123456" ));
        User u2 = new User("张三",new Address( "重庆","沙坪坝区","123456" ));
        User u3 = new User("张三",new Address( "重庆","巴南区","123456" ));
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
    }

}

class User{

    String name;
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //当用户名与地址全部相同时，认定为同一个用户
    public boolean equals(Object obj){

        if(obj == null || !(obj instanceof User)) return false;
        if(this == obj) return true;

        User u = (User) obj;

 //     if( this.name == u.name && this.addr == u.addr    ) return true;
//      里面的addr里的equals也要重写
        if( this.name.equals(u.name) && this.addr.equals(u.addr)  ) return true;
        return false;

    }
}

class Address{


    String city;
    String street;
    String zipcode;

    public Address(){
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Address)) return false;
        if (this == obj) return true;

        Address u = (Address) obj;

        //此处的String的equals已经被重写了
        if (this.city == u.city && this.street == u.street && this.zipcode == u.zipcode) return true;
        return false;
    }



}