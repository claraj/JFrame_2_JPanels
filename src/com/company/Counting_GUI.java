package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by clara on 12/14/2016.
 * A very simple JPanel with some components and logic; able to send data to its parent GUI
 */
public class Counting_GUI extends JFrame {
    private JButton clickMeButton;
    private JLabel countLabel;
    private JPanel mainPanel;

    Main_Window parentUI;

    int clickCount = 0;

    Counting_GUI(Main_Window parent) {
        this.parentUI = parent;

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                countLabel.setText("You have clicked the button " + clickCount + " time(s).");
                parentUI.clickCountUpdated(clickCount);
            }
        });
    }


    JPanel getPanel() {
        return mainPanel;     //for the main JFrame to display
    }

    public void setInitialLabel(String labelText) {
        countLabel.setText(labelText);
    }
}
