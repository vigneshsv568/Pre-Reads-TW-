import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int x =0;
    int x1=0;
    int x2=0;
    int x3=0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
     //   paintWhite();
        drawCircle();

    }

    private void drawCircle() {
        ellipse(x,HEIGHT*1/5, DIAMETER, DIAMETER);
        ellipse(x1,HEIGHT*2/5, DIAMETER, DIAMETER);
        ellipse(x2,HEIGHT*3/5, DIAMETER, DIAMETER);
        ellipse(x3,HEIGHT*4/5, DIAMETER, DIAMETER);
        x++;
        x1+=2;
        x2+=3;
        x3+=4;
    }


    private void paintWhite() {
        background(255);
    }
}
