package designPattern.BehavioralPattern.Status;

public abstract class Status {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void handle(Context ctx) {

    }
}
