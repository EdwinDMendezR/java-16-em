package invoke.defaults.methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class InvokeDefaultMethodsFromProxyInstancesTest {

    @Test
    public void methodTest() {
        ObjectA personProxy = (ObjectA) Proxy.newProxyInstance(
                ObjectA.class.getClassLoader(),
                new Class<?>[] {ObjectA.class},
                (proxy, method, args) -> {
                    System.out.println("Invoking " + method.getName());
                    return null;
                }
        );

        Assertions.assertEquals("", personProxy.getMessage());
    }

}
