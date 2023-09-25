package designPattern.creationalPattern.SimpleFactory;

import org.junit.Assert;

import java.text.DateFormat;

public class Main {
    public static void main(String[] args) {
        Factory f = new Factory();
        Product a = f.createProduct("A");
        a.use();
        Product b = f.createProduct("B");
        b.use();
        Product c = f.createProduct("C");
        Assert.assertNull(c);

        DateFormat df = DateFormat.getDateInstance();

    }
}
