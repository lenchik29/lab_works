package Laba6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат представления арифметических выражений:");
        AbstractNode operation1= new SubstractionNode(new SimpleNode(5), new SimpleNode(5)),
                expression1=new SubstractionNode(new SimpleNode(3), new SimpleNode(1));
        AbstractNode ans1=new MultNode(operation1, expression1);
        System.out.println("Пример 1: "+(operation1.toString())+"*"
                +(expression1.toString())+" is: "+ans1.calculate());

        System.out.println(" ");
        AbstractNode operation2= new SubstractionNode(new SimpleNode(5), new SimpleNode(3)),
                expression2=new SubstractionNode(new SimpleNode(3), new SimpleNode(1));
        AbstractNode ans2=new MultNode(operation2, expression2);
        System.out.println("Пример 2: "+(operation2.toString())+"*"
                +(expression2.toString())+" is: "+ans2.calculate());

    }

}

