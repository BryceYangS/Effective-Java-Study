package effectivejava.chapter4.item24;

public class AnonymousTest {



    static Inner innerClass(){
        return new Inner() {
//            static  String foo = "foo";
            String bar = "bar";

            @Override
            public void Hello(String input) {
                System.out.println(input);
            }

            @Override
            public void Hi() {
                System.out.println("hi");
            }
        };
    }

    // if a inerface has only a method, you can use the lambda
//    Inner useLambda(){
//        return (String input) -> {
//            System.out.println(input);
//        };
//    }


    interface Inner{
        void Hello(String input);
        void Hi();
    }
}
