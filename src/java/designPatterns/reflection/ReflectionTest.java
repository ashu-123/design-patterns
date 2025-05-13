package reflection;

import java.lang.reflect.*;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Example> clazz = Example.class;
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getDeclaredFields().length);
        for(Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        int classModifiers = clazz.getModifiers();
        System.out.println(Modifier.isPublic(classModifiers));
        Constructor<Example> constructor = clazz.getConstructor(String.class);
        System.out.println(constructor.getName());
        System.out.println(constructor.newInstance("John").getName());
    }
}
