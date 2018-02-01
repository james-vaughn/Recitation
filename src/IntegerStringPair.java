//Concrete type pair
//Do not want to have to create a pair for each type needed
public class IntegerStringPair {
    private Integer left;
    private String right;

    public IntegerStringPair() {
        left = null;
        right = null;
    }

    public IntegerStringPair(Integer left, String right) {
        this.left = left;
        this.right = right;
    }

    public Integer left() {
        return left;
    }

    public String right() {
        return right;
    }

    public void left(Integer l) {
        left = l;
    }

    public void right(String r) {
        right = r;
    }
}
