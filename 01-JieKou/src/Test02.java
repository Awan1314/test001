
// 一个非抽象的类实现接口的话，必须将接口中所有的抽象方法全部实现【覆盖，重写】
public class Test02 {
    public static void main(String[] args) {
        MyMath mm = new MyMathImpl();
        int x = mm.sum(10,20);
        System.out.println(x);
        int result = mm.sub(10,20);
        System.out.println(result);
    }
}
// 特殊的抽象类，完全抽象的，叫做接口
interface MyMath{
    public static final double PI = 3.1415926;
    public abstract int sum(int a, int b);
    public abstract int sub(int a, int b);

}

// 编写一个类【定义为一个非抽象的类】
class MyMathImpl implements MyMath{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
