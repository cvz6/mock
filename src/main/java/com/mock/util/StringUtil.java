package com.mock.util;

import java.io.*;

/**
 * @author :  peng.liu
 * @description : 字符串工具
 * @date :    2018/7/13 11:09
 */
public class StringUtil {


    /**
     * 去除string的所有空白字符 包括回车，空格，制表符等
     *
     * @param str 字符串
     * @return String
     */
    public static String trimAll(String str) {
        return str.replaceAll("\\s*", "");
    }

    /**
     * 去除指定文件 文件内容的所有空白字符 包括回车，空格，制表符等
     *
     * @param path 文件路径
     * @return String
     */
    public static String trimFile(String path) {
        StringBuilder text = new StringBuilder();
        //读取文件
        File file = new File(path);
        if (file.isFile() && file.exists()) { //判断文件是否存在
            String line = null;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))
            ) {
                while ((line = bufferedReader.readLine()) != null) {
                    text.append(trimAll(line.toString()));  //去除空白字符
                }
                System.out.println(text);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //写回文件
            try (
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))
            ) {
                bufferedWriter.write(text.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.err.println("找不到指定的文件");
        }
        return text.toString();
    }

    /**
     * 读取text文本
     *
     * @param path 文件路径
     * @return String
     */
    public static String readerText(String path) {
        StringBuilder text = new StringBuilder();
        //读取文件
        File file = new File(path);
        if (file.isFile() && file.exists()) { //判断文件是否存在
            String line = null;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))
            ) {
                while ((line = bufferedReader.readLine()) != null) {
                    text.append(line.toString());  //去除空白字符
                }
//                System.out.println(text);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.err.println("找不到指定的文件");
        }
        return text.toString();
    }

    public static void main(String[] args) {
        String s = readerText("target/classes/String.text");
        System.out.println(s);
    }
}
