package calculator.parts;

import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class ChecksumCalculator {

    private static final Map<Character, Integer> oddCharsMapping = ImmutableMap.<Character, Integer>builder()
            .put('0', 1).put('1', 0).put('2', 5).put('3', 7).put('4', 9).put('5', 13).put('6', 15).put('7', 17)
            .put('8', 19).put('9', 21).put('A', 1).put('B', 0).put('C', 5).put('D', 7).put('E', 9).put('F', 13)
            .put('G', 15).put('H', 17).put('I', 19).put('J', 21).put('K', 2).put('L', 4).put('M', 18).put('N', 20)
            .put('O', 11).put('P', 3).put('Q', 6).put('R', 8).put('S', 12).put('T', 14).put('U', 16).put('V', 10)
            .put('W', 22).put('X', 25).put('Y', 24).put('Z', 23).build();

    private static final Map<Character, Integer> evenCharsMapping = ImmutableMap.<Character, Integer>builder()
            .put('0', 0).put('1', 1).put('2', 2).put('3', 3).put('4', 4).put('5', 5).put('6', 6).put('7', 7)
            .put('8', 8).put('9', 9).put('A', 0).put('B', 1).put('C', 2).put('D', 3).put('E', 4).put('F', 5)
            .put('G', 6).put('H', 7).put('I', 8).put('J', 9).put('K', 10).put('L', 11).put('M', 12).put('N', 13)
            .put('O', 14).put('P', 15).put('Q', 16).put('R', 17).put('S', 18).put('T', 19).put('U', 20).put('V', 21)
            .put('W', 22).put('X', 23).put('Y', 24).put('Z', 25).build();

    public char checksumFor(String codeWithoutChecksum) {
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        int total = 0;

        for (int i = 0; i < codeWithoutChecksum.length(); i++) {
            Map<Character, Integer> decodingMap = i % 2 == 0 ? oddCharsMapping : evenCharsMapping;
            total += decodingMap.get(codeWithoutChecksum.charAt(i));
        }

        int checksumShift = total % 26;

        return (char) ('A' + checksumShift);
    }
}
