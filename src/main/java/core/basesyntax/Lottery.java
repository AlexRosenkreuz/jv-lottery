package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int NUMBER_BOUNDARY = 101;
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), random.nextInt(NUMBER_BOUNDARY));
    }
}