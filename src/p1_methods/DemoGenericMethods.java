package p1_methods;

public class DemoGenericMethods {
    public static void main(String[] args){
        String[] names = {"A", "B", "C", "D"};
        Integer[] numbers = {1,2,3,4,5,6};
        displayArray(names);
        displayArray(numbers);
        //displayStringArr(names);
        //displayIntegerArr(numbers);


    }
    //old way: new method for every use
    public static void displayStringArr(String[]a){
        for (String e : a){
            System.out.println(e + "");
        }
    }
    public static void displayIntegerArr(Integer[]a){
        for (int e : a){
            System.out.println(e + "");
        }
    }


    //new way
    public static <E> void displayArray(E[]arr){
        for (E e : arr){//
            System.out.print(e + " ");
        }
        System.out.println();

    }
    //Erasure replaces the placeholder E with a specific reference type. Happens when you compile the program
    //the bytecode thus has no more placeholders; generics will not affect the performance

}
