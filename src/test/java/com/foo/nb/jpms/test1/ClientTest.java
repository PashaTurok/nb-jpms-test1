
package com.foo.nb.jpms.test1;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void foo() {
        MyEntity entity = new MyEntity();
        System.out.println(MyEntity_.BAR);
    }
}
