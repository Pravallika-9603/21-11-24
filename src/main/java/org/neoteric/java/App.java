package org.neoteric.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App
{

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




        OverridingWithGenerics overridingTest=new OverridingWithGenerics();
        overridingTest.print();
        ChildClass overridingTest1=new ChildClass();
        overridingTest1.print();
        OverridingWithGenerics overridingTest2=new ChildClass();
        overridingTest2.print();

    }
}
