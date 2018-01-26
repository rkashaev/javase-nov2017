package lesson180126;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExamples {


    public static void main(String[] classNames) {
        if (classNames.length > 0) {

            for (String className : classNames) {
                try {
                    Class<?> cls = Class.forName(className);

                    Method[] methods = cls.getDeclaredMethods();

                    Field f = cls.getDeclaredField("str");

                    if (f != null) {
                        System.out.println("We've got a field str!");
                    }

                    for (Method method : methods) {
                        processMethod(cls, method, f);
                    }

                } catch (ClassNotFoundException e) {
                    System.err.printf("Can't find a class %s in class path%n", className);
                    e.printStackTrace();
                } catch (ReflectiveOperationException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void processMethod(Class<?> cls, Method method, Field f) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        MyCuteTestAnnotation testAnnotation = method.getAnnotation(MyCuteTestAnnotation.class);
        if (testAnnotation != null) {
            Object instance = cls.newInstance();

            if (f != null) {
                f.setAccessible(true);
                f.set(instance, "Hello reflection world! for " + method);
            }

            System.out.println("Invoking a method: " + method.getName());
            method.invoke(instance);
        }
    }
}
