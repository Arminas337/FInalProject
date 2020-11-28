package Main;

import javax.swing.*;

public class RentalServiceMain {
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    //////////////////////////////////////////////////////////MAIN//////////////////////////////////////////
    public static void main(String[] args) {

        JFrame frame = new RentalServiceView();
        ImageIcon img = new ImageIcon("../images/logo.GIF");
        frame.setIconImage(img.getImage());
        frame.setTitle("Car Rental v.01");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}

