package annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
@interface MyAnnotation {
    String value() default "默认值";
}

@MyAnnotation("测试注解")
class TestClass {
}

public class Yuanannotation {
    public static void main(String[] args) {
        if (TestClass.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation anno = TestClass.class.getAnnotation(MyAnnotation.class);
            System.out.println("注解值: " + anno.value());
        }

        System.out.println("\n四个元注解说明:");
        System.out.println("@Retention - 注解保留策略");
        System.out.println("  RUNTIME: 运行时可用(反射可读取)");
        System.out.println("  CLASS: 编译时记录到class文件");
        System.out.println("  SOURCE: 仅源码阶段有效");
        System.out.println("\n@Target - 注解使用位置");
        System.out.println("  TYPE: 类/接口/枚举");
        System.out.println("  METHOD: 方法");
        System.out.println("  FIELD: 字段");
        System.out.println("\n@Documented - 生成javadoc时包含注解");
        System.out.println("@Inherited - 子类可继承父类的注解");
    }
}
