package designPattern.BehavioralPattern.Status;

public class Main {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.request();
        System.out.println(ctx.getStatus().getName());
    }
}
