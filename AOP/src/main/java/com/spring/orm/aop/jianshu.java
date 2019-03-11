package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

/**
 * Created by 94921 on 2019/3/11.
 */
public class jianshu {
    // 生成指定url对应的二维码到文件，宽和高都是300像素
    public static void main(String[] args) {
        QrConfig config=new QrConfig(300,300);
        config.setMargin(3);
        Color foreColor=new Color(94, 194, 209);
        Color bgColor=new Color(252, 215, 162);
        int foreColorRGB=foreColor.getRGB();
        int bgColorRGB=bgColor.getRGB();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        config.setImg("D:/jianshu1.png");
        QrCodeUtil.generate("https://www.jianshu.com/u/4b3578827837",
                config,
                FileUtil.file("D:/jianshu.jpg")//写出到的文件
        );



    }
}
