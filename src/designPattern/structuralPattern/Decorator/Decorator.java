package designPattern.structuralPattern.Decorator;

/**
 * 装饰模式
 */
public class Decorator extends Component {
    public void addBehavior() {
        System.out.printf("%s addBehavior\n", this.getClass().getSimpleName());
    }
}
