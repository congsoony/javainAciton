import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        Trader raoul = new Trader("raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );


        List<Transaction> ans1 = transactions.stream()
                .sorted((a,b)->Integer.compare(a.getValue(),b.getValue())).collect(Collectors.toList());
        System.out.println("1--------------------------------");
        for(Transaction t : ans1)
            System.out.println(t);

        List<String> ans2 =transactions.stream().map(s->s.getTrader().getCity()).distinct()
                .collect(Collectors.toList());
        System.out.println("2--------------------------------");
        for(String s : ans2)
            System.out.println(s);

        List<String> ans3 = transactions.stream().filter(s->s.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getTrader().getName())
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        System.out.println("3--------------------------------");
        for(String s:ans3)
            System.out.println(s);

        boolean istrader = transactions.stream().anyMatch(t->t.getTrader().getCity().equals("Milan"));
        System.out.println("4--------------------------------");
        System.out.println(istrader);

        List<Integer> ans4 = transactions.stream().filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        System.out.println("5--------------------------------");
        System.out.println(ans4);
    }
}
