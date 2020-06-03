package myStudy.swing.layoutManager;

import javax.swing.*;
import java.awt.*;

public class Flow {
    public static void main(String[] args) {
        JFrame jf=new JFrame("流式布局");
        jf.setSize(200,250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        JPanel panel=new JPanel(new FlowLayout());

        JButton btn1=new JButton("按钮1");
        JButton btn2=new JButton("按钮1");
        JButton btn3=new JButton("按钮1");
        JButton btn4=new JButton("按钮1");
        JButton btn5=new JButton("按钮1");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
