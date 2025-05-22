package flyweight;

import java.awt.*;

public class MyRect {

    private Color color;
    private int x, y, x2, y2;

    public MyRect(Color color, int x, int y, int x2, int y2) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }
//
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x, y, x2, y2);
    }


    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int x2, int y2) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
}
