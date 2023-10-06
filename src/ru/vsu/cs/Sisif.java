package ru.vsu.cs;

import java.awt.*;

public class Sisif implements Drawable {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Sisif(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(final Graphics gr, int x) {
            this.x = x;
        Graphics2D g = (Graphics2D) gr;

        // alien
        g.setColor(new Color(15, 206, 3));
        int shiftY = (int)(0.55 * this.height);                  // 0.5 = 0.2 + 0.7 / 2
        g.fillOval(this.x - (int)(0.35 * this.width),
                this.y - shiftY,
                (int)(0.7 * this.width),
                (int)(0.7 * this.height));

        // face
        g.setColor(new Color(0, 0, 0));
        int shiftX = (int)(0.18 * this.width);
        shiftY = (int)(0.4 * this.height);                      // 0.2 + 0.3 / 2 + 0.1 / 2
        // right eye
        g.fillOval(this.x + shiftX - (int)(0.05 * this.width),
                this.y - shiftY,
                (int)(0.1 * this.width),
                (int)(0.1 * this.height));
        // left eye
        g.fillOval(this.x - shiftX - (int)(0.05 * this.width),
                this.y - shiftY,
                (int)(0.1 * this.width),
                (int)(0.1 * this.height));
        // mouth
        g.fillOval(this.x - (int)(0.1 * this.width),
                this.y - shiftY,
                (int)(0.2 * this.width),
                (int)(0.1 * this.height));

        // glass
        g.setColor(new Color(16, 225, 225, 150));
        shiftY = (int)(0.7 * this.height);
        g.fillOval(this.x - (int)(0.7 * this.width),
                this.y - shiftY,
                (int)(1.4 * this.width),
                this.height);

        // glare
        g.setColor(new Color(252, 252, 255, 190));
        shiftX = (int)(0.4 * this.width);
        shiftY = (int)(0.55 * this.height);
        g.fillOval(this.x + shiftX - (int)(0.075 * this.width),
                this.y - shiftY,
                (int)(0.15 * this.width),
                (int)(0.1 * this.height));
        shiftX = (int)(0.3 * this.width);
        shiftY = (int)(0.6 * this.height);
        g.fillOval(this.x + shiftX - (int)(0.05 * this.width),
                this.y - shiftY,
                (int)(0.1 * this.width),
                (int)(0.06 * this.height));

        // corpus
        g.setColor(this.color);
        // polygon - (right-down, right-top, left-top, left-down)
        g.fillPolygon(new int[] {this.x  + (int)(0.85 * this.width),
                        this.x + (int)(0.75 * this.width),
                        this.x - (int)(0.75 * this.width),
                        this.x - (int)(0.85 * this.width)},
                new int[] {this.y + (int)(0.2 * this.height),
                        this.y - (int)(0.2 * this.height),
                        this.y - (int)(0.2 * this.height),
                        this.y + (int)(0.2 * this.height)}, 4);

        // steel line
        g.setColor(new Color(169, 171, 170));
        shiftX = (int)(0.78 * this.width);
        shiftY = (int)(0.135 * this.height);
        g.fillRect(this.x - shiftX,
                this.y - shiftY,
                (int)(1.56 * this.width),
                (int)(0.035 * this.height));

        shiftX = (int)(0.84 * this.width);
        shiftY = (int)(0.12 * this.height);
        g.fillRect(this.x - shiftX,
                this.y + shiftY,
                (int)(1.68 * this.width),
                (int)(0.035 * this.height));

        // fire
        g.setColor(new Color(10, 200, 90));
        shiftX = (int)(0.55 * this.width);
        shiftY = (int)(0.35 * this.height);
        g.fillOval(this.x - shiftX,
                this.y + shiftY,
                (int)(1.1 * this.width),
                (int)(0.1 * this.height));

        // react engine
        g.setColor(new Color(66, 66, 66));
        shiftY = (int)(0.3 * this.height);
        g.fillPolygon(new int[] {this.x  + (int)(0.6 * this.width),
                        this.x + (int)(0.75 * this.width),
                        this.x - (int)(0.75 * this.width),
                        this.x - (int)(0.6 * this.width)},
                new int[] {this.y + shiftY + (int)(0.1 * this.height),
                        this.y + shiftY - (int)(0.1 * this.height),
                        this.y + shiftY - (int)(0.1 * this.height),
                        this.y + shiftY + (int)(0.1 * this.height)}, 4);

        // shadow
        g.setColor(new Color(47, 47, 47, 90));
        shiftY = (int)(2 * this.height);
        g.fillOval(this.x - (int)(0.4 * this.width),
                this.y + shiftY,
                (int)(0.8 * this.width),
                (int)(0.3 * this.height));
    }
}
