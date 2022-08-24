package Homework1;

public class Zoo <T, K, V>  {
    private T good;
    private K good2;
    private V good3;
    public Zoo(T good, K good2, V good3) {
        this.good = good;
        this.good2 = good2;
        this.good3 = good3;
    }

    public void setGood2(K good2) {
        this.good2 = good2;
    }

    public K getGood2() {
        return good2;
    }

    public void setGood3(V good3) {
        this.good3 = good3;
    }

    public V getGood3() {
        return good3;
    }

    public T getGood() {
        return good;
    }

    public void setGood(T good) {
        this.good = good;
    }


}
