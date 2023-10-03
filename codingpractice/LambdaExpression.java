package codingpractice;

interface Drawable {
	int draw(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Drawable d = (int a, int b) -> (a + b);
        System.out.println(d.draw(12, 15));
    }
}
