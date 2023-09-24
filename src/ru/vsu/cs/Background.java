package ru.vsu.cs;

import java.awt.*;

public class Background {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Background(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void draw(Graphics gr) {

        Graphics2D g = (Graphics2D) gr;

        // Draw the sky
        g.setColor(new Color(0, 95, 140));
        g.fillRect(0, 0, this.width, this.height);

        // Sun
        g.setColor(new Color(238, 217, 45));
        g.fillOval(this.x + (int)(0.8 * this.width),
                this.y + (int)(0.1 * this.height),
                (int)(0.075 * this.width),
                (int)(0.1 * this.height));

        g.setColor(new Color(238, 217, 45, 90));
        g.fillOval(this.x + (int)(0.7925 * this.width),
                this.y + (int)(0.09 * this.height),
                (int)(0.09 * this.width),
                (int)(0.12 * this.height));

        // Draw the mountains
        g.setColor(new Color(45, 50, 44));
        g.fillPolygon(new int[]{this.x,                             // width - / 800
                        this.x + (int)(0.125 * this.width),
                        this.x + (int)(0.25 * this.width),
                        this.x + (int)(0.5 * this.width),
                        this.x + (int)(0.625 * this.width)},
                new int[]{this.y + (int)(0.67 * this.height),        // height - / 600
                        this.y + (int)(0.42 * this.height),
                        this.y + (int)(0.5 * this.height),
                        this.y + (int)(0.42 * this.height),
                        this.y + (int)(0.67 * this.height)}, 5);

        // Draw the mansion
        g.setColor(new Color(87, 91, 86));
        g.fillRect(this.x + (int)(0.25 * this.width),
                this.y + (int)(0.42 * this.height),
                (int)(0.125 * this.width),
                (int)(0.25 * this.height));
        g.setColor(new Color(74, 75, 71));
        g.fillRect(this.x + (int)(0.2625 * this.width),
                this.y + (int)(0.44 * this.height),
                (int)(0.1 * this.width),
                (int)(0.184 * this.height));
        g.setColor(Color.BLACK);
        g.drawRect(this.x + (int)(0.2625 * this.width),
                this.y + (int)(0.44 * this.height),
                (int)(0.1 * this.width),
                (int)(0.184 * this.height));
        // roof
        g.setColor(new Color(82, 36, 36));
        g.fillPolygon(new int[]{this.x + (int)(0.2375 * this.width),
                        this.x + (int)(0.3125 * this.width),
                        this.x + (int)(0.3875 * this.width)},
                    new int[]{this.y + (int)(0.42 * this.height),
                        this.y + (int)(0.35 * this.height),
                        this.y + (int)(0.42 * this.height)}, 3);
        g.setColor(new Color(24, 23, 23));
        g.drawPolygon(new int[]{this.x + (int)(0.2375 * this.width),
                        this.x + (int)(0.3125 * this.width),
                        this.x + (int)(0.3875 * this.width)},
                new int[]{this.y + (int)(0.42 * this.height),
                        this.y + (int)(0.35 * this.height),
                        this.y + (int)(0.42 * this.height)}, 3);

        // mountains-foreground
        g.setColor(new Color(26, 29, 25));
        g.fillPolygon(new int[]{0,
                        this.x + (int)(0.0875 * this.width),
                        this.x + (int)(0.175 * this.width),
                        this.x + (int)(0.325 * this.width),
                        this.x + (int)(0.5 * this.width),
                        this.x + (int)(0.625 * this.width)},
                new int[]{this.y + (int)(0.67 * this.height),
                        this.y + (int)(0.5 * this.height),
                        this.y + (int)(0.57 * this.height),
                        this.y + (int)(0.5 * this.height),
                        this.y + (int)(0.67 * this.height),
                        this.y + (int)(0.67 * this.height)}, 6);

        // Draw the trees
        g.setColor(new Color(9, 66, 6));
        g.fillOval(this.x + (int)(0.075 * this.width),
                this.y + (int)(0.584 * this.height),
                (int)(0.1 * this.width),
                (int)(0.167 * this.height));
        g.setColor(new Color(31, 86, 34));
        g.fillOval(this.x + (int)(0.1 * this.width),
                this.y + (int)(0.53 * this.height),
                (int)(0.1 * this.width),
                (int)(0.2 * this.height));
        g.setColor(new Color(12, 68, 29));
        g.fillOval(this.x + (int)(0.5 * this.width),
                this.y + (int)(0.53 * this.height),
                (int)(0.1 * this.width),
                (int)(0.2 * this.height));
        g.setColor(new Color(29, 87, 31));
        g.fillOval(this.x + (int)(0.475 * this.width),
                this.y + (int)(0.6 * this.height),
                (int)(0.1 * this.width),
                (int)(0.125 * this.height));

        // Draw the grass
        g.setColor(new Color(70, 102, 54));
        g.fillRect(0, (int)(0.67 * this.height), this.width, this.height - (int)(0.67 * this.height));


    }
}
