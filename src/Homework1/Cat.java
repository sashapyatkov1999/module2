package Homework1;

public class Cat extends AbstracktZoo1 implements bitable  {
    private String cat;

    public Cat(String cat) {
        this.cat = cat;
    }

    @Override
    public void bite() {
        System.out.println(this.cat + "Кусается");
    }
}
