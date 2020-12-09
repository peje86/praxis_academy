public class Bicycle {                    //class

    public static void main(String argv[]) {



    int cadence = 0;    //atribut
    int speed = 0;       //atribut 
    int gear = 1 ;      //atribut
    }
    void changeCadence(int newValue) {
        cadence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed =speed+increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    void printStates() {
        System.out.println("cadence:" +cadence + " speed:" +speed + " gear:" + gear);
    }

}