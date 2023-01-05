public class Lamp {
    private String style;
    private Boolean battery;
    private int globeRating;

    public Lamp(String style, Boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public void turnOn() {
        if (!battery){
            System.out.println("Light will not Turned On.....");

        }
        else {
            System.out.println("Light is Being turning on .....");
        }
    }




    public String getStyle() {
        return style;
    }

    public Boolean getBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }
}
