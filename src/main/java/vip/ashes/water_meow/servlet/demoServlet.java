package vip.ashes.water_meow.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "demoServlet", value = "/demoServlet")
public class demoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int width=100;
        int height=50;
        //创建图片对象
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);


        //美化

        //填充背景色
        Graphics graphics=image.getGraphics();//画笔对象
        graphics.setColor(Color.PINK);//设置画笔颜色
        graphics.fillRect(0,0,width,height);//填充矩形
        //画边框
        graphics.drawRect(0,0,width-1,height-1);
        //写验证码
        graphics.setColor(Color.CYAN);//设置画笔颜色
        String str="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        for (int i = 1; i <= 4; i++) {
            Random random=new Random();
            graphics.drawString(str.charAt(random.nextInt(str.length()))+"",width/5*i,height/2);
        }
        //随机画干扰线
        graphics.setColor(Color.BLUE);//设置画笔颜色
        for (int i = 0; i < 5; i++) {
            Random w=new Random();
            Random h=new Random();
            graphics.drawLine(w.nextInt(width),h.nextInt(height),w.nextInt(width),h.nextInt(height));
        }


        //将图片输出到页面
        ImageIO.write(image,"jpg",response.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
