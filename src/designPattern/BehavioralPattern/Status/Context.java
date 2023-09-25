package designPattern.BehavioralPattern.Status;

public class Context {
    public Status getStatus() {
        return status;
    }

    /**
     * 默认状态
     */
    Status status = new ConcreteStatusA();

    public void changeStatus(Status status) {
        this.status = status;
    }

    /**
     * 收到某请求后，启动状态转换
     */
    public void request() {
        status.handle(this);
    }
}
