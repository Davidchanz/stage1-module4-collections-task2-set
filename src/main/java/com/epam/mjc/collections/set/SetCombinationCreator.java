package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new TreeSet<>();

        Set<String> firstWithOutThird = new TreeSet<>(firstSet);
        firstWithOutThird.removeAll(thirdSet);

        Set<String> secondWithOutThird = new TreeSet<>(secondSet);
        secondWithOutThird.removeAll(thirdSet);

        Set<String> firstAndSecond = new TreeSet<>(firstWithOutThird);
        firstAndSecond.addAll(secondWithOutThird);

        Set<String> firstUnique = new TreeSet<>(firstWithOutThird);
        firstUnique.removeAll(secondWithOutThird);

        Set<String> secondUnique = new TreeSet<>(secondWithOutThird);
        secondUnique.removeAll(firstWithOutThird);

        firstAndSecond.removeAll(firstUnique);
        firstAndSecond.removeAll(secondUnique);

        Set<String> thirdUnique = new TreeSet<>(thirdSet);
        thirdUnique.removeAll(firstSet);
        thirdUnique.removeAll(secondSet);

        result.addAll(firstAndSecond);
        result.addAll(thirdUnique);
        return result;
    }
}
