package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by clara on 12/14/2016.
 * A very simple JPanel with some components and logic; able to send data to its parent GUI
 */
public class Cat_GUI extends JPanel {

    private JComboBox<String> catsComboBox;
    private JPanel mainPanel;
    private JLabel selectedLabel;

    Main_Window parentGUI;

    Cat_GUI(Main_Window parent)  {

        parentGUI = parent;

        catsComboBox.addItem("Tiger");
        catsComboBox.addItem("Lion");
        catsComboBox.addItem("Jaguar");

        catsComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cat = catsComboBox.getSelectedItem().toString();
                selectedLabel.setText("You selected " + cat);
                parentGUI.catSelected(cat);
            }
        });
    }

    public JPanel getPanel() {
        return mainPanel;
    }
}
