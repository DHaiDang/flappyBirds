import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bird extends JPanel {
    private static int y = 150;
    private static int x = 150;
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
    private BufferedImage birdI;
    public void paint(Graphics g)
    {
        try {
            birdI = ImageIO.read(new File("D:\\Code\\Java\\javagame\\Flappybird\\Images\\Chim1.png"));
            g.drawImage(birdI,x,y,null);
        } catch (IOException e) {

        }

//        g.setColor(Color.red);
//        g.fillOval(x,y,20,20);
    }
    // chim bay xuong
    public void tangy()
    {
        y++;
    }
    // chim bay len
    public void giamy()
    {
        y-=40;
    }
}
