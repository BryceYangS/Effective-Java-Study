package effectivejava.chapter4.item24;

import effectivejava.chapter4.item25.Main;

/**
 * static member class
 */
class StaticMemberTest {
    private int OuterFoo = 10;

    int OuterBar(){
        InnerClass innerClass = new InnerClass();
        return innerClass.Test();
    }


    private static class InnerClass{
        int Test(){
            StaticMemberTest outer = new StaticMemberTest();
            return outer.OuterFoo;
        }
    }

}