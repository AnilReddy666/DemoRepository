package tests;

import org.testng.annotations.Factory;

public class FactoryData {
    @Factory
    public Object[] createInstances() {
        return new Object[]{
                new FactoryTest("Chrome"),
                new FactoryTest("Firefox"),
                new FactoryTest("Edge")
        };
    }
}
