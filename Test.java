class Test {
    public static void main(String[] args) {
        MilesConverterLogic converter = new MilesConverterLogic();
        System.out.println(converter.convertMilesToKm(5.5f) + "km");
        System.out.println(converter.convertKmToMiles(5.5f) + "mi");
    }
}