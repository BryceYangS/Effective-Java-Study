package effectivejava.chapter4.item24;

public class Main {

    public static void main(String[] args) {
//        StaticMemberTest.InnerClass innerClass = new StaticMemberTest.InnerClass();
//        System.out.println(innerClass.Test()); // 10 출력
        StaticMemberTest outer = new StaticMemberTest();
        System.out.println(outer.OuterBar());

//        NonStaticTest.NonStaticInner inner = new NonStaticTest.NonStaticInner();
        NonStaticTest nonStaticOuter = new NonStaticTest();
        // 방법 1.
        NonStaticTest.NonStaticInner innerInstance = nonStaticOuter.getInnerInstance();
        // 방법 2.
        NonStaticTest.NonStaticInner inner = nonStaticOuter.new NonStaticInner();
    }
}
