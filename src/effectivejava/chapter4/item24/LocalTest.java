package effectivejava.chapter4.item24;

public class LocalTest {

    private int foo = 1;

    void localMethod(){
        class LocalClass{
            private int innerFoo = 2;
            void sum(){
                System.out.println(foo + innerFoo);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.sum();

    }

    public static void main(String[] args) {
        LocalTest localTest = new LocalTest();
        localTest.localMethod();
    }
}
