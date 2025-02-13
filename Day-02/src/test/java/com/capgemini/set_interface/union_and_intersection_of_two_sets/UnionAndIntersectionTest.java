package com.capgemini.set_interface.union_and_intersection_of_two_sets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

import static com.capgemini.set_interface.union_and_intersection_two_sets.TwoSets.intersectionOperation;
import static com.capgemini.set_interface.union_and_intersection_two_sets.TwoSets.unionOperation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UnionAndIntersectionTest {

    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

    // First test case for union and intersection

    @Test
    void testFirst(){
        Set<Integer> intersection = intersectionOperation(set1,set2);
        Set<Integer> union = unionOperation(set1,set2);

        assertEquals(union,unionOperation(set1,set2));
        assertEquals(intersection,intersectionOperation(set1,set2));
    }

    @Test
    void testSecond(){
        Set<Integer> intersection = intersectionOperation(set1,set2);
        Set<Integer> union = unionOperation(set1,set2);
        assertNotEquals(union,intersection);
    }
}
