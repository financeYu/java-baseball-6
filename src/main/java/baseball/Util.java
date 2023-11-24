package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Util {

    public List<Integer> setSeedNumber() {
        return Randoms.pickUniqueNumbersInRange(1,9,3);
    }

    public List<Integer> parseStringToList(String rawNumber) {
        List<Integer> parseList = new ArrayList<>();
        for (int i=0; i<rawNumber.length(); i++) {
            int tempNumber = rawNumber.charAt(i) - '0';
            parseList.add(tempNumber);
        }
        checkNumberSize(parseList);
        checkNumberRange(parseList);
        checkSameNumber(parseList);
        return parseList;
    }

    private void checkNumberSize(List<Integer> parseList) {
        if (parseList.size() !=3) {
            throw new IllegalArgumentException();
        }
    }

    private void checkNumberRange(List<Integer> parseList) {
        for (int i : parseList) {
            if (!(i>=1 && i <= 9)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void checkSameNumber(List<Integer> parseList) {
        Set<Integer> setForCheck = new HashSet<>(parseList);
        if (setForCheck.size() != parseList.size()) {
            throw new IllegalArgumentException();
        }
    }
}
