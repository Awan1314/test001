package jiekouzuoyong.gukediancan;

public class Test {
    public static void main(String[] args) {
        // 创建厨师对象
        FoodMenu cfd = new ChinaCooker();
        FoodMenu afd = new AmericCooker();
        // 创建顾客对象
        Customer customer = new Customer(afd);
        // 顾客点菜
        customer.order();
    }
}
