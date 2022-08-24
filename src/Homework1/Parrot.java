package Homework1;

public class Parrot implements  flayble{
    private String parrot;

    public Parrot(String parrot) {
        this.parrot = parrot;
    }

    @Override
    public void fly() {
        System.out.println(this.parrot + " Летает");
    }
}
