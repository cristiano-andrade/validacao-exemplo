package io.cristiano.validacao;

import java.util.ArrayList;
import java.util.List;

public class ValidationCollector<T> implements Collector<T> {

    List<T> validationMessages = new ArrayList<T>();

    @Override
    public void collect(T obj) {
        validationMessages.add(obj);
    }

    public List<T> getMessages(){
        return validationMessages;
    }
}
