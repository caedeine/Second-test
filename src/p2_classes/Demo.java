package p2_classes;

public class Demo {
    public static void main(String[] args){
        Point<Integer> p1 = new Point<>(5,10);
        System.out.println(p1);
        Point<Double> p2 = new Point<>(5.5,10.5);
        System.out.println(p2);

        Point<String> p3 = new Point<>("Five", "Ten");



        // Not allowed, we said its String
        // Point<String> p4 = new Point<>("Five", 10);

        //This is technically allowed but you shouldn't do it
        //Point<Object> p4 = new Point<>("Five", 10);

        Point2<Integer,Integer> p5 = new Point2<>(5,10); // OK due to Point2 class
        Point2<String,Double> p6= new Point2<>("Five",10.5);// OK
    }
}
