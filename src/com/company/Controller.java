package com.company;

public class Controller {

    Main_Window gui;

    public static void main(String[] args) {

        //Create an instance of this class
        Controller controller = new Controller();
    }

    Controller() {
        //Pass a reference to this class to the GUI
        //GUI will be in charge of creating and manging any sub-panels needed
        gui = new Main_Window(this);
        //GUI needs a reference to this controller to send messages/data as needed
        //This class has a reference to the GUI, if it needs to send updates
    }

    public void catSelected(String cat) {
        System.out.println("Message from controller: The user selected this cat: " + cat);
        //Controller can send this data to DB, or process it in another way, as needed
        //This function can return data to GUI if desired.
    }


    public void countUpdated(int count) {
        System.out.println("Message from controller: The user has now clicked a button " + count + " times.");

        //And can respond to the GUI

        //If the click count is a multiple of 10...
        if (count % 10 == 0) {
            gui.notifyUserMultipleOf10();
        }

    }


}
