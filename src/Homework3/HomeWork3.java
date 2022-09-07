package Homework3;

import java.util.HashMap;
import java.util.HashSet;

public class HomeWork3 {
    public static void main(String[] args) {
        //Задача №1
        //1. Создать класс User, с двумя атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<User>
        //3. Переопределить хэш-код и приравнять его к пользователю так, чтобы при записи в HashSet были только отдельные имена юзера.
        HashSet<User> users = new HashSet<>();
        boolean vasya = users.add(new User("Vasya"));
        boolean vasya2 = users.add(new User("Lidia"));
        boolean vasya3 = users.add(new User("Vasya"));
        System.out.println(users);
        //Задача №2

        //1. Create class UserBroken, с дополнительными атрибутами - int age, String name
        //2. Создать экземпляр класса HashSet<UserBroken>
        //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
        // в hashSet всегда присутствует один юзер
        HashSet<UserBroken> usersBroken = new HashSet<>();
        boolean user1 = usersBroken.add(new UserBroken("Vasya"));
        boolean user2 = usersBroken.add(new UserBroken("Lidia"));
        boolean user3 = usersBroken.add(new UserBroken("Vasya"));
        System.out.println(usersBroken);
            //Задача №3
        //1. Создать класс CarBroken
        //2. Создать экземпляр класса HashMap<CarBroken, Integer>
        //3. Переопределить hashcode и equals так, чтобы приставить любой CarBroken в HashMap,
        //всегда CarBroken попадал в один бакет.
        HashMap<CarBroken,Integer> carBroken = new  HashMap<>();
        carBroken.put(new CarBroken(),4);
        carBroken.put(new CarBroken(),5);
        carBroken.put(new CarBroken(),6);
        System.out.println(carBroken);
    }
}

