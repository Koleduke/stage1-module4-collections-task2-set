package com.epam.mjc.collections.set;
import java.util.HashSet;
import java.util.List;

import java.util.Set;
import java.util.LinkedHashSet;


public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer integer : sourceList) {
            if (integer * integer >= lowerBound && integer * integer <= upperBound) {
                set.add(integer * integer);
            }
        }
    return set;}
}
