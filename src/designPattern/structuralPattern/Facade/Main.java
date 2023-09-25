package designPattern.structuralPattern.Facade;

public class Main {
    public static void main(String[] args) {
        // 对于客户端来讲，多个子系统类的调用被外观类包裹了
        Facade f = new Facade();
        f.wrapOperation();
    }
}
