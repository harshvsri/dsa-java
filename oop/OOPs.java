package com.harsh.oop;

public class OOPs {
    public static void main(String[] args) {
//        Student harsh = new Student("Harsh", 48, 8.08f);
//        System.out.println(harsh.name);
//        System.out.println(harsh.rollNo);
//        System.out.println(harsh.marks);

//        harsh.changeName("Harsh V Srivastava");
//        harsh.greet();


//        Student aman;
//        for(int i=0; i<1000000; i++) {
//            aman = new Student(48);
//        }


        Human harsh = new Human("Harsh", 18, 10000, false);
        Human khushi = new Human("Smriti", 19, 50000, false);
        Human aman = new Human("Aman", 21, 1000000, true);
//        System.out.println(Human.population);
//        System.out.println(aman.population);


        System.out.println(StaticClass.a + " " + StaticClass.b);


    }

    static class Student {
        String name;
        int rollNo;
        float marks;

        void changeName(String newName) {
            this.name = newName;
        }

        void greet() {
            System.out.println("Hello, " + this.name);
        }

        // CONSTRUCTOR
        Student(String name, int rollNo, float marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        public Student(int rollNo) {
            this.rollNo = rollNo;
        }

        // DESTRUCTOR
//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Object Destroyed");
//        }
    }

    static class Human{
        String name;
        int age;
        int netWorth;
        boolean married;
        static int population;

        public Human(String name, int age, int netWorth, boolean married) {
            this.name = name;
            this.age = age;
            this.netWorth = netWorth;
            this.married = married;
            Human.population += 1;
        }
    }

    static class StaticClass{
        static int a = 5;
        static int b = 5;

        // To modify a static variable we need a static scope.
        static {
            b = a*5;
        }
    }


}

