package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectAPI {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Student.class;

        System.out.println("===== 1.获取类信息 =====");
        System.out.println("类名: " + clazz.getName());
        System.out.println("简单类名: " + clazz.getSimpleName());

        System.out.println("\n===== 2.获取构造方法 =====");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println("构造方法: " + c.getName() + "(" +
                    c.getParameterCount() + "个参数)");
        }

        System.out.println("\n===== 3.获取成员变量 =====");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("字段: " + field.getType().getSimpleName() +
                    " " + field.getName());
        }

        System.out.println("\n===== 4.获取成员方法 =====");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("方法: " + method.getReturnType().getSimpleName() +
                    " " + method.getName() + "(" +
                    method.getParameterCount() + "个参数)");
        }

        System.out.println("\n===== 5.创建对象并操作 =====");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "张三");

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.setInt(obj, 20);

        System.out.println("name: " + nameField.get(obj));
        System.out.println("age: " + ageField.getInt(obj));

        System.out.println("\n===== 6.调用方法 =====");
        Method getNameMethod = clazz.getMethod("getName");
        System.out.println("getName(): " + getNameMethod.invoke(obj));

        Method setNameMethod = clazz.getMethod("setName", String.class);
        setNameMethod.invoke(obj, "李四");
        System.out.println("setName后: " + getNameMethod.invoke(obj));
    }
}
//反射的作用： 可以在运行时得到一个类的全部成分然后操作
// 也可以破坏封装性
//可以破坏泛型的约束性
//最重要的作用就是适合做Java的高级框架
// 主流框架都会基于反射设计一些基本功能