package org.neoteric.java;

import java.util.List;
import java.util.Set;

public class OverloadingWithGenerics {

    public <T> void print(List<T> list) {
        System.out.println("List:");
        for (T item : list) {
            System.out.println(item);
        }
    }


    public <T> void print(Set<T> set) {
        System.out.println("Set:");
        for (T item : set) {
            System.out.println(item);
        }
    }


    public <T> void print(T item) {
        System.out.println(item);
    }

}


