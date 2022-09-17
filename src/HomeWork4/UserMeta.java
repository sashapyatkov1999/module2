package HomeWork4;

import Homework3.User;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
@GetMetaData
public class UserMeta {
    @GetMetaData
    private String name;
    @GetMetaData
    private Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }
    @GetMetaData
    private  void GetSuperName(String pefix) throws InterruptedException {
        Thread.sleep(10);
        System.out.println("111");
    }

    public static void getAnnotationClass(UserMeta userMeta) throws NoSuchMethodException {
        Class clazz = userMeta.getClass();

        if (clazz.getClass().isAnnotationPresent(GetMetaData.class)){
            for (Field declaredField : clazz.getDeclaredFields()){
                declaredField.setAccessible(true);
                Arrays.stream(clazz.getDeclaredFields()).forEach(Field::getName);
            }
        }
    }
    static void getAnnotationField(UserMeta userMeta) throws IllegalAccessException {
        Class clazz = userMeta.getClass();
        Field[] field = clazz.getDeclaredFields();

        for (Field field1 : field){
            if (field1.isAnnotationPresent(GetMetaData.class)){
                field1.setAccessible(true);
                System.out.println(field1.get(userMeta).toString());
            }
        }
    }
     static void getAnnotationTime(UserMeta userMeta) throws IllegalAccessException {
        if (userMeta.getClass().isAnnotationPresent(GetMetaData.class)){
            long start = System.currentTimeMillis();
            long end  = System.currentTimeMillis();
            System.out.println("Время " + (start - end));
        }

    }
}
