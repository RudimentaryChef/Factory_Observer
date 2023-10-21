//The subject class AKA Publisher
public class ClockTimer {
    private int hour;
    private int minute;
    private int second;
    private List<Subscriber> subscribers = new ArrayList<>();
    public ClockTimer(){
        //how to initalize it
    }
    public void tick(){
        //notify
        hour = hour + 1;
        notifySubscribers();
    }
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

}

