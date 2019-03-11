package com.spring.aop;

import cn.hutool.core.util.ImageUtil;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 94921 on 2019/3/11.
 */
@Aspect
public class ImageHandler {
    private static final Logger logger= LoggerFactory.getLogger(ImageCopy.class);
@Pointcut("execution(* com.spring.aop.ImageCopy.copyImage())")
    public void handleImage(){

}
@Before(value = "handleImage()")
    public void pressTextOnImage() throws IOException{
        logger.info("开始给图片添加水印");
    File srcFile=new File("D:/bg.jpg");
    //创建一个Buffered
    InputStream input=new FileInputStream(srcFile);
    BufferedImage image= ImageIO.read(input);
    int width=image.getWidth();
    int height=image.getHeight();
    System.out.println("原图宽:"+width+",原图高:"+height);
    File destFile=new File("D:/bg1.jpg");
    Color color=new Color(211,71,38);
    int size=30;
    Font font=new Font("微软雅黑",Font.BOLD,size);
    String text="Jay Chou";
    ImageUtil.pressText(srcFile,destFile,"Wei Xin",color,font,(width-text.length()* size)/2,height/2-size,1.0f);

}
@AfterReturning("handleImage()")
    public void grayImage(){
        logger.info("开始将图片转黑白");
    File srcFile=new File("F:/bg1.jpg");
    File destFile=new File("F:/bg2.jpg");
    ImageUtil.gray(srcFile,destFile);

}
}
