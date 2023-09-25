package designPattern.BehavioralPattern.Observer;

import java.util.HashMap;

public abstract class Subject {

    public Subject() {
    }

    HashMap<String, Observer> observerHashmap = new HashMap<>();

    int subjectStatus = 0;

    public void myNotify() {

    }

    public void add(String id, Observer observer) {

    }

    public void del(String id) {

    }

    public void setSubjectStatus(int val) {
        subjectStatus = val;
    }

    public int getSubjectStatus() {
        return subjectStatus;
    }
}
