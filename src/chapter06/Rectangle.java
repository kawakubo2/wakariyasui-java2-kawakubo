package chapter06;
/**
 * 
 */
public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * 面積を求めるメソッド
     * @return 幅(width)と高さ(height)の積
     */ 
    public double getArea() {
        return width * height;
    }
    /**
     * 対角線を求めるメソッド 
     * @return 幅(width)と高さ(height)のhypot
     */
    public double getDiagoal() {
        return Math.hypot(width, height);
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }

}
