package Homework1;

public class Fish implements swimable{
    private String fish;

    public Fish(String fish) {
        this.fish = fish;
    }

    @Override
    public void swim() {
        System.out.println(this.fish + " Плавает");
    }

}
