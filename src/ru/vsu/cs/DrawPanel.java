package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawPanel extends JPanel implements ActionListener {
    private Timer timer;
    private int ticksFromStart = 400;
    ArrayList<Drawable> graphicsObjs;
    private static int xPos;

    public DrawPanel(final int timerDelay) {
        timer = new Timer(timerDelay, this);

        graphicsObjs = new ArrayList<>();

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

    public void addObject(Drawable obj) {
        graphicsObjs.add(obj);
    }
    public void removeObj(Drawable obj) {
        graphicsObjs.remove(obj);
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
