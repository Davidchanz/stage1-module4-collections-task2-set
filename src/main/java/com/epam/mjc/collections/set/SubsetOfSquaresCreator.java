package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = new TreeSet<>();
        for(var source: sourceList){
            result.add(source*source);
        }
        result = new TreeSet<>(result.subSet(lowerBound, true, upperBound, true));
        return result;
    }
}
