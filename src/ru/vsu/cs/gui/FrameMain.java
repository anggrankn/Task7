package ru.vsu.cs.gui;

import javax.swing.*;

public class FrameMain extends JFrame {
    private JPanel mainPanel;
    private JTextField textReadField;
    private JButton buttonPrintResult;
    private JTextField textSecondConditionField;
    private JTextField textFirstConditionField;

    public FrameMain() {
        setTitle("Task 7, Number 21");
        setContentPane(mainPanel);
        setVisible(true);
        setBounds(300, 300, 800, 300);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        buttonPrintResult.addActionListener(new ListenerButtonResultArray(textReadField, textFirstConditionField,
                textSecondConditionField));
    }
}
