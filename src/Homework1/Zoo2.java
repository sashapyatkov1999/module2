package Homework1;

public class Zoo2<Q,W,E> {
    private  Q good1;
    private  W good2;
    private  E good3;


    public Zoo2( Q good1, W good2, E good3) {
        this.good1 = good1;
        this.good2 = good2;
        this.good3 = good3;

    }

    public E getGood3() {
        return good3;
    }

    public Q getGood1() {
        return good1;
    }

    public W getGood2() {
        return good2;
    }
}
