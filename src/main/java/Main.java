public class Main {
    public static void main(String[] args) {
         Watch watch = new Watch();
         AlarmClock alarmClock = new AlarmClock();
         WallClock wallClock = new WallClock();
         BigBen bigBen = new BigBen();
         watch.time.setTime(1, 1, 0);
        alarmClock.time.setTime(1, 1, 0);
        wallClock.time.setTime(1, 1, 0);
        bigBen.time.setTime(1, 1, 0);
        Display display = new Display(watch, alarmClock, wallClock, bigBen);
        display.display();
        watch.time.changeTime(2);
        alarmClock.time.changeTime(2);
        wallClock.time.changeTime(2);
        bigBen.time.changeTime(2);
        display.display();

    }
}
