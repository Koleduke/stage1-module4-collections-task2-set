package com.epam.mjc.collections.set;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0; i<firstSet.size();i++){
            String uyfh;
            uyfh= String.valueOf(firstSet.toArray()[i]);
            if(secondSet.contains(uyfh)&&!thirdSet.contains(uyfh)){
                set.add(uyfh);
            }
        }
        for(int i = 0; i<thirdSet.size();i++){
            String uyfh;
            uyfh= String.valueOf(thirdSet.toArray()[i]);
            if(!secondSet.contains(uyfh)&&!firstSet.contains(uyfh)){
                set.add(uyfh);
            }
        }
        return set;}

}
