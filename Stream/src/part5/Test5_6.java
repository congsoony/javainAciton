package part5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test5_6 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //2011년 에 일어난 트랜잭션
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        //거래자의 모든도시 중복없이 나열

        transactions.stream().map(t->t.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //케임브리지에서 근무하는 모든 거래자의 이름순정렬
        System.out.println("------------------------");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //밀라노에서 거래자가 있는가
        System.out.println("------------------------");
        System.out.println(transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));

        //전체 트랜잭션중 최대값
        System.out.println(transactions.stream().map(Transaction::getValue)
                .max(Comparator.comparing(Integer::intValue)).get());

    }
}
