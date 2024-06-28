package patterns.behavioral.memento;

//memento
public class OrderMemento {
    private Status status;

    public OrderMemento(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
