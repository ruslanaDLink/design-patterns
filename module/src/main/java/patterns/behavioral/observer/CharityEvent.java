package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

//concrete subject
public class CharityEvent implements Event {
    private List<Visitor> visitorList = new ArrayList<>();
    public String update = "";

    @Override
    public void add(Visitor visitor) {
        if (visitor == null) {
            throw new NullPointerException("Null user is not allowed to subscribe. Fulfilling information is necessary.");
        }
        if (visitorList.contains(visitor)) {
            try {
                throw new Exception("Visitor " + visitor.getName() + " has already subscribed to the event.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            visitorList.add(visitor);
        }
    }

    @Override
    public void remove(Visitor visitor) {
        visitorList.remove(visitor);
    }

    @Override
    public void notifyVisitors() {
        for (Visitor visitor : visitorList) {
            visitor.getUpdated(getUpdate());
        }
    }

    public void setUpdate(String update) {
        this.update = update;
        System.out.println("Upcoming update...");
        System.out.println(update);
        notifyVisitors();
    }

    public String getUpdate() {
        return update;
    }
}
