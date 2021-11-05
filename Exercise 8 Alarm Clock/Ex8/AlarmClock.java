package Ex8;

/*
 * Exercise Week 7
 */
public class AlarmClock extends Clock {

    // Alarm's hours, minutes, sound
    private final int alarmHours;
    private final int alarmMinutes;
    String alarmSound;


    // Exercise 7.1
    // Creates an Alarm clock whose initial time is h hours and m minutes,
    //     sounds an alarm at alarmHour hours and alarmMinutes minutes,
    //     with the default sound "Beep beep beep beep!"
    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes) {
        super(h, m);
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
        alarmSound = "Beep beep beep beep!";
    }


    // Exercise 7.2
    // Creates an Alarm clock whose initial time is h hours and m minutes,
    //     sounds an alarm at alarmHour hours and alarmMinutes minutes,
    //     and sets the sound to alarmSound
    public AlarmClock(int h, int m, int alarmHours, int alarmMinutes, String alarmSound) {
        this(h, m, alarmHours, alarmMinutes);
        this.alarmSound = alarmSound;
    }


    // Exercise 7.3
    // Adds 1 minute to the time on this Alarm clock.
    // In addition, it sounds (prints) the alarm at the specified time.
    @Override
    public void tick() {
        super.tick();
        if (this.getHours() == this.alarmHours && this.getMinutes() == this.alarmMinutes)
            System.out.println(alarmSound);
    }


    // Test Client
    public static void main(String[] args) {
        AlarmClock ac1 = new AlarmClock(5, 58, 6, 0);
        ac1.tick();
        ac1.tick();  // Beep beep beep beep!
        System.out.println(ac1);  // 06:00

        AlarmClock ac2 = new AlarmClock(14, 29, 14, 30, "Wake Up! The Hero! Kamen Rider!");
        ac2.tick();  // Wake Up! The Hero! Kamen Rider!
    }

}
