public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Turtle picasso = new Turtle();
        picasso.speed(10);
        picasso.penColor("green");

        for(int i = 0; i < 36; ++i) {
            picasso.forward(20);
            picasso.left(10);
        }

        picasso.up();
        picasso.left(90);
        picasso.forward(115);
        picasso.right(180);
        picasso.down();
        int numoflotus = 24;

        for(int i = 0; i < numoflotus; ++i) {
            if (i % 2 == 0) {
                picasso.penColor("fuchsia");
                picasso.forward(70);
                picasso.left(45);
                picasso.forward(70);
                picasso.left(135);
                picasso.forward(70);
                picasso.left(45);
                picasso.forward(70);
                picasso.left(135);
            } else {
                picasso.penColor("pink");
                picasso.forward(55);
                picasso.left(45);
                picasso.forward(55);
                picasso.left(135);
                picasso.forward(55);
                picasso.left(45);
                picasso.forward(55);
                picasso.left(135);
            }

            picasso.left(360 / numoflotus);
        }

    }
}