package Homework1;

public class Homework1 {

    public static void main(String[] args) {
        Cat cat = new Cat("Кошка");
        Parrot parrot = new Parrot("Попугай");
        Fish fish = new Fish("Рыба");

        Dog dog = new Dog("Собака");
        Eagle eagle = new Eagle("Орел");
        Shark shark = new Shark("Акула");
        Zoo<Cat, Fish, Parrot> zoo = new Zoo<Cat, Fish, Parrot>(cat, fish, parrot);
        zoo.getGood().bite();
        Zoo2<Dog, Shark, Eagle> zoo2 = new Zoo2<Dog, Shark, Eagle>(dog, shark, eagle);
        zoo2.getGood4().bite();


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