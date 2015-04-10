package io.cristiano.validacao;

@FunctionalInterface
public interface Collector<T> {
    void collect(T obj);
}
