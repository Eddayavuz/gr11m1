public class Sensor {
    // Private attributes for sensor_id and sensor_type
    private int sensor_id;
    private String sensor_type;
    private boolean activated;

    // Constructor to initialize the sensor with an id and type
    public Sensor(int sensor_id, String sensor_type) {
        this.sensor_id = sensor_id;
        this.sensor_type = sensor_type;
        this.activated = false;
    }

    // Public method to activate the sensor
    public void activate() {
        System.out.println(sensor_type + " sensor " + sensor_id + " activated.");
        activated = true;
    }

    // Public method to deactivate the sensor
    public void deactivate() {
        System.out.println(sensor_type + " sensor " + sensor_id + " deactivated.");
        activated = false;
    }

    // Public method to check the status of the sensor
    public boolean checkStatus() {
        return activated;
    }
}
