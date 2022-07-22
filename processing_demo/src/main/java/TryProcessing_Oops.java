import processing.core.PApplet;


public class TryProcessing_Oops extends PApplet {
    public static final int DIAMETER = 10;

    Circle cir = new Circle();
    Window win = new Window();

    public static void main(String[] args) {
        PApplet.main("TryProcessing_Oops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(win.getWidth_window(),win.getHeight_window());
    }

    @Override
    public void draw() {
        drawCircle();
    }
    private void drawCircle() {
        cir.speed();
        ellipse(cir.getCircle_one(), win.getHeight_window() * 1 / 5, win.getDiameter(), win.getDiameter());
        ellipse(cir.getCircle_two(),win.getHeight_window() * 2 / 5, win.getDiameter(), win.getDiameter());
        ellipse(cir.getCircle_three(), win.getHeight_window() * 3 / 5, win.getDiameter(), win.getDiameter());
        ellipse(cir.getCircle_four(),win.getHeight_window() * 4 / 5, win.getDiameter(), win.getDiameter());

    }
}
