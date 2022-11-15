package com.d1eamf01._2022_11_10;

import java.io.*;

public class Test03 {
    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream(new FileOutputStream("D:\\D1EamF01\\Desktop\\output.txt"){
            {
                String str = "这是由ps创建的文件\n";
                byte[] bytes = str.getBytes();
                write(bytes);
            }
        });
            PrintStream ps2 = new PrintStream(new FileOutputStream(new File("D:\\D1EamF01\\Desktop\\output.txt"),true))) {
            ps2.printf("ps2追加：签到喊我");
        }
        catch (FileNotFoundException fnfe){
            System.out.println("没有文件，下次一定");
        }
        catch (IOException ioe){
            System.out.println("输入出错");
        }
    }
}
