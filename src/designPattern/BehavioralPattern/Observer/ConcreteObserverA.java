package designPattern.BehavioralPattern.Observer;

public class ConcreteObserverA extends Observer {
    @Override
    public void updateStatus(int val) {
        status = val;
    }
}
