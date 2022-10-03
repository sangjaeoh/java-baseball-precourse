package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {

    public static List<Integer> inputNumbers() {
        List<Integer> inputs = new ArrayList<>();
        String input = Console.readLine();
        for (String sNumber : input.split("")) {
            inputs.add(Integer.parseInt(sNumber));
        }
        return inputs;
    }

}
