package objecttest;

public class ObjectTest {
    
    public void test1(){
        Aaa aaa = new Aaa();
        System.out.println("i: " + aaa.i + "; c: " + aaa.c);
        System.out.println(aaa.c == '\u0000');
    }
    
    public void test2(){
        Aaa aaa1 = new Aaa();
        aaa1.si = 34;
        Aaa aaa2 = new Aaa();
        System.out.println(aaa2.si == 34);
    }
    
    
    public static void main(String[] args) {
        ObjectTest ot = new ObjectTest();
        ot.test1();
        
        ot.test2();
        
        
    }
    
}
