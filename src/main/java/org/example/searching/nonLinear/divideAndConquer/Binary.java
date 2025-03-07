package org.example.searching.nonLinear.divideAndConquer;

public class Binary {
    /**
     * Implement binary search on a sorted array of integers.
     * @param arr A sorted integer array.
     * @param target The integer to find.
     * @return The index of target if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        // TODO: Implement this method
        return -1;  // Placeholder
    }

    /**
     * Implement binary search on a sorted array of integers.
     * @param arr An UNSORTED integer array.
     * @param target The integer to find.
     * @return The index of target if found, otherwise -1.
     */
    public static int binarySearchUnsorted(int[] arr, int target) {
        // TODO: Implement this method
        return -1;  // Placeholder
    }

    /**
     * Implement binary search on a sorted array of integers.
     * @param arr A sorted integer array.
     * @param target The integer to find.
     * @return The index of target if found, otherwise -1.
     * This method is case sensitive (e.g. "cat" != "CAT")
     */
    public static int binarySearch(String[] arr, String target) {
        // TODO: Implement this method
        return -1;  // Placeholdere
    }

    /**
     * Implement binary search on a sorted array of Strings.
     * @param arr An UNSORTED String array.
     * @param target The String to find.
     * @return The index of target if found, otherwise -1.
     * This method is case sensitive (e.g. "cat" != "CAT")
     */
    public static int binarySearchUnsorted(String[] arr, String target) {
        // TODO: Implement this method
        return -1;  // Placeholder
    }



    /*
    Challenges
    */

    /**
     * Finds the midpoint between two ints
     * @param lower the smaller of the two ints
     * @param higher the larger of the two ints
     * @return the midpoint of lower and higher
     */
    public static int findMidpoint(int lower, int higher) {
        // TODO: Implement a method that finds the midpoint between two integers.
        //  If the number is not divisible by two, return the floor (integer below the resulting non-integer value).
        // Hint: Consider complications that arise when you try to find the midpoint between two VERY large ints.
        return -1;
    }

    /**
     * Finds the pivot of a rotated, sorted array
     * @param nums a sorted array that is potentially rotated on an unknown pivot
     * @return The index on which the array is pivoted, otherwise, -1.
     */
    public static int findPivot(int[] nums) {
        // TODO: Implement binary search to discover the pivot of a rotated array
        return -1; // Placeholder
    }

    /**
     * Finds the index of the target in a rotated sorted array.
     * @param nums The rotated sorted array.
     * @param target The number to search for.
     * @return The index of the target if found, otherwise -1.
     */
    public static int searchOnRotatedSortedArray(int[] nums, int target) {
        // TODO: Implement binary search for rotated sorted array
        return -1; // Placeholder
    }

    /**
     * Finds the first and last position of a target in a sorted array.
     * @param nums The sorted array.
     * @param target The number to search for.
     * @return An array containing the first and last index of the target.
     */
    public static int[] findFirstLast(int[] nums, int target) {
        // TODO: Implement binary search to find first and last occurrence
        return new int[]{-1, -1}; // Placeholder
    }

    /**
     * Finds the integer square root of x using binary search.
     * If x does not have an exact integer square root, it should return the floor value, i.e. the largest integer whose square is ≤ x.
     * @param x The non-negative integer.
     * @return The integer square root of x, or the floor value (closest integer below the square root if the square root is not an integer).
     * Returns -1 when a negative integer is provided.
     */
    public static int sqrt(int x) {
        // TODO: Implement binary search to approximate square root
        return -1; // Placeholder
    }
}
