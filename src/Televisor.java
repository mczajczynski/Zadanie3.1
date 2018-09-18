public class Televisor {

    boolean isOn=false;

    void turnOn() {
        isOn = true;
        System.out.println("Włączanie TV");
    }
    void turnOff () {
        isOn = false;
        System.out.println("Wyłączanie TV");
    }

    void showStatus() {
        System.out.println("Czy TV jest włączony? " + isOn);
    }

}
