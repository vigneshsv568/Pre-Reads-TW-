import processing.core.PApplet;

public class Circle extends PApplet {
    private int circle_one;
    private int circle_two;
    private int circle_three;
    private int circle_four;


    public int getCircle_one() {
        return circle_one;
    }

    public void setCircle_one(int circle_one) {
        this.circle_one = circle_one +1;
    }

    public int getCircle_two() {
        return circle_two;
    }

    public void setCircle_two(int circle_two) {
        this.circle_two = circle_two+2;
    }

    public int getCircle_three() {
        return circle_three;
    }

    public void setCircle_three(int circle_three) {
        this.circle_three = circle_three+3;
    }

    public int getCircle_four() {
        return circle_four;
    }

    public void setCircle_four(int circle_four) {
        this.circle_four = circle_four+4;
    }

    public void speed() {
        this.setCircle_one(circle_one++);
        this.setCircle_two(circle_two+=2);
        this.setCircle_three(circle_three+=3);
        this.setCircle_four(circle_four+=4);
    }
}
