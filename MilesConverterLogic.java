class MilesConverterLogic {
    private float miles;
    private float km;

    public MilesConverterLogic() {

    }

    public float convertMilesToKm(float m) {
        return m*1.609344f;
    }

    public void setMiles(float mi) {
        this.miles = mi;
    }

    public float getMiles() {
        return this.miles;
    }

    public void setKm(float k) {
        this.km = k;
    }

    public float getKm() {
        return this.km;
    }
}