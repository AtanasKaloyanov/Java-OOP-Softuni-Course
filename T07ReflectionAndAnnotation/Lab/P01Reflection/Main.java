package T07ReflectionAndAnnotation.Lab.P01Reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class clazz = Reflection.class;
        System.out.println(clazz);
        System.out.println(clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();
        Arrays.stream(interfaces).forEach(System.out::println);

        System.out.println(clazz.getDeclaredConstructor().newInstance());

    }
}
