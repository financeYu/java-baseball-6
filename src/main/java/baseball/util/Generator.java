package baseball.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Generator {

    public List<Integer> setSeedNumber() {
        return Randoms.pickUniqueNumbersInRange(1,9,3);
    }

}
