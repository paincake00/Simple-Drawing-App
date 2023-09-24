package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final DrawPanel panel;
    public MainFrame() throws HeadlessException {
        this.panel = new DrawPanel(800, 600, 5);
        this.add(panel);
    }
}
