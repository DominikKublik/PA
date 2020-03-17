import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time time = new Time(0);
    Watch watch = new Watch();

    private void setup(){
        time.setTime(0,0,0);
    }


    @Test
    void changeTimeReadableTimeTest() {
        setup();
        time.changeTime(2);
        assertEquals("0:0:2", time.readableTime());
        setup();
        time.changeTime(60);
        assertEquals("0:1:0", time.readableTime());
    }

    @Test
    void changeTimeByHour() {
        setup();
        assertEquals(true, time.changeTime(3600));
        setup();
        assertEquals(true, time.changeTime(86400));
    }

    @Test
    void changeTimeBy24Hours() {
        setup();
        time.changeTime(86400);
        assertEquals("0:0:0", time.readableTime());
    }
}