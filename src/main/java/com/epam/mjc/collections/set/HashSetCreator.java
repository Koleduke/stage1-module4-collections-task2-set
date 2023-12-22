package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> res = new HashSet<>();
        for (Integer integer : sourceList) {
            int n = 1;
            if (integer % 2 == 0) {
                while (integer / (n) > 0) {
                    int jkg = integer;
                    Integer e = jkg / n;
                    res.add(e);
                    n = n * 2;
                }
            } else {
                res.add(integer);
                res.add(integer * 2);
            }
        }
            //System.out.println(sourceList.get(i));

        return res;
    }
}
