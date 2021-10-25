public class Test04 {
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly();
        Flyable f1 = new Pig();
        f1.fly();
    }
}

class Animal{

}

/*
可飞翔的接口(是一对翅膀>
能插拔的就是接口。(没有接口你怎么插拔。>
内存条插到主板上，他们之间有接口。内存条可以更换。接口通常提取的是行为动作。
 */
interface Flyable{
    public abstract void fly();
}

/*
动物类子类:猫类
Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变的可以飞翔。
 */
class Cat extends Animal implements Flyable{

    @Override
    public void fly() {
        System.out.println("会飞的猫");
    }
}

/*
虎类，如果你不想让它飞，可以不实现Flyable接口
没有实现这个接口表示你没有翅膀，没有给你插翅膀，你肯定不能
 */
class Tiger extends Animal{

}

// 想飞就插翅膀这个接口
class Pig extends Animal implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞猪上路");
    }
}