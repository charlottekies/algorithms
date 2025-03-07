package org.example.searching.divideAndConquer;

import org.example.searching.linear.Linear;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LinearTest {
    private Linear linear;

    @BeforeEach
    void setUp() {
        linear = new Linear();
    }

    @Test
    void testFindFirstOccurrence() {
        int[] nums = {4, 2, 5, 2, 7, 8, 2};
        Assert.assertEquals(linear.findFirstOccurrence(nums, 2), 1);
    }

    @Test
    void testFindFirstOccurrence_EmptyArray() {
        int[] nums = {};
        Assert.assertEquals(linear.findFirstOccurrence(nums, 2), -1);
    }

    @Test
    void testFindFirstOccurrence_Negatives() {
        int[] nums = {-4, -2, 5, -2, -7, -8, -2};
        Assert.assertEquals(linear.findFirstOccurrence(nums, -2), 1);
        nums[1] = 2;
        Assert.assertEquals(linear.findFirstOccurrence(nums, -2), 3);
    }

    @Test
    void testFindLastOccurrence() {
        int[] nums = {4, 2, 5, 2, 7, 8, 2};
        assertEquals(linear.findLastOccurrence(nums, 2),6);
    }


    @Test
    void testFindLastOccurrence_EmptyArray() {
        int[] nums = {};
        assertEquals(linear.findLastOccurrence(nums, 2),-1);
    }


    @Test
    void testFindLastOccurrence_Negatives() {
        int[] nums = {};
        assertEquals(linear.findLastOccurrence(nums, 2),-1);
    }

    @Test
    void testCountOccurrences() {
        int[] nums = {4, 2, 5, 2, 7, 8, 2};
        assertEquals(linear.countOccurrences(nums, 2), 3);
    }

    @Test
    void testFindFirstNonRepeating() {
        assertEquals(linear.firstNonRepeatingCharacter("swiss"), 0);
    }


    @Test
    void testSearchNames() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        assertEquals(linear.searchName(names, "Charlie"), 2);
    }
}
