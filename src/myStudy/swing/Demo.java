package myStudy.swing;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        /**
         * 1.创建一个顶层容器（窗口）
         */
        //创建窗口
        JFrame jf = new JFrame("表白");
        //设置窗口大小
        jf.setSize(250,250);
        //把窗口位置设置到屏幕中心
        jf.setLocationRelativeTo(null);
        //当点击窗口的关闭按钮的时候推出程序。（如果没有这句话程序不会退出）
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /**
         * 2。创建中间容器（面板容器）
         */
        //创建面板容器，使用默认的布局管理器
        JPanel panel=new JPanel();

        /**
         * 3.创建一个基本组件按钮，并添加到面板容器中
         */
        JTextField textField=new JTextField("小姐姐，你愿意做我女朋友吗？");
        JButton btn=new JButton("愿意");
        JButton btn1=new JButton("不愿意");
        panel.add(textField);
        panel.add(btn);
        panel.add(btn1);

        /**
         * 4.吧面板容器作为窗口的内容面板设置到窗口
         */
        jf.setContentPane(panel);

        /**
         * 5.显示窗口，前面创建的信息都存在内存中，通过jf.setVisible（true）把内存中的信息显示屏幕上
         */
        jf.setVisible(true);
    }
}
