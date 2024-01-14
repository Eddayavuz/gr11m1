public class Main {
    public static void main(String[] args) {
        // Create a motion sensor
        Sensor motionSensor = new Sensor(1, "Motion");
        // Create a door sensor
        Sensor doorSensor = new Sensor(2, "Door");

        // Create an alarm
        Alarm securityAlarm = new Alarm();

        // Activate the motion sensor
        motionSensor.activate();
        // Trigger the alarm
        securityAlarm.triggerAlarm();

        // Deactivate the motion sensor
        motionSensor.deactivate();
        // Try triggering the alarm again
        securityAlarm.triggerAlarm();

        // Activate the door sensor
        doorSensor.activate();
        // Trigger the alarm again
        securityAlarm.triggerAlarm();
    }
}