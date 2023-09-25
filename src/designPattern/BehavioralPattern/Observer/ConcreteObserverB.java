package designPattern.BehavioralPattern.Observer;

public class ConcreteObserverB extends Observer {
    @Override
    public void updateStatus(int val) {
        status = val;
    }
}
