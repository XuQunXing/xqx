package myStudy.swing.layoutManager;

import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void main(String[] args) {
        JFrame jf=new JFrame("网格布局");
        jf.setSize(200,250);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        /**
         * 创建三行三列的网格布局
         */
        GridLayout gridLayout=new GridLayout(3,3);
        /*gridLayout.setColumns(10);
        gridLayout.setVgap(10);*/

        JPanel panel=new JPanel(gridLayout);

        JButton btn1=new JButton("按钮1");
        JButton btn2=new JButton("按钮2");
        JButton btn3=new JButton("按钮3");
        JButton btn4=new JButton("按钮4");
        JButton btn5=new JButton("按钮5");
        JButton btn6=new JButton("按钮6");
        JButton btn7=new JButton("按钮7");
        JButton btn8=new JButton("按钮8");

        //如果是6个的话，会显示三行两列
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
