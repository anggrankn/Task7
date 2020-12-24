package ru.vsu.cs.gui;

import ru.vsu.cs.ArrayUtil;
import ru.vsu.cs.logic.CalculatorTheNumberOfElements;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonResultArray implements ActionListener {
    public JTextField textReadField;
    public JTextField textSecondConditionField;
    public JTextField textFirstConditionField;

    public ListenerButtonResultArray(JTextField textReadField, JTextField textFirstConditionField,
                                     JTextField textSecondConditionField) {
        this.textReadField = textReadField;
        this.textFirstConditionField = textFirstConditionField;
        this.textSecondConditionField = textSecondConditionField;
    }

    public void actionPerformed(ActionEvent e) {
        int[] numberOfElements = ArrayUtil.toIntArray(textReadField.getText());
        textFirstConditionField.setText(String.valueOf(CalculatorTheNumberOfElements.getFirstCondition(numberOfElements)));
        textSecondConditionField.setText(String.valueOf(CalculatorTheNumberOfElements.getSecondCondition(numberOfElements)));
    }
}
