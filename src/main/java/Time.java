import java.util.Random;

public class Time {
    public Time(int delay){
        this.delay = delay;
        this.hour = 0;
        this.min = 0;
        this.sec = 0 + delay;

    }
    private int hour;
    private int min;
    private int sec;
    private int delay;

    public void setTime(int hour, int min, int sec){
        setHour(hour);
        setMin(min);
        setSec(sec);
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public String readableTime(){
        return Integer.toString(hour) + ":" + Integer.toString(min)+ ":" + Integer.toString(sec);
    }

    public Boolean changeTime (int seconds){
        this.sec = sec+seconds;
        if(sec > 59){
            this.sec = seconds%60;
            this.min = seconds/60;
            if (min > 59){
                this.min = (seconds/60)%60;
                hour = seconds/60/60;
                if (hour > 23){
                    this.hour = seconds/60/60%24;
                }
                return true;
            }
        }
        return false;
    }

    public Boolean changeTime(){
        return changeTime(1);
    }


}
