package com;

import javax.swing.*;

/**
 *
 *
 * @author Haozhigang
 *
 * @date 2019年08月09日21:16
 *
 */
public class AddDeleteDemo extends JFrame {
    private JFrame frame = new JFrame("星座选择器");

    private JPanel panel = new JPanel();

    private JComboBox comboBox = new JComboBox();

    private JLabel label = new JLabel("选择星座: ");

    private JTextField showInfo = new JTextField();

    private JTextField textField = new JTextField(10);

    private JButton button_add = new JButton("新增");

    private JButton button_del = new JButton("删除");

    public AddDeleteDemo() {
        comboBox.addItem(SwingConsts.SELECT_DEFAULT);
        comboBox.addItem(SwingConsts.XZ_SP);
        comboBox.addItem(SwingConsts.XZ_SS);
        comboBox.addItem(SwingConsts.XZ_TC);
        showInfo.setEnabled(false);
        comboBox.addItemListener(e -> {
            String select = e.getItem().toString();
            panel.add(showInfo);
            if (!select.equals(SwingConsts.SELECT_DEFAULT)) {
                showInfo.setText("选择的星座是：" + select);
            } else {
                showInfo.setText("未选择星座");
            }

        });
        frame.add(panel);
        panel.add(comboBox);
        panel.add(label);
        textField.setEnabled(false);
        panel.add(textField);
        panel.add(button_add);
        panel.add(button_del);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setBounds(300, 300, 400, 200);
        frame.setVisible(true);
    }

}