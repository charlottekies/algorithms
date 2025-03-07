package org.example.searching.linear;

import java.util.List;

public class Linear {


    /**
     * Implements a linear search on an array of ints.
     *
     * @param arr    An int array.
     * @param target The int to find.
     * @return The index of target if found, otherwise -1.
     */
    public static int linear(int[] arr, int target) {
        // TODO: Implement this method
        return -1;  // Placeholder
    }

    /**
     * Implements a linear search on a List of Integers.
     *
     * @param arr    An int array.
     * @param target The int to find.
     * @return The index of target if found, otherwise -1.
     */
    public static int linear(List<Integer> arr, int target) {
        // TODO: Implement this method
        return -1;  // Placeholder
    }


    /**
     * Finds the first occurrence of target in the array.
     *
     * @param arr    An int array.
     * @param target The int to find.
     * @return The index of target if found, otherwise -1.
     */
    public int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the last occurrence of target in the array.
     *
     * @param arr    An int array.
     * @param target The int to find.
     * @return The index of the last occurrence of target, otherwise -1.
     */
    public int findLastOccurrence(int[] arr, int target) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    /**
     * Counts the occurrences of target in the array.
     *
     * @param arr    An int array.
     * @param target The int to count.
     * @return The number of times target appears in arr.
     */
    public int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds the first non-repeating character in a string.
     *
     * @param str A string.
     * @return The index of the first non-repeating character, otherwise -1.
     */
    public int firstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches for a name in a list of strings.
     *
     * @param names  A list of strings.
     * @param target The name to find.
     * @return The index of the target if found, otherwise -1.
     */
    public int searchName(List<String> names, String target) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}





