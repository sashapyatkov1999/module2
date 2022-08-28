package Homework1;

public class Zoo <T extends swimable, K extends bitable, V extends flayble>  {
    private T swimable;
    private K bitable;
    private V flyable;
    public Zoo(T good, K good2, V good3) {
        this.swimable = good;
        this.bitable = good2;
        this.flyable = good3;
    }
    public Zoo(){

    }
    public void feedFlyable() {
        System.out.println("Летающее животное ест");
        flyable.fly();
    }

    public void feedSwimable() {
        System.out.println("Плавающие животное ест");
        swimable.swim();
    }

    public void feedBitable() {
        System.out.println("Кусающее животное ест");
        bitable.bite();
    }

    public void setFlyable(V flyable) {
        this.flyable = flyable;
    }

    public void setBitable(K bitable) {
        this.bitable = bitable;
    }

    public void setSwimable(T swimable) {
        this.swimable = swimable;
    }

    public V getFlyable() {
        return flyable;
    }

    public K getBitable() {
        return bitable;
    }

    public T getSwimable() {
        return swimable;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "swimable=" + swimable +
                ", bitable=" + bitable +
                ", flyable=" + flyable +
                '}';
    }
}




