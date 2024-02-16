package racingcar.manager;

import racingcar.controller.RacingController;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingManager {
    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    public RacingController racingController() {
        return new RacingController(inputView(), outputView());
    }
}
