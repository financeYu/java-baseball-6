package baseball.view;

import baseball.Util;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    Util util = new Util();

    public List<Integer> inputNumber() {
        do {
            try {
                String rawInputNumber = Console.readLine();
                return util.parseStringToList(rawInputNumber);
            } catch (IllegalArgumentException wrongInput) {
                System.out.println("[ERROR] 잘못된 입력입니다 다시 입력해주세요");
            }
        }
        while (true);
    }
}
