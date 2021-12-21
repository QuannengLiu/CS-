package array;
/*
遍历二维数组
 */
public class ArrayTest11 {

    public static void main(String[] args) {
        String[][] array = {

                {"张三","李四","王五"},
                {"123","ab"}

        };

        //一维遍历
        for(int i = 0; i < array.length; i++){

            System.out.println(array[i].length);
            System.out.println(array[i]);

        }
        System.out.println("-----------------------------------------------------");
        //二维遍历
        for(int i = 0; i < array.length; i++){

            for (int j = 0 ; j < array[i].length; j++){

                System.out.println(array[i][j]);

            }


        }

    }
}
