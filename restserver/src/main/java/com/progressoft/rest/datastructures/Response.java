package com.progressoft.rest.datastructures;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Response {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
