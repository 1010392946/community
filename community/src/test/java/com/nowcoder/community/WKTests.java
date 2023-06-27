package com.nowcoder.community;

import java.io.IOException;

/**
 * ClassName: WKTests
 * Package: com.nowcoder.community
 * Description:
 *
 * @Author: Xuan Wang
 * @Creat 2023/6/15 20:56
 * @Version 1.0
 */
public class WKTests{
    public static void main(String[] args) {
        String cmd = "E:/postgraduate/workspace/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com E:/postgraduate/workspace/wkhtmltopdf/wk-images/1.png";
        try {
            Runtime.getRuntime().exec(cmd);
            Thread.sleep(3000);
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
