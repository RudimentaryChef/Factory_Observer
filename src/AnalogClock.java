public class AnalogClock implements Subscriber{
    public AnalogClock(){

    }
    @Override
    public void update(ClockTimer subject){
        draw(subject);
    }
    public void draw(ClockTimer subject){
        System.out.println(subject.getHour());
    }
}