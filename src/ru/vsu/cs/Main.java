package ru.vsu.cs;

import javax.swing.*;

public class Main {
    public static final int PANEL_WIDTH = 800;
    public static final int PANEL_HEIGHT = 600;
    public static void main(String[] args) {
        MainFrame frame = new MainFrame(PANEL_WIDTH, PANEL_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(PANEL_WIDTH, PANEL_HEIGHT);
        frame.setVisible(true);
    }
}