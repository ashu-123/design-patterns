package flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FlyWeightTest extends JFrame {

    JButton startDrawing;

    int windowHeight = 175;
    int windowWidth = 1750;

    Color[] colors = {Color.BLUE, Color.CYAN, Color.RED, Color.DARK_GRAY, Color.ORANGE};

    public static void main(String[] args) {
        new FlyWeightTest();
    }

    public FlyWeightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Fly weight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(c -> {
            Graphics g = drawingPanel.getGraphics();
            long startTime = System.currentTimeMillis();

//            for(int i=1;i<=1000000;i++) {
//                g.setColor(getRandomColor());
//                g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
//            }

//            for(int i=1;i<=1000000;i++) {
//                MyRect myRect = new MyRect(getRandomColor(), getRandX(), getRandY(), getRandX(), getRandY());
//                myRect.draw(g);
//            }

            for(int i=1;i<=1000000;i++) {
                MyRect myRect = RectFactory.getRect(getRandomColor());
                myRect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }

            long endTime = System.currentTimeMillis();

            System.out.println("That took : " + (endTime-startTime));
        });
        this.add(contentPane);
        this.setVisible(true);
    }

    private Color getRandomColor() {
        Random random = new Random();
        int rand = random.nextInt(5);
        return colors[rand];
    }

    private int getRandX() {
        return (int)(Math.random()*windowWidth);
    }

    private int getRandY() {
        return (int)(Math.random()*windowHeight);
    }


}
