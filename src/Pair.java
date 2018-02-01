public class Pair<L, R> {
    private L left;
    private R right;

    public Pair() {
        left = null;
        right = null;
    }

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L left() {
        return left;
    }

    public R right() {
        return right;
    }

    public void left(L l) {
        left = l;
    }

    public void right(R r) {
        right = r;
    }
}

