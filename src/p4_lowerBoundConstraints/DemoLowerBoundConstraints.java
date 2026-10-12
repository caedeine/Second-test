package p4_lowerBoundConstraints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoLowerBoundConstraints {
    public static void main(String[] args){
        //ArrayList<? super Integer> list1 = new ArrayList<>();//can store objects of the comparable type (int double, string)
        List<Double> list2 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();

        list1 = Arrays.asList(1,2,3,4,5);
        list2 = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
        display(list1); //OK
        //display(list2); //invalid wont work


        //list1.add("One"); //
        //list1.add(1); //OK now that we have ? super (Comparable or Number)
        //list1.add(1.5);// OK




    }
    public static void display(List<? super Integer> list){
        for (Object value : list){
            System.out.println(value);
        }
        System.out.println();
    }
}
