package org.example.part9;

public class Strategy {

    public static void main(String[] args) {
        Validator numericValidator =new Validator(new IsNumeric());
        boolean b1 = numericValidator.validate("aaaaa");
        System.out.println(b1);

        numericValidator = new Validator(s -> s.matches("\\d+"));
        System.out.println(numericValidator.validate("aaaaa"));
        System.out.println(numericValidator.validate("1234"));

    }
    public static class Validator{
        private final ValidationStrategy strategy;
        public Validator(ValidationStrategy v){
            this.strategy = v;
        }
        public boolean validate(String s){
            return strategy.execute(s);
        }
    }


}

interface ValidationStrategy{
    boolean execute(String s);
}
class IsAllLowerCase implements ValidationStrategy{
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
class IsNumeric implements ValidationStrategy{
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}