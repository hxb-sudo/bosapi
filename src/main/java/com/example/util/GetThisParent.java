package com.example.util;

import java.io.File;
import java.net.URL;

public class GetThisParent {

    /**
     * @描述 获取资源路径
     * @参数 c：类对象,b：指定级别（1表示自己，2表示上一级...）
     * */
    public static String getPath(Class c,int b){
        URL resource = c.getResource("/");
        File fe = new File(String.valueOf(resource));
        String filePath = "";
        for (int i = 1; i < b; i++) {
            fe = fe.getParentFile();
        }
        filePath = fe.getParent();
        /**
         * windows运行 如： file:\C:\Users\hxb\IdeaProjects
         * 所以需要取C的下标截取为 C:\Users\hxb\IdeaProjects 的字符串
         * */
        int index = filePath.indexOf("\\") + 1;

        /**
         * linux运行 如：jar:file:/usr/test
         * 所以需要取第一个':'的下标截取为 /usr/test 的字符串
         * */
        if (index==0){
            index = filePath.indexOf("/");
        }

        return filePath.substring(index);
    }

}
