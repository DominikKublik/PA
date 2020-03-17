public class AlarmClock extends Clock {
    public AlarmClock() {
        this.setWords("alarmclock");
    }

    private Time wakeTime = new Time(0);


    public void setWakeTime(int hour, int min, int sec){
        wakeTime.setTime(hour, min, sec);
    }

    public Time askTime(Time currentTime){
        return null;
    }

}
