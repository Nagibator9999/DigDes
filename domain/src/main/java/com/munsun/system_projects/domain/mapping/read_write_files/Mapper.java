package com.munsun.system_projects.domain.mapping.read_write_files;

public abstract class Mapper<T> {
    protected Parser parser;

    public Mapper(Parser parser) {
        this.parser = parser;
    }

    public abstract T mapObject(String line);
    public abstract String mapString(T object);
}
