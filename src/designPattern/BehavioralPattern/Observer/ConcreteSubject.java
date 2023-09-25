package designPattern.BehavioralPattern.Observer;

public class ConcreteSubject extends Subject {
    @Override
    public void myNotify() {
        observerHashmap.forEach((key, observer) ->{
            observer.updateStatus(subjectStatus);
        });
    }

    @Override
    public void add(String id, Observer observer) {
        observerHashmap.put(id, observer);
    }

    @Override
    public void del(String id) {
        observerHashmap.remove(id);
    }
}
