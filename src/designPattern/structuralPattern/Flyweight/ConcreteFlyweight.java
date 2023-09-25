package designPattern.structuralPattern.Flyweight;

public class ConcreteFlyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation() {
        System.out.printf("flyweight %s do operation\n", intrinsicState);
    }
}
