package designPattern.BehavioralPattern.Mediator;

import java.util.HashMap;

public abstract class Mediator {
    HashMap<String, Colleague> colleagueMap = new HashMap<>();

    public void register(String code, Colleague colleague) {
        System.out.printf("%s register\n", this.getClass().getSimpleName());
        colleagueMap.put(code, colleague);
        colleague.setMediator(this);
    }

    public void operation(String code, String msg) {
        System.out.printf("%s operation\n", this.getClass().getSimpleName());
        Colleague colleague = colleagueMap.get(code);
        colleague.receiveMsg(msg);
    }
}
