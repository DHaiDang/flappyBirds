import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ve extends JPanel implements Runnable {
    private Bird chim = new Bird();
    private OngNuoc ongnuoc = new OngNuoc();
    private checkDie check = new checkDie();
    private AddPoint point = new AddPoint();
    private BufferedImage bf ;


    Thread threadVe;
    public Ve()
    {
        threadVe = new Thread(this);
        threadVe.start();
    }
    public void paint(Graphics g)
    {
        try {
            //        // tạo background màu cyan
//        g.setColor(Color.cyan);
//        g.fillRect(0,0,getWidth(),getHeight());
            bf = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\BG.png"));
            g.drawImage(bf,0,0,null);

            // Đặt phần ống nước => run code trước nên phần ống nước sẽ nằm sau phần đất
            ongnuoc.paint(g);
            bf = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\ground.png"));
            g.drawImage(bf,0,325,null);

//            //tạo thảm cỏ màu green
//            g.setColor(Color.green);
//            g.fillRect(0,325,getWidth(),getHeight());
//
//            // set phần đất màu orange
//            g.setColor(Color.orange);
//            g.fillRect(0,350,getWidth(),getHeight());
            //Con CHIMMM
            chim.paint(g);

            // Đặt chữ
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
            g.drawString("Point : "+ point.getPoint(),20 ,30 );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        while (true)
        {
            repaint();  // chạy lại hàm paint bên trên

            ongnuoc.giamX();
            try {
                Thread.sleep(7);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ve.class.getName()).log(Level.SEVERE,null,ex);
            }
            ongnuoc.repeat(); // ống nước chạy lại khi hết 1 chu trình 3 ống
            chim.tangy();// chim bay xuong

            if(check.chet() ==true) threadVe.stop(); // Khi chim vi phạm điều kiện thì dừng game lại

            point.AddPoint();
        }
    }
}
