package io.cristiano.validacao;


@FunctionalInterface
public interface Validator<T> {
    void validate(T obj);
}
