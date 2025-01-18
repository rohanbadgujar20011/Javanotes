package polymorphism;

class A {
    void  getEngin(){
        System.out.println("Hii from Javanotes.A");
    }
}

class  B extends  A{
    @Override
    void getEngin(){
        System.out.println("Hii from Javanotes.B");
    }
}


public class Main {
    public static void main(String[] args) {
        A objb= new B();
        objb.getEngin();
    }
}
