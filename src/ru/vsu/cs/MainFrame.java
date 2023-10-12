package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private final DrawPanel panel;
    public MainFrame(int width, int height) throws HeadlessException {
        this.panel = new DrawPanel(5);
        panel.addObject(new Background(0, 0, width, height, new Color(0, 95, 140)));
        panel.addObject(new Sisif(width / 2, height / 2, 100, 100, Color.GRAY));
        this.add(panel);
    }
}
