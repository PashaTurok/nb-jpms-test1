package com.foo.nb.jpms.test1;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MyEntity {

    @Id
    private Integer id;

    private String foo;

    private String bar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }


}
