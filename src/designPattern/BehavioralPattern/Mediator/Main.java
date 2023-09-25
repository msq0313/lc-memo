package designPattern.BehavioralPattern.Mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteColleagueA concreteColleagueA = new ConcreteColleagueA();
        ConcreteColleagueB concreteColleagueB = new ConcreteColleagueB();
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.register("A", concreteColleagueA);
        concreteMediator.register("B", concreteColleagueB);

        concreteColleagueA.sendMsg("B", "msg");
    }
}
