package com.InterviewQueWithCollectionFramework.comparableAndComparator;

import java.util.Comparator;

public interface Comparing {
    Comparator<Students> byName=new Comparator<Students>() {
        @Override
        public int compare(Students o1, Students o2) {
            return o1.Name.compareToIgnoreCase(o2.Name);
        }
    };
}
