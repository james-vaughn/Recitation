import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        IntegerStringPair ISPair = new IntegerStringPair(1, "one");
        System.out.println(ISPair.left() + " " + ISPair.right());

        Pair<Integer, String> pair = new Pair<>(2, "two");
        Pair<ArrayList<Integer>, File> pair2 = new Pair<>(new ArrayList<>(), new File(""));

        Integer integer = pair.left();
        String str = pair.right();

        System.out.println(integer+ " " + str);

        //Cannot use non-objects as generic types
        //That includes ints, floats, booleans, bytes, etc.
        //E.g.
        //Pair<int, float> badPair = new Pair<>();

        Pair p  = new PairBuilder<Integer, String>().withLeft(3).withRight("three").build();
        System.out.println(p.left() + " " + p.right());


        //compile error due to type mismatch
        //Pair p = new PairBuilder<Integer, Integer>().withLeft("test").build();


        NonGenericPair nonGenericPair = new NonGenericPair(1, "one");
        nonGenericPair.left("test");
        nonGenericPair.left(5.7);

        //compile error due to type mismatch
        //pair.left("test");
    }
}
