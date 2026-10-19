package part02;

import java.util.ArrayList;
import java.util.List;

/**
 * Your task is to implement the methods in this class. Use the JUnit test
 * provided to verify that your implementation works as expected. You can also
 * write a main method to test your implementations.
 *
 * Do not change the signatures of the methods already provided. However, you
 * are free to add new methods.
 */
public class CollectionsBasics {

    /**
     * Finds the maximum value in a list of integers. You can assume that the list
     * is not empty.
     *
     * @param numbers The list of integers.
     * @return The maximum value in the list.
     */
    public int maximum(List<Integer> numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > answer) {
                answer = numbers.get(i);
            }
        }
        return answer;
    }

    /**
     * Calculates the sum of all integers in a list.
     *
     * @param numbers The list of integers.
     * @return The sum of all integers in the list.
     */
    public int sum(List<Integer> numbers) {
        int answer = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            answer += number;
        }
        return answer;
    }

    /**
     * Returns a new list, where the numbers from the given list are multiplied by
     * the given factor. The order of the numbers in the new list should be the same
     * as in the original list. For example, if the given list contains the
     * numbers -1, 0 and 100 and the factor is 2, the result is a new list
     * containing the numbers -2, 0 and 200.
     *
     * The original list should not be modified. Instead, a new list should be
     * created and returned.
     *
     * @param numbers A list of integers.
     * @return A new list, where the numbers are multiplied by the given factor.
     */
    public List<Integer> multiply(List<Integer> numbers, int factor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int numbersInt = numbers.get(i);
            int listInt = numbersInt * factor;
            list.add(listInt);
        }
        return list;
    }

    /**
     * Generates and returns a list, which contains integer numbers between the
     * given start and end values. The start value is included in the list, but the
     * end value is not. The numbers must be in ascending order. If the end value is
     * less than or equal to the start value, an empty list is returned.
     *
     * @param start The start value, included in the list.
     * @param end   The end value, not included in the list.
     * @return A list containing the numbers between the start and end values.
     */
    public List<Integer> range(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(i);
        }
        return list;
    }

    /**
     * Concatenates (or joins) a list of strings into a single string.
     * For example, if the list contains the strings "foo", "bar" and "baz",
     * the result is "foobarbaz". You can assume that the list is not empty.
     *
     * @param strings The list of strings.
     * @return The concatenated string.
     */
    public String concatenateStrings(List<String> strings) {
        String answer = "";
        for (int i = 0; i < strings.size(); i++) {
            answer += strings.get(i);
        }
        return answer;
    }

    /**
     * Returns the lengths of the strings in the input list.
     * For example, if the input list contains the strings "Java", "Python" and
     * "TypeScript", the result is a list containing the numbers 4, 6 and 10.
     *
     * @param strings The list of strings.
     * @return A list containing the lengths of the strings in the input list.
     */
    public List<Integer> getLengths(List<String> strings) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String word = strings.get(i);
            int size = word.length();
            list.add(size);
        }
        return list;
    }

    /**
     * Returns all the indices in the given text where the given substring is found
     * at. If the substring is not found in the text, an empty list is returned. The
     * search is case-sensitive and the indices are zero-based, just like in the
     * indexOf method of the String class.
     *
     * The substrings may overlap, in which case the method should return all the
     * indices where the substring starts. For example, if the text is "banana" and
     * the substring is "ana", the result is a list containing the numbers 1 and 3.
     *
     * @param text      The text to search from.
     * @param substring The substring to search for.
     * @return A list containing all the indices where the substring is found at.
     */
    // You can assume that the given substring is not empty.
    public List<Integer> indicesOf(String text, String substring) {
        List<Integer> list = new ArrayList<>();
        int length = substring.length();
        for (int i = 0; i < text.length(); i++) {
            try {
                if (text.substring(i, length).contains(substring)) {
                    list.add(i);
                }
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return list;
    }
}
