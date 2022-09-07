package Homework3;

import java.util.HashSet;
import java.util.Objects;

public class UserBroken {
    private int age;
    private String name;

    public UserBroken(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return  true;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        UserBroken that = (UserBroken) o;
//        return name.equals(that.name);
//    }

    @Override
    public int hashCode() {
        return 17;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
