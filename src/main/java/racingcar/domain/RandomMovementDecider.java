package racingcar.domain;

import java.util.Random;

public class RandomMovementDecider implements MovementDecider {
    public int generateCondition() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
