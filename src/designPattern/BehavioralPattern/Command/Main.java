package designPattern.BehavioralPattern.Command;

/**
 * 命令模式包含四个角色：抽象命令类中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作；具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中；调用者即请求的发送者，又称为请求者，它通过命令对象来执行请求；接收者执行与请求相关的操作，它具体实现对请求的业务处理。
 * 命令模式的本质是对命令进行封装，将发出命令的责任和执行命令的责任分割开。命令模式使请求本身成为一个对象，这个对象和其他对象一样可以被存储和传递。
 * 命令模式的主要优点在于降低系统的耦合度，增加新的命令很方便，而且可以比较容易地设计一个命令队列和宏命令，并方便地实现对请求的撤销和恢复；其主要缺点在于可能会导致某些系统有过多的具体命令类。
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommandOpen concreteCommandOpen = new ConcreteCommandOpen(receiver);
        Invoker invoker = new Invoker(concreteCommandOpen);
        invoker.call();

        ConcreteCommandClose concreteCommandClose = new ConcreteCommandClose(receiver);
        invoker = new Invoker(concreteCommandClose);
        invoker.call();
    }
}
