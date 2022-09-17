package HomeWork4;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException {
        UserMeta sasha = new UserMeta("Sasha" , 20);
        UserMeta.getAnnotationClass(sasha);
        UserMeta.getAnnotationField(sasha);
        UserMeta.getAnnotationTime(sasha);
    }
}
