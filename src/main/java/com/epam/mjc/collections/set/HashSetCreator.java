package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for(var source: sourceList){
            if(source % 2 == 0){
                int sourceDiv = source;
                while (sourceDiv % 2 == 0){
                    result.add(sourceDiv);
                    sourceDiv /= 2;
                }
                result.add(sourceDiv);
            }else {
                result.add(source);
                result.add(source*2);
            }
        }
        return result;
    }
}
