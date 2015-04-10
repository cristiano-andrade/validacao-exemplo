package io.cristiano.validacao;

public class Main {

    public static void main(String[] args) {


        EntityTest entityTest = new EntityTest();

        Collector collector = new ValidationCollector<>();
        CpfValidator cpfValidator = new CpfValidator(collector);

        cpfValidator.validate(entityTest::getNome);
        cpfValidator.validate(entityTest::getCpf);

    }
}
