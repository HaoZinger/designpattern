package com;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class SwingDemo {
    public static void main(String[] args) {
        //        demo1();
//        borderLayout();
//        cardLayout();
        AddDeleteDemo addDeleteDemo = new AddDeleteDemo();
    }

    private static void cardLayout() {
        JFrame frame = new JFrame("Java第五个程序");    //创建Frame窗口
        JPanel p1 = new JPanel();    //面板1
        JPanel p2 = new JPanel();    //面板2
        JPanel cards = new JPanel(new CardLayout());    //卡片式布局的面板
        p1.add(new JButton("登录按钮"));
        p1.add(new JButton("注册按钮"));
        p1.add(new JButton("找回密码按钮"));
        p2.add(new JTextField("用户名文本框", 20));
        p2.add(new JTextField("密码文本框", 20));
        p2.add(new JTextField("验证码文本框", 20));
        cards.add(p1, "card1");    //向卡片式布局面板中添加面板1
        cards.add(p2, "card2");    //向卡片式布局面板中添加面板2
        CardLayout cl = (CardLayout) (cards.getLayout());
        cl.show(cards, "card1");    //调用show()方法显示面板2
        frame.add(cards);
        frame.setBounds(300, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private static void borderLayout() {
        JFrame frame = new JFrame();
        JButton jButton1 = new JButton("上");
        JButton jButton2 = new JButton("左");
        JButton jButton3 = new JButton("中");
        JButton jButton4 = new JButton("右");
        JButton jButton5 = new JButton("下");
        JLabel jLabel = new JLabel("Label");
        frame.add(jButton1, BorderLayout.NORTH);
        frame.add(jLabel, BorderLayout.CENTER);
        frame.add(jButton2, BorderLayout.WEST);
        frame.add(jButton3, BorderLayout.CENTER);
        frame.add(jButton4, BorderLayout.EAST);
        frame.add(jButton5, BorderLayout.SOUTH);
        setBounds(frame);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private static void demo1() {
        JFrame frame = new JFrame("SubmitForm");
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\huayu\\Pictures\\Saved Pictures\\indexjs.png");
        frame.setIconImage(imageIcon.getImage());

        setBounds(frame);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        JLabel lable = new JLabel("Lable");
        panel.add(lable);
        frame.add(panel);
    }

    private static void setBounds(JFrame frame) {
        frame.setBounds(300, 200, 400, 200);
    }

    private static void setConponents(JPanel panel) {
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        Label id = new Label("这是Lable");
        //        id.setBounds(0,20,10,20);
        Label name = new Label("Name");
        Label age = new Label("age");
        panel.add(id);
        //        panel.add(name);
        //        panel.add(age);

    }
}
