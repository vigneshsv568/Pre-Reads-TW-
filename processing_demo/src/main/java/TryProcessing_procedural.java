import processing.core.PApplet;

public class TryProcessing_procedural extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0;
    int x1 = 0;
    int x2 = 0;
    int x3 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing_procedural", args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x++, HEIGHT * 1 / 5, DIAMETER, DIAMETER);
        ellipse(x1 += 2, HEIGHT * 2 / 5, DIAMETER, DIAMETER);
        ellipse(x2 += 3, HEIGHT * 3 / 5, DIAMETER, DIAMETER);
        ellipse(x3 += 4, HEIGHT * 4 / 5, DIAMETER, DIAMETER);

    }
}
