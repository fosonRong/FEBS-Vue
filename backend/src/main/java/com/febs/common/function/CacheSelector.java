package com.febs.common.function;

@FunctionalInterface
public interface CacheSelector<T> {
    T select() throws Exception;
}
