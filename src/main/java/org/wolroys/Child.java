package org.wolroys;

public class Child extends Parent{

    static {
        System.out.println("Child:static 1");
    }

    {
        System.out.println("Child:instance 1");
    }

    static {
        System.out.println("Child:static 2");
    }

    Child(){
        super();
        System.out.println("Child constructor");
    }

    public Child(String name) {
        super(name);
        System.out.println("Child:name-constructor 2");
    }

    {
        System.out.println("Child:instance 2");
    }
}
