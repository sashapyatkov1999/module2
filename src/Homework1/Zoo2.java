package Homework1;

public class Zoo2<Q extends AbstracktZoo1,W extends AbstractZoo2,E extends AbstractZoo3> {
    private  Q good4;
    private  W good5;
    private  E good6;


    public Zoo2( Q good1, W good2, E good3) {
        this.good4 = good1;
        this.good5 = good2;
        this.good6 = good3;

    }

    public E getGood6() {
        return good6;
    }

    public Q getGood4() {
        return good4;
    }

    public W getGood5() {
        return good5;
    }
}
