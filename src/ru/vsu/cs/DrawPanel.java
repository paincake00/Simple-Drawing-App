package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements ActionListener {

    private int PANEL_HEIGHT;
    private int PANEL_WIDTH;
    private Timer timer;
    private int ticksFromStart = 400;
    ArrayList<Drawable> graphicsObjs;
    private static int xPos;

    public DrawPanel(int width, int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        timer = new Timer(timerDelay, this);

        graphicsObjs = new ArrayList<>();

        graphicsObjs.add(new Background(0, 0, PANEL_WIDTH, PANEL_HEIGHT, new Color(0, 95, 140)));
        graphicsObjs.add(new Sisif(PANEL_WIDTH / 2, PANEL_HEIGHT / 2, 100, 100, Color.GRAY));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                xPos = e.getX();
                if (!timer.isRunning()) {
                    timer.start();
                }
            }
        });
    }

    @Override
    public void paint(final Graphics g) {
        super.paint(g);
        for (Drawable obj : graphicsObjs) {
            obj.draw(g, ticksFromStart);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            if (xPos > ticksFromStart) {
                repaint();
                ++ticksFromStart;
            } else {
                repaint();
                --ticksFromStart;
            }
        }
    }
}
