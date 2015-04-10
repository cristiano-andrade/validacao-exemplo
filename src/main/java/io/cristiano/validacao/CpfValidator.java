package io.cristiano.validacao;

import sun.security.validator.ValidatorException;

import java.util.function.Supplier;

public class CpfValidator implements Validator<Supplier> {

    private Collector collector;

    public CpfValidator(Collector collector) {
        this.collector = collector;
    }

    public void validate(Supplier obj) {
        try {
            String cpf = (String) obj.get();
        }catch (Exception e){
            //faz a validação
            collector.collect("CPF Inválido");
        }

    }
}
