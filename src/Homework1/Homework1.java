package Homework1;
import java.util.ArrayList;
public class Homework1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Кошка");
        Zoo<Cat> catZoo = new Zoo<>(cat);
        catZoo.getGood().bite();
        Dog dog = new Dog("Собака");
        Zoo<Dog> dogZoo = new Zoo<>(dog);
        dogZoo.getGood().bite();
        Eagle eagle = new Eagle("Орел");
        Zoo<Eagle> eagleZoo = new Zoo<>(eagle);
        eagleZoo.getGood().fly();
        Parrot parrot = new Parrot("Попугай");
        Zoo<Parrot> parrotZoo = new Zoo<>(parrot);
        parrotZoo.getGood().fly();
        Fish fish = new Fish("Рыба");
        Zoo<Fish> fishZoo = new Zoo<>(fish);
        fishZoo.getGood().swim();
        Shark shark = new Shark("Акула");
        Zoo<Shark> sharkZoo = new Zoo<>(shark);
        sharkZoo.getGood().swim();
        Zoo<Cat,Shark,Dog,Eagle,> = new Zoo<>(cat,shark,dog,eagle);

        //Задача №1
        //Создать интерфейсы flyable (метод void fly()), swimable (метод void swim), bitable (метод void bite)
        //Создать класс Zoo, который может содержать в себе 3-х вида животных
        //1. Животное плавающее
        //2. Животное летающее
        //3. Животное кусающее
        //В классе Zoo будут методы получения и замены этих животных. Получить мы должны конкретные классы,
        //а не интерфейсы.
        //Зоопарк имеет методы - void feedFlyable(),void feedSwimable(),void feedBitable(). Логика внутри метода:
        //Печать на экран "летающее животное ест", вызов у животного метода fly() и тд.
        //Создать 6 классов животных - 2 класса плавающих, 2 класса летающих, 2 класса кусающих.
        //Создать по одному экземпляру на каждый класс.
        //Создать 2 экземпляра зоопарка и распределить животных по зоопаркам.
        //Никаких проверок if instanceof быть не должно, и внутри Zoo будут лежать Generics, а не интерфейсы.

        //Задача №2
        //Создать класс MyList с атрибутами T[] objects, int size. T - generics.
        //Массив T[] будет создаваться при создании экземпляра класса MyList с размерностью 3.
        //Создать метод add. Он будет добавлять элемент в массив object. Если в массиве уже 3 элемента есть, то нужно:
        //1.Создать новый массив T[] с размерностью в два раза больше предыдущей.
        //2.Скопировать со старого массива все значения в новый
        //3.Присвоить экземпляру MyList новый массив.
    }
}