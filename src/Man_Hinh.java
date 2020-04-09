import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Man_Hinh extends JFrame {
    Ve ve = new Ve();
    Bird chim = new Bird();

    public Man_Hinh()// contructor
    {
        setSize(500,500); // tọa khung cửa sổ kích thước 500x500
        setVisible(true); //hiện khung của java
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // tắt cửa sổ khi không dùng nữa
        setLocation(400,100);// set vị trí trên màn hình
        setResizable(false); //Không cho người dùng thay đổi khung hình
        add(ve);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                chim.giamy();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chim.giamy();
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {
        Man_Hinh mh = new Man_Hinh();

    }
}
