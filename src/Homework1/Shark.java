package Homework1;

public class Shark extends AbstractZoo2 implements swimable{
    private String shark;

    public Shark(String shark) {
        this.shark = shark;
    }

    @Override
    public void swim() {
        System.out.println(this.shark + " Плавает");
    }
}
