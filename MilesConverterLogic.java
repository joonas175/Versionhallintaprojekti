
/**
 * Logic of the Miles-To-Kilometers converter.
 * 
 * This is the logic and functionality of the converter.
 * @author Lauri Laiho
 * @since 08.10.2018
 */
class MilesConverterLogic {
    private float miles;
    private float km;

    /**
     * Constructor of the object.
     */
    public MilesConverterLogic() {

    }

    /**
     * Converts miles to kilometers using a static ratio.
     * 
     * @param m float, which is the amount of miles that will be converted.
     * @return Returns the given float in kilometers.
     */
    public float convertMilesToKm(float m) {
        return m*1.609344f;
    }

    /**
     * Converts kilometers to miles using a static ratio.
     * 
     * @param k float, which is the amount of kilometers that will be converted.
     * @return Returns the given float in miles.
     */
    public float convertKmToMiles(float k) {
        return k*0.621371f;
    }

    /**
     * Sets the amount of miles.
     * 
     * @param mi The amount of miles to be set.
     */
    public void setMiles(float mi) {
        this.miles = mi;
    }

    /**
     * 
     * @return Returns the amount of miles.
     */
    public float getMiles() {
        return this.miles;
    }

    /**
     * Sets the amount of kilometers.
     * 
     * @param k The amount of kilometers to be set.
     */
    public void setKm(float k) {
        this.km = k;
    }

    /**
     * 
     * @return Returns the amount of kilometers.
     */
    public float getKm() {
        return this.km;
    }
}