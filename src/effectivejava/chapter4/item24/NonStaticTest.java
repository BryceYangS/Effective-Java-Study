package effectivejava.chapter4.item24;

public class NonStaticTest {

    public NonStaticInner getInnerInstance(){
        return new NonStaticInner();
    }

    private void hi(){
        System.out.println("Hi");
    }


    class NonStaticInner{
        public int innerFoo = 10;

        void innerHi(){
            NonStaticTest.this.hi();
        }
    }
}
