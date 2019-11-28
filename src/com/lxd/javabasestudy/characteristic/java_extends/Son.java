package com.lxd.javabasestudy.characteristic.java_extends;

/**
 * @author Asura
 * @Description
 * @Date 2019/11/27 22:02
 */
public class Son extends Parent {
    public Son(String name, int age, float money, String problem) {
        super(name, age, money, problem);
    }

    /**
     * 子类不可以访问父类的私有属性
     *
     * @return
     */
    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    /**
     * 重写父类方法
     */
    @Override
    public void eat() {
        super.eat();
        System.out.println("儿子喝可乐！");
    }

    /**
     * 同一个类中，不允许相同方法名，返回值类型不同的方法存在
     *
     * @return
     */
//    public String eat(){
//        return "";
//    }

    /**
     * 方法重载
     *
     * @param count 数量
     */
    public void eat(int count) {
        super.eat();
        System.out.println("儿子喝" + count + "杯可乐！");
    }

    /**
     * 方法重载
     *
     * @param count 数量
     * @param name  名字
     * @return
     */
    public String eat(int count, String name) {
        System.out.println("儿子喝" + count + "杯 " + name + " 可乐！");
        return "";
    }

    @Override
    public void pay(float money) {
        this.money -= money;
        System.out.println("儿子还剩 " + this.money + " 元钱");
    }

    /**
     * 不能重写父类的私有属性
     */
//    @Override
//    public void seeProblem() {
//        super.seeProblem();
//    }


    public void seeProblem() {
        /**
         * 不能访问父类的私有方法
         */
//        super.seeProblem();
    }

    /**
     * 方法的重载
     * @param a
     */
    public void seeProblem(int a) {
        /**
         * 不能访问父类的私有方法
         */
//        super.seeProblem();
    }

    /**
     * 方法的重载
     * @param a
     */
    public void seeProblem(String a) {
        /**
         * 不能访问父类的私有方法
         */
//        super.seeProblem();
    }

    /**
     * 同一个类中，不允许相同方法名，返回值类型不同的方法存在
     * @param a
     */
//    public String seeProblem(String a) {
//        /**
//         * 不能访问父类的私有方法
//         */
////        super.seeProblem();
//        return "";
//    }


}
