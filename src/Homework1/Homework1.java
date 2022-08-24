package Homework1;

public class Homework1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Кошка");
        Parrot parrot = new Parrot("Попугай");
        Fish fish = new Fish("Рыба");

        Dog dog = new Dog("Собака");
        Eagle eagle = new Eagle("Орел");
        Shark shark = new Shark("Акула");
        Zoo<Cat,Fish,Parrot> zoo = new Zoo<>(cat, fish, parrot);
        zoo.getGood().bite();
        Zoo2<Dog,Eagle,Shark> zoo2 = new Zoo2<>(dog, eagle, shark);
        zoo2.getGood1().bite();
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.
    }
}