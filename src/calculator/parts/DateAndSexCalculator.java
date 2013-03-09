package calculator.parts;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class DateAndSexCalculator {
    private static final Map<Integer, Character> monthMap = ImmutableMap.<Integer, Character>builder()
                                                                        .put(1, 'A').put(2, 'B').put(3, 'C').put(4, 'D')
                                                                        .put(5, 'E').put(6, 'H').put(7, 'L').put(8, 'M')
                                                                        .put(9, 'P').put(10, 'R').put(11, 'S').put(12, 'T')
                                                                        .build();
}
