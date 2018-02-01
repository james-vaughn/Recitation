public class PairBuilder<A, B> {
    private A left;
    private B right;

    public PairBuilder() {
        left = null;
        right = null;
    }

    public PairBuilder withLeft(A a) {
        left = a;
        return this;
    }

    public PairBuilder withRight(B b) {
        right = b;
        return this;
    }

    public Pair build() {
        return new Pair<A, B>(left, right);
    }
}