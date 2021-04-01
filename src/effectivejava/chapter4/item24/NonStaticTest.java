package effectivejava.chapter4.item24;

public class NonStaticTest {

    public NonStaticInner getInnerInstance(){
        return new NonStaticInner();
    }

    class NonStaticInner{
        public int innerFoo = 10;
    }
}
