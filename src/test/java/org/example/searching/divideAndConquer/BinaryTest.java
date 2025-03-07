package org.example.searching.divideAndConquer;

import org.example.searching.nonLinear.divideAndConquer.Binary;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    private Binary binary;

    @BeforeEach
    void setUp() {
        binary = new Binary();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void binarySearch_elementExists() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, binary.binarySearch(arr, 4));
        assertEquals(0, binary.binarySearch(arr, 1));
    }

    @Test
    void binarySearch_largeElements() {
        int[] arr = {Integer.MAX_VALUE-4, Integer.MAX_VALUE-3, Integer.MAX_VALUE-2, Integer.MAX_VALUE-1, Integer.MAX_VALUE};
        assertEquals(3, binary.binarySearch(arr, 4));
        assertEquals(0, binary.binarySearch(arr, 1));
    }

    @Test
    void binarySearch_when_elementDoesNotExist() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, binary.binarySearch(arr, 6));
        assertEquals(-1, binary.binarySearch(arr, -10));
    }

    @Test
    void binarySearch_when_emptyArray() {
        int[] arr = {};
        assertEquals(-1, binary.binarySearch(arr, 3));
    }

    @Test
    void binaryUnsortedSearch_when_elementExists() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(3, binary.binarySearchUnsorted(arr, 4));
        assertEquals(0, binary.binarySearch(arr, 1));
    }

    @Test
    void binaryUnsortedSearch_elementDoesNotExist() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, binary.binarySearchUnsorted(arr, 6));
        assertEquals(-1, binary.binarySearch(arr, -10));
    }

    @Test
    void binaryUnsortedSearch_when_emptyArray() {
        int[] arr = {};
        assertEquals(-1, binary.binarySearchUnsorted(arr, 3));
    }

    @Test
    void binarySearchString_elementExists() {
        String[] arr = {"bear", "bird", "CAT", "cat", "dog"};
        assertEquals(2, binary.binarySearch(arr, "CAT"));
        assertEquals(3, binary.binarySearch(arr, "cat"));
    }

    @Test
    void binarySearchString_elementNotExists() {
        String[] arr = {"bear", "bird", "CAT", "cat", "dog"};
        assertEquals(-1, binary.binarySearch(arr, "CaT"));
        assertEquals(-1, binary.binarySearch(arr, "bar"));
    }

    @Test
    void binarySearchString_when_emptyArray() {
        String[] arr = {};
        assertEquals(-1, binary.binarySearch(arr, "cat"));
    }

    @Test
    void binaryUnsortedSearchString_elementExists() {
        String[] arr = {"cat", "dog", "bird", "CAT", "bear"};
        assertEquals(4, binary.binarySearchUnsorted(arr, "bear"));
        assertEquals(0, binary.binarySearch(arr, "cat"));
    }

    @Test
    void binaryUnsortedSearchString_elementNotExists() {
        String[] arr = {"cat", "dog", "bird", "CAT", "bear"};
        assertEquals(-1, binary.binarySearchUnsorted(arr, "elephant"));
        assertEquals(-1, binary.binarySearch(arr, "Bird"));
    }

    @Test
    void binaryUnsortedSearchString_when_emptyArray() {
        String[] arr = {};
        assertEquals(-1, binary.binarySearchUnsorted(arr, "cat"));
    }

    @Test
    void findMidpoint() {
        assertEquals(4, binary.findMidpoint(4,4));
        assertEquals(3, binary.findMidpoint(3,4));
    }

    @Test
    void findMidpoint_when_negative() {
        assertEquals(-5, binary.findMidpoint(-5,-6));
    }

    @Test
    void findMidpoint_when_largeInputs() {
        int smaller = Integer.MAX_VALUE-1;
        int larger = Integer.MAX_VALUE-2;
        int expected = smaller + (larger - smaller) /2;
        assertEquals(expected, binary.findMidpoint(smaller,larger));
    }

    @Test
    void findMidpoint_when_smallInputs() {
        int smaller = Integer.MIN_VALUE+2;
        int larger = Integer.MAX_VALUE+1;
        int expected = smaller + (larger - smaller) /2;
        assertEquals(expected, binary.findMidpoint(smaller,larger));
    }

    @Test
    void findPivot_whenPivotExists() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        assertEquals(3, binary.findPivot(nums));
    }

    @Test
    void findPivot_whenPivotAtStart() {
        int[] nums = {0, 1, -1};
        assertEquals(0, binary.findPivot(nums));
    }

    @Test
    void findPivot_whenPivotAtEnd() {
        int[] nums = {1, 2, 3, 4, 10};
        assertEquals(4, binary.findPivot(nums));
    }

    @Test
    void findPivot_whenNoPivotExists() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(-1, binary.findPivot(nums));
    }

    @Test
    void findPivot_whenAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        assertEquals(0, binary.findPivot(nums));
    }


    @Test
    void testSearchOnRotatedSortedArray_when_rotatedRight4Times() {
        assertEquals(4, binary.searchOnRotatedSortedArray(new int[]{4,5,6,7,0,1,2}, 0));
    }

    @Test
    void testSearchOnRotatedSortedArray_when_targetNotExists() {
        assertEquals(-1, binary.searchOnRotatedSortedArray(new int[]{4,5,6,7,0,1,2}, 3));
    }

    @Test
    void testSearchOnRotatedSortedArray_when_Length1() {
        assertEquals(0, binary.searchOnRotatedSortedArray(new int[]{1}, 1));
        assertEquals(-1, binary.searchOnRotatedSortedArray(new int[]{1}, 2));
    }

    @Test
    void testSearchOnRotatedSortedArray_when_Length0() {
        assertEquals(-1, binary.searchOnRotatedSortedArray(new int[0], 1));
        assertEquals(-1, binary.searchOnRotatedSortedArray(new int[0], 2));
    }

    @Test
    void testFindFirstLast() {
        assertArrayEquals(new int[]{3, 4}, binary.findFirstLast(new int[]{5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[]{-1, -1}, binary.findFirstLast(new int[]{5,7,7,8,8,10}, 6));
        assertArrayEquals(new int[]{0, 0}, binary.findFirstLast(new int[]{1}, 1));
    }

    @Test
    void testSqrt_Returns_Expected_Integers() {
        assertEquals(2, binary.sqrt(4));
        assertEquals(2, binary.sqrt(8));
        assertEquals(3, binary.sqrt(9));
        assertEquals(0, binary.sqrt(0));
        assertEquals(1, binary.sqrt(1));
    }

    @Test
    void testSqrt_Returns_Expected_Floor() {
        assertEquals(12, binary.sqrt(145));
        assertEquals(3, binary.sqrt(10));
        assertEquals(6, binary.sqrt(45));
    }

    @Test
    void testSqrt_Returns_Expected_Integer_When_Negative() {
        assertEquals(-1, binary.sqrt(-144));
        assertEquals(-3, binary.sqrt(-10));
        assertEquals(-1, binary.sqrt(-9));
    }
}