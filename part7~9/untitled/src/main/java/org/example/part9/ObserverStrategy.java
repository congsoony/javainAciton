package org.example.part9;

import java.util.ArrayList;
import java.util.List;

public class ObserverStrategy {
    public static void main(String[] args) {
        Feed f =new Feed();
        //f.registerObserver(new NYTimes());
        f.registerObserver((String tweet)->{
            if(tweet!= null && tweet.contains("money")){
                System.out.println("Breaking news in NY! "+ tweet);
            }
        });
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());
        f.notifyObservers("The queen said her favorite book money is Modern Java in Action!");

    }

    interface Observer{
        void notify(String tweet);
    }
    public static class NYTimes implements Observer{
        public void notify(String tweet){
            if(tweet!=null &&tweet.contains("money")){
                System.out.println("Breaking news in NY! "+tweet);
            }
        }
    }
    public static class Guardian implements Observer{
        @Override
        public void notify(String tweet) {
            if(tweet!=null && tweet.contains("queen")){
                System.out.println("Yet more news from London... "+tweet);
            }
        }
    }
    public static class LeMonde implements Observer{
        @Override
        public void notify(String tweet) {
            if(tweet!=null && tweet.contains("wine")){
                System.out.println("Today cheese, wine and news! "+tweet );
            }
        }
    }
    interface Subject{
        void registerObserver(Observer o);
        void notifyObservers(String tweet);
    }
    public static class Feed implements Subject{
        private final List<Observer> observers =new ArrayList<>();
        public void registerObserver(Observer o){
            this.observers.add(o);
        }
        public void notifyObservers(String tweet){
            observers.forEach(o->o.notify(tweet));
        }
    }
}