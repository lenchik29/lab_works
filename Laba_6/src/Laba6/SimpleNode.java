package Laba6;

public class SimpleNode implements AbstractNode {
    public final int value;
    public SimpleNode(int value){
        this.value=value;
    }
    @Override
    public int calculate(){
        return value;
    }
}

