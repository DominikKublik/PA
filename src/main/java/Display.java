public class Display {
    public Display(Watch watch, AlarmClock alarmClock, WallClock wallClock, BigBen bigBen){
        this.watch = watch;
        this.alarmClock = alarmClock;
        this.wallClock = wallClock;
        this.bigBen = bigBen;
    }
    private Watch watch;
    private AlarmClock alarmClock;
    private WallClock wallClock;
    private BigBen bigBen;

    public void display(){
        System.out.println("Watch: " + watch.readTime().readableTime());
        System.out.println("Alarm Clock: " + alarmClock.readTime().readableTime());
        System.out.println("Wall Clock: " + wallClock.readTime().readableTime());
        System.out.println("Big Ben: " + bigBen.readTime().readableTime());

    }
}
