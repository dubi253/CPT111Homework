/*
 * Exercise Week 6
 */

public class ColorHSB {

    private final int hue;
    private final int saturation;
    private final int brightness;

    // Exercise 6.1
    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int hue, int saturation, int brightness) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
    }


    // Exercise 6.2
    // Returns a string representation of this color, using the format (h, s, b).

    @Override
    public String toString() {
        return "(" + hue + ", " + saturation + ", " + brightness + ')';
    }

    // Exercise 6.3
    // Is this color in grayscale?
    public boolean isGrayscale() {
        return saturation == 0 || brightness == 0;
    }

    // Exercise 6.4
    // Returns the squared distance between two colors.
    // min{ (h1−h2)^2, (360−|h1−h2|)^2 } + (s1−s2)^2 + (b1−b2)^2
    public int squareDist(ColorHSB that) {
        return (int) Math.round(Math.min(Math.pow(this.hue - that.hue, 2), Math.pow(360 - Math.abs(this.hue - that.hue), 2)) + Math.pow(this.saturation - that.saturation, 2) + Math.pow(this.brightness - that.brightness, 2));
    }

    public static void main(String[] args) {
        ColorHSB green = new ColorHSB(100, 100, 50);
        ColorHSB orange = new ColorHSB(25, 100, 100);
        ColorHSB gray = new ColorHSB(0, 0, 50);

        System.out.println(green);

        System.out.println(orange.isGrayscale());
        System.out.println(gray.isGrayscale());

        int distGreenOrange = green.squareDist(orange);
        System.out.println(distGreenOrange);
        System.out.println(gray.squareDist(orange));
    }

}
