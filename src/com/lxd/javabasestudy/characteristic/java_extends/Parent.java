package com.lxd.javabasestudy.characteristic.java_extends;

/**
 * @author Asura
 * @Description 父类
 * @Date 2019/11/27 21:57
 */
public class Parent {
    public String name;
    public int age;
    public float money;
    private String problem;

    public Parent(String name, int age, float money, String problem) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.problem = problem;
    }

    public void eat() {
        System.out.println("父亲喝养生汤");
    }

    public void pay(float money) {
        this.money -= money;
        System.out.println("父亲还剩 " + this.money + " 元钱");
    }

    private void seeProblem() {
        System.out.println("父亲的problem：" + problem);
    }
}
