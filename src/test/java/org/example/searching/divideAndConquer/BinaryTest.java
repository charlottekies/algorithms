package org.example.searching.divideAndConquer;

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
    void binarySearch_elementDoesNotExist() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, binary.binarySearch(arr, 6));
        assertEquals(-1, binary.binarySearch(arr, -10));
    }

    @Test
    void binarySearch_emptyArray() {
        int[] arr = {};
        assertEquals(-1, binary.binarySearch(arr, 3));
    }

    @Test
    void binaryUnsortedSearch_elementExists() {
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
    void binaryUnsortedSearch_emptyArray() {
        int[] arr = {};
        assertEquals(-1, binary.binarySearchUnsorted(arr, 3));
    }

    // TODO: Implement tests
    @Test
    void searchOnRotatedSortedArray() {
    }

    @Test
    void findFirstLast() {
    }

    @Test
    void sqrt() {
    }
}