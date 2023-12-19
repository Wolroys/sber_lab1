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
        System.out.println("Child constructor");
    }

    public Child(String name) {
        super(name); //Обращаюсь к родительскому конструктору с параметром для его вызова, иначе
                    // произойдёт вызов родительского конструктора без параметров
        System.out.println("Child:name-constructor 2");
    }

    {
        System.out.println("Child:instance 2");
    }
}
