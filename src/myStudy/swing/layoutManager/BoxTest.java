package myStudy.swing.layoutManager;

import javax.swing.*;

public class BoxTest {
    public static void main(String[] args) {
            JFrame jf = new JFrame("测试窗口");
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            JButton btn01 = new JButton("Button01");
            JButton btn02 = new JButton("Button02");
            JButton btn03 = new JButton("Button03");
            JButton btn04 = new JButton("Button04");
            JButton btn05 = new JButton("Button05");

            // 创建第一个水平箱容器
            Box hBox01 = Box.createHorizontalBox();
            hBox01.add(btn01);
            hBox01.add(btn02);
            hBox01.add(btn03);

            // 创建第二水平箱容器
            Box hBox02 = Box.createHorizontalBox();
            hBox02.add(btn04);
            hBox02.add(Box.createHorizontalGlue()); // 添加一个水平方向胶状的不可见组件，撑满剩余水平空间
            hBox02.add(btn05);

            // 创建一个垂直箱容器，放置上面两个水平箱（Box组合嵌套）
            Box vBox = Box.createVerticalBox();
            vBox.add(hBox01);
            vBox.add(hBox02);

            // 把垂直箱容器作为内容面板设置到窗口
            jf.setContentPane(vBox);

            jf.pack();
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
    }
}
/*
一、创建容器
    // 创建一个水平箱容器
    Box hBox = Box.createHorizontalBox();

    // 创建一个垂直箱容器
    Box vBox = Box.createVerticalBox();
二、不可见空白
1、glue  宽或者高可伸缩
    // 创建一个 水平方向胶状 的不可见组件，用于撑满水平方向剩余的空间（如果有多个该组件，则平分剩余空间）
    Component hGlue = Box.createHorizontalGlue();

    // 创建一个 垂直方向胶状 的不可见组件，用于撑满垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
    Component vGlue = Box.createVerticalGlue();

    // 创建一个 水平和垂直方向胶状 的不可见组件，用于撑满水平和垂直方向剩余的空间（如果有多个该组件，则平分剩余空间）
    Component glue = Box.createGlue();

2、struts  固定宽或者高
    // 创建一个 固定宽度 的不可见组件（用于水平箱）
    Component hStrut = Box.createHorizontalStrut(int width);

    // 创建一个 固定高度 的不可见组件（用于垂直箱）
    Component vStrut = Box.createVerticalStrut(int height);

3、rigidAreas    固定宽高
    // 创建 固定宽高 的不可见组件
    Component rigidArea = Box.createRigidArea(new Dimension(int width, int height));
 */