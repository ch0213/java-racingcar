package step3.racingcar;

import java.util.List;

public class ResultViewProcessor {

    private static final String POSITION_MARK = "-";
    private static final String DELIMITER = " : ";
    private static final String COMMA = ", ";
    private static final int INDEX_ZERO = 0;

    private ResultViewProcessor() {
    }

    public static void printResultHeader(String headerMessage) {
        System.out.println(headerMessage);
    }

    public static void printResult(CarGroups carGroups) {
        List<String> carNames = carGroups.getCarNames();
        List<Integer> carPositions = carGroups.getCarPositions();
        int carCounts = carNames.size();
        for (int i = INDEX_ZERO; i < carCounts; i++) {
            System.out.print(carNames.get(i) + DELIMITER);
            printCurrentPosition(carPositions.get(i));
        }
        System.out.println();
    }

    private static void printCurrentPosition(int currentPosition) {
        for (int i = INDEX_ZERO; i < currentPosition; i++) {
            System.out.print(POSITION_MARK);
        }
        System.out.println();
    }

    public static void printWinnerCarNames(CarGroups carGroups) {
        List<String> winnerCarNames = carGroups.getWinnerCarNames();
        StringBuilder stringBuilder = new StringBuilder();
        for (String winnerCarName : winnerCarNames) {
            appendComma(stringBuilder);
            stringBuilder.append(winnerCarName);
        }
        System.out.println(stringBuilder.toString() + Message.RESULT_FOOTER);
    }

    private static void appendComma(StringBuilder stringBuilder) {
        if (stringBuilder.length() > INDEX_ZERO)
            stringBuilder.append(COMMA);
    }
}