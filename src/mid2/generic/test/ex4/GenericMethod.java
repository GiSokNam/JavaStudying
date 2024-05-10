package mid2.generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("objMethod print = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("genericMethod print = " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }
}
