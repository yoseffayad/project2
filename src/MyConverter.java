public class MyConverter {

    public double convertCmToMeter(double cm) {
        return cm / 100.0;
    }

    public double convertMeterToCm(double meter) {
        return meter * 100.0;
    }

    public double convertMeterToKm(double meter) {
        return meter / 1000.0;
    }

    public double convertKmToMeter(double km) {
        return km * 1000.0;
    }

    public static void main(String[] args) {
        MyConverter converter = new MyConverter();


        double cm = 150 ;

        double meter = converter.convertCmToMeter(cm);
        System.out.println(cm + " سم = " + meter + " م");

        double km = 2.5;
        meter = converter.convertKmToMeter(km);
        System.out.println(km + " كم = " + meter + " م");
    }
}