/*
 * CW1 Week 6
 */

public class Clock {
    private int hours;
    private int minutes;

    // CW1 6.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // CW1 6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String inputTime) {
        String[] time = inputTime.split(":");
        if (time.length == 2) {
            this.hours = Integer.parseInt(time[0]);
            this.minutes = Integer.parseInt(time[1]);
        }
    }

    // CW1 6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d", hours) + ":" + String.format("%02d", minutes);
    }

    // CW1 6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return this.hours < that.hours || (this.hours == that.hours && this.minutes < that.minutes);
    }

    // CW1 6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if (++minutes == 60) {
            minutes = 0;
            if (++hours == 24) hours = 0;
        }
    }

    // CW1 6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        minutes += delta % 60;
        hours += (delta / 60) % 24;
        if (minutes >= 60) {
            ++hours;
            minutes -= 60;
        }
        if (hours >= 24) hours -= 24;
    }

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("2:30");
        Clock testclock = new Clock("23:59");
        testclock.tock(1560);

        System.out.println(clock1);
        System.out.println(clock2);

        System.out.println(clock1.isEarlierThan(clock2));

        clock1.tick();
        clock2.tock(100);

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(testclock);
    }
}
