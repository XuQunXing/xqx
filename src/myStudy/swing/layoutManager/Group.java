package myStudy.swing.layoutManager;

import javax.swing.*;

public class Group {
    public static void main(String[] args) {
        JFrame jf=new JFrame("测试窗口");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建内容面板容器
        JPanel panel=new JPanel();
        //创建分组布局并关联容器
        GroupLayout layout=new GroupLayout(panel);
        //设置容器布局
        panel.setLayout(layout);

        // 创建组件
        JButton btn01 = new JButton("Button01");
        JButton btn02 = new JButton("Button02");
        JButton btn03 = new JButton("Button03");
        JButton btn04 = new JButton("Button04");
        JButton btn05 = new JButton("Button05");

        //自动创建组件之间的间隙
        layout.setAutoCreateGaps(true);
        //自动创建容器与触到容器边框的组件之间的间隙
        layout.setAutoCreateContainerGaps(true);

        /**
         * 水平组（仅确定 X 轴方向的坐标/排列方式）
         *
         * 水平串行: 水平排列（左右排列）
         * 水平并行: 垂直排列（上下排列）
         */
        //水平并行（上下），按钮1、2
        GroupLayout.ParallelGroup hParalGroup=layout.createParallelGroup().addComponent(btn01).addComponent(btn02);
        //水平并行（上下），按钮1、2
        GroupLayout.ParallelGroup hParalGroup1=layout.createParallelGroup().addComponent(btn03).addComponent(btn04);
        //水平串行（左右），两个并行组
        GroupLayout.SequentialGroup sSeq = layout.createSequentialGroup().addGroup(hParalGroup).addGroup(hParalGroup1);
        //水平并行（上下），sSeq和按钮5
        GroupLayout.ParallelGroup hGroup = layout.createParallelGroup().addGroup(sSeq).addComponent(btn05);
        //指定布局的 水平组（水平座标）
        layout.setHorizontalGroup(hGroup);

        /*
         * 垂直组（仅确定 Y 轴方向的坐标/排列方式）
         *
         * 垂直串行: 垂直排列（上下排列）
         * 垂直并行: 水平排列（左右排列）
         */
        // 垂直并行（左右）btn01 和 btn03
        GroupLayout.ParallelGroup vParalGroup01 = layout.createParallelGroup().addComponent(btn01).addComponent(btn03);

        // 垂直并行（左右）btn02 和 btn04
        GroupLayout.ParallelGroup vParalGroup02 = layout.createParallelGroup().addComponent(btn02).addComponent(btn04);

        // 垂直串行（上下）vParalGroup01, vParalGroup02 和 btn05
        GroupLayout.SequentialGroup vSeqGroup = layout.createSequentialGroup().addGroup(vParalGroup01).addGroup(vParalGroup02).addComponent(btn05);

        layout.setVerticalGroup(vSeqGroup);    // 指定布局的 垂直组（垂直坐标）


        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
/*
1.Group的创建以及元素的添加
    // 先创建分组布局，并关联容器
    GroupLayout layout = new GroupLayout(panel);

    // 创建 串行组
    GroupLayout.SequentialGroup seqGroup = layout.createSequentialGroup();
    // 添加 组元素
    seqGroup.addGroup(group);
    // 添加 组件元素
    seqGroup.addComponent(component);
    // 添加 间隙
    seqGroup.addGap(size);

    // 创建 并行组
    GroupLayout.ParallelGroup paralGroup = layout.createParallelGroup();
    // 添加 组元素（可指定对齐方式）
    paralGroup.addGroup([alignment,] group);
    // 添加 组件元素（可指定对齐方式）
    paralGroup.addComponent(component, [alignment]);
    // 添加 间隙
    paralGroup.addGap(size);

2.设置水平和垂直方向的两个组
    // 指定布局的水平组（确定组件在 X轴 方向上的位置）
    GroupLayout.setHorizontalGroup(GroupLayout.Group group);

    // 指定布局的垂直组（确定组件在 Y轴 方向上的位置）
    GroupLayout.setVerticalGroup(GroupLayout.Group group);

 */