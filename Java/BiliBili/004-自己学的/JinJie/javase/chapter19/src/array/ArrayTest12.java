package array;
/*
动态初始化二维数组
 */
public class ArrayTest12 {

    public static void main(String[] args) {

        int[][] array = new int[2][3];

        for(int i = 0; i < array.length; i++ ){

            for (int j = 0; i < array[i].length; j++ ){

                System.out.println(array[i][j]);

            }

        }

    }
}
