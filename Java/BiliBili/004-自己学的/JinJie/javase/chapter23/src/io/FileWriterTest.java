package io;
/**
 * 学习FileWriter：
 *      1、文件字符输出流。写。
 *      2、只能输出普通文本。
 *
 * @author QUANNENG LIU
 * @Date  2021/12/07
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        //创建
        FileWriter out = null;
        try {
/*            //往file中写入，每次写都要覆盖前面的所有内容
            out = new FileWriter("file");*/
            //往file中写入，每次追加写
            out = new FileWriter("file",true);
            //往数组里添加元素
            char[] chars = {'我','是','中','国','人',',','我','骄','傲'};
            out.write(chars);
            out.write("你好吗，我很好");
            //刷新
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    //关闭
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
