import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "one");
        Pair<ArrayList<Integer>, File> pair2 = new Pair<>(new ArrayList<>(), new File(""));

        Integer integer = pair.left();
        String str = pair.right();

        //Cannot use non-objects as generic types
        //That includes ints, floats, booleans, bytes, etc.
        //E.g.
        //Pair<int, float> badPair = new Pair<>();

        Pair p  = new PairBuilder<Integer, String>().withLeft(3).withRight("test3").build();
        System.out.println(p.left() + " " + p.right());


        //compile error due to type mismatch
        //Pair p = new PairBuilder<Integer, Integer>().withLeft("test").build();


        NonGenericPair nonGenericPair = new NonGenericPair(1, "test");
        nonGenericPair.left("test");
        nonGenericPair.left(5.7);

        //compile error due to type mismatch
        //pair.left("test");
    }
}
