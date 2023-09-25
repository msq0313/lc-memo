package designPattern.BehavioralPattern.Observer;

public class Main {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        Observer obs = new ConcreteObserverA();
        Observer obsB = new ConcreteObserverB();
        sub.add("1", obs);
        sub.setSubjectStatus(2);
        sub.myNotify();
        System.out.println("obs status:" + obs.getStatus());
        System.out.println("sub status:" + sub.getSubjectStatus());
        System.out.println("obsB status:" + obsB.getStatus());
        sub.add("2", obsB);
        sub.setSubjectStatus(3);
        sub.myNotify();
        System.out.println("obs status:" + obs.getStatus());
        System.out.println("sub status:" + sub.getSubjectStatus());
        System.out.println("obsB status:" + obsB.getStatus());
    }
}
