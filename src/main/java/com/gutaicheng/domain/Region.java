package com.gutaicheng.domain;

import lombok.Data;

public class Region extends BaseTree{
    String id;
    String name;
    String pid;
    String abbreviation;

    public void setId(String id) {
        this.id = id;
        super.setId(id);
    }

    public void setName(String name) {
        this.name = name;
        super.setTitle(name);
    }

    public void setPid(String pid) {
        this.pid = pid;
        super.setParentId(pid);
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        super.getAttributes().put("简称", abbreviation);
    }
}
