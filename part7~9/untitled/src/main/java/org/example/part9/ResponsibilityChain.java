package org.example.part9;

public class ResponsibilityChain {
    public static void main(String[] args) {

        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String>p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);

        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);

    }
    public static abstract class ProcessingObject<T>{
        protected ProcessingObject<T> successor;
        public void setSuccessor(ProcessingObject<T> successor){
            this.successor = successor;
        }
        public T handle(T input){
            T r = handleWork(input);
            if(successor !=null){
                return successor.handle(r);
            }
            return r;
        }
        protected abstract T handleWork(T input);
    }
    public static class HeaderTextProcessing extends ProcessingObject<String>{
        public String handleWork(String text){
            return "From Raoul, Mario and Alan : "+text;
        }
    }
    public static class SpellCheckerProcessing extends ProcessingObject<String>{
        public String handleWork(String text){
            return text.replaceAll("labda","lambda");
        }
    }

}
