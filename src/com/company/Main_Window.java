package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by we4954cp on 12/14/2016.
 */
public class Main_Window extends JFrame{
    private JPanel mainPanel;

    Controller controller;   //use this to send messages to a controller

    Cat_GUI cat_gui;
    Counting_GUI counting_gui;

    Main_Window(Controller controller){
        this.controller = controller;

        //GUI setup

        setContentPane(mainPanel);

        //Note that this fails with a NullPointer if the default layoutmanager (GridLayoutManager) for this form is used
        //Since all it does is hold a JPanel, set the layout manager to something (probably anything) else).

        counting_gui = new Counting_GUI(this);

        mainPanel.add(counting_gui.getPanel(), BorderLayout.WEST);

        cat_gui = new Cat_GUI(this);
        mainPanel.add(cat_gui.getPanel(), BorderLayout.EAST);

        //Can send messages to the cat_gui and counting gui, if needed

        //For example, set the label in the counting GUI to an initial value
        
        counting_gui.setInitialLabel("Click count will show here");

        setPreferredSize(new Dimension(500, 200));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    void catSelected(String cat) {
        controller.catSelected(cat);
    }

    // Called by the Counting_GUI
    void clickCountUpdated(int count) {
        controller.countUpdated(count);
    }

    public void notifyUserMultipleOf10() {
        JOptionPane.showMessageDialog(this, "You clicked a multiple of 10 times");
    }
}
