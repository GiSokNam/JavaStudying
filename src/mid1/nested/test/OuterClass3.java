package mid1.nested.test;

public class OuterClass3 {

    // 지역 클래스

    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("NestedClass.hello");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.hello();
    }

}
