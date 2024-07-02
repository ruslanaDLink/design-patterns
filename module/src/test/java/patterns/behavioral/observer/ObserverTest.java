package patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    public void test() {
        String update = "Event will take place on Monday 07/07. Time: 15:00. Venue: Shoreditch Studios.";

        CharityEvent eventSubscription = new CharityEvent();

        CharityVisitor ellie_woodson = new CharityVisitor("Ellie Woodson", 21);
        CharityVisitor charles_obrian = new CharityVisitor("Charles O'Brian", 28);
        CharityVisitor ava_wilson = new CharityVisitor("Ava Wilson", 19);
        CharityVisitor peter_miller = new CharityVisitor("Peter Miller", 34);
        CharityVisitor suzy_garcia = new CharityVisitor("Suzy Garcia", 22);

        eventSubscription.add(ellie_woodson);
        eventSubscription.add(charles_obrian);
        eventSubscription.add(ava_wilson);
        eventSubscription.add(peter_miller);
        eventSubscription.add(suzy_garcia);

        eventSubscription.setUpdate(update);
    }
}