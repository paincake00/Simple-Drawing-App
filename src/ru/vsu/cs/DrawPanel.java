package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawPanel extends JPanel implements ActionListener {

    private int PANEL_HEIGHT;
    private int PANEL_WIDTH;
    private Timer timer;
    private int ticksFromStart = 400;
    private Sisif sisif;
    private Background bg;
    private static int xPos;

    public DrawPanel(int width, int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        timer = new Timer(timerDelay, this);


        this.bg = new Background(0, 0, PANEL_WIDTH, PANEL_HEIGHT, new Color(0, 95, 140));
        this.sisif = new Sisif(PANEL_WIDTH / 2, PANEL_HEIGHT / 2, 100, 100, Color.GRAY);

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
        bg.draw(g);
        sisif.setX(ticksFromStart);
        sisif.draw(g);
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
