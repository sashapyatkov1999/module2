package Homework1;

public class Dog extends AbstracktZoo1 implements bitable{
    private String dog ;

    public Dog(String dog) {
        this.dog = dog;
    }

    @Override
    public void bite() {
        System.out.println(this.dog + "Кусается");
    }
}
