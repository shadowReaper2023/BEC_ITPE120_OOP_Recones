public class ColorEnumDemo {
    enum Colors {
        RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

        private int red, green, blue;

        Colors(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        void displayRGB() {
            System.out.println(this + " - RGB: " + red + ", " + green + ", " + blue);
        }
    }

    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            color.displayRGB();
        }
    }
}