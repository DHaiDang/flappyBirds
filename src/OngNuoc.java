import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class OngNuoc extends JPanel {
    private static int x1=500,x2=x1+180,x3=x2+180;
    private static int h1,h2,h3;
    private static boolean bl1=false,bl2=false,bl3=false;
    private BufferedImage cottren,cotduoi;

    public static int getX1() {
        return x1;
    }

    public static int getX2() {
        return x2;
    }

    public static int getX3() {
        return x3;
    }

    public static int getH1() {
        return h1;
    }

    public static int getH2() {
        return h2;
    }

    public static int getH3() {
        return h3;
    }

//    public static int getH4() {
//        return h4;
//    }

    public void ngauNhien()
    {
        Random rd = new Random();
        if(bl1==false){h1 = rd.nextInt(200); bl1 = true;}

        if(bl2==false){h2 = rd.nextInt(200); bl2 = true;}

        if(bl3==false){h3 = rd.nextInt(200); bl3 = true;}

    }
    public void paint(Graphics g)
    {
        ngauNhien();
        try {
            cottren = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cottren.png"));
            g.drawImage(cottren,x1,0,65,h1,null);
            cotduoi = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cotduoi.png"));
            g.drawImage(cotduoi,x1,h1+100,65,250,null);

            cottren = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cottren.png"));
            g.drawImage(cottren,x2,0,65,h2,null);
            cotduoi = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cotduoi.png"));
            g.drawImage(cotduoi,x2,h2+100,65,250,null);

            cottren = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cottren.png"));
            g.drawImage(cottren,x3,0,65,h3,null);
            cotduoi = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\cotduoi.png"));
            g.drawImage(cotduoi,x3,h3+100,65,250,null);


        } catch (IOException e) {
            e.printStackTrace();
        }


//        // ống nước 1bên trên
//        g.setColor(Color.green);
//        g.fillRect(x1,0,65,h1);
//        // ống nước bên dưới
//        g.setColor(Color.green);
//        g.fillRect(x1,h1 +100,65,2`50);
//
//        // ống nước 1bên trên
//        g.setColor(Color.green);
//        g.fillRect(x2,0,65,h2);
//        // ống nước bên dưới
//        g.setColor(Color.green);
//        g.fillRect(x2,h2+100,65,250);
//
//        // ống nước 1bên trên
//        g.setColor(Color.green);
//        g.fillRect(x3,0,65,h3);
//        // ống nước bên dưới
//        g.setColor(Color.green);
//        g.fillRect(x3,h3+100,65,250);
    }
    public void giamX()
    {
        x1--;
        x2--;
        x3--;
    }
    public void repeat()
    {
        if(x1==-50) {x1=500;bl1 = false;}
        if(x2==-50) {x2=500;bl2=false;}
        if(x3==-50) {x3=500;bl3=false;}
    }
}
