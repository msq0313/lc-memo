package designPattern.structuralPattern.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, ConcreteFlyweight> flyweightPool = new HashMap<>();

    public ConcreteFlyweight getFlyweight(String param) {
        if (flyweightPool.containsKey(param)) {
            // exist
            System.out.printf("flyweight %s exist\n", param);
            return flyweightPool.get(param);
        } else {
            ConcreteFlyweight cf = new ConcreteFlyweight(param);
            flyweightPool.put(param, cf);
            return cf;
        }
    }
}
