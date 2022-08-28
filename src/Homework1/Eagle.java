package Homework1;

public class Eagle implements  flayble{
    private String eagle;

    public Eagle(String eagle) {
        this.eagle = eagle;
    }

    @Override
    public void fly() {
        System.out.println(this.eagle + " Летает");
    }

}
