package org.neoteric.java;

import java.util.ArrayList;
import java.util.HashSet;
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

        public static void main(String[] args) {
            OverloadingWithGenerics printer = new OverloadingWithGenerics();

            List<String> stringList = new ArrayList<>();
            stringList.add("a");
            stringList.add("b");
            stringList.add("a");
            printer.print(stringList);

            Set<Integer> intSet = new HashSet<>();
            intSet.add(1);
            intSet.add(2);
            intSet.add(1);
            printer.print(intSet);

            int singleItem = 78955;
            printer.print(singleItem);
        }
    }


