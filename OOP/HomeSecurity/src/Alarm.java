public class Alarm {
    // Private attribute to store the alarm status
    private boolean triggered;

    // Constructor to initialize the alarm
    public Alarm() {
        this.triggered = false;
    }

    // Public method to encapsulate the logic for triggering the alarm when a sensor is activated
    public void triggerAlarm() {
        if (triggered) {
            System.out.println("Alarm is already triggered.");
        } else {
            System.out.println("Alarm triggered!");
            triggered = true;
        }
    }
}
