package Homework3;

import java.util.HashSet;
import java.util.Objects;

public class User {
    private int age;
    private String name;



    public User(String name) {

        this.name = name;
    }
    public User(){
        
    }

    //Задача №1
    //1. Создать класс User, с двумя атрибутами - int age, String name
    //2. Создать экземпляр класса HashSet<User>
    //3. Переопределить хэш-код и приравнять его к пользователю так, чтобы при записи в HashSet были только отдельные имена юзера.
    //Задача №2
    //1. Create class UserBroken, с дополнительными атрибутами - int age, String name
    //2. Создать экземпляр класса HashSet<UserBroken>
    //3. Переопределить hashcode и equals так, чтобы при вставке любого юзера в HashSet,
    // в hashSet всегда присутствует один юзер


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
