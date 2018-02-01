public class NonGenericPair {
    private Object left;
    private Object right;

    public NonGenericPair() {
        left = null;
        right = null;
    }

    public NonGenericPair(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public Object left() {
        return left;
    }

    public Object right() {
        return right;
    }

    public void left(Object l) {
        left = l;
    }

    public void right(Object r) {
        right = r;
    }
}
