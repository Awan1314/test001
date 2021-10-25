public class Test03 {
    public static void main(String[] args) {
        A a = new D();
        B b = new D();
        C c = new D();

        B b1 = (B)a;
        b1.m2();

        if (a instanceof D) {
            D d = (D)a;
            d.m2();
        }



        M m = new E();
        // 经过测试:接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转。
        // 但是一定要注意，运行时可能会出现classCastException异常。
        // 编译没问题，运行有问题。
        //N n = (N)m;
        if (m instanceof N){
            N n = (N)m;
        }
    }
}
interface M{

}
interface N{

}
class E implements M{

}
interface A{
    public abstract void m1();
}

interface B{
    public abstract void m2();
}

interface C{
    public abstract void m3();
}

class D implements A,B,C{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {
        System.out.println("m2...");
    }

    @Override
    public void m3() {

    }
}