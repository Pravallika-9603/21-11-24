package org.neoteric.java;

public class OverridingTest {

    public static void main(String[] args) {

        OverridingWithGenerics overridingTest=new OverridingWithGenerics();
        overridingTest.print();
        ChildClass overridingTest1=new ChildClass();
        overridingTest1.print();
        OverridingWithGenerics overridingTest2=new ChildClass();
        overridingTest2.print();

    }

}
