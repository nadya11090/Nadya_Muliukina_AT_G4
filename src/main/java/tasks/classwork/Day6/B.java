package tasks.classwork.Day6;

public class B {
    public static void main(String[] args) {
        A a = new A() {    //telo klassa
            //public int foo(int x) {
            //    int b = super.foo(x);
             //   System.out.println(b);
               // return b;
            };

        A b = new C();

        C c = new C();

        method(b, 2);
        method(c, 3);

        System.out.println(a.foo(3));

    }

    public static void method(A a, int z) {
        //kod
       int d = a.foo(z);
        //kod
    }
}
