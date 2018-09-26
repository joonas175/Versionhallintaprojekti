class BmiLogic {

    private double weight;
    private double height;
    private String BmiValue;

    public BmiLogic(double newWeight, double newHeight) {
        setHeight(newHeight);
        setWeight(newWeight);
    }

    public String generateBMI(){
        double result = 0;
        result = this.weight / ((this.height/100) * (this.height/100));
        result = (double) Math.round(result * 100) / 100;
        return "" + result;
    }

    public String getBmiValue() {
        return this.BmiValue;
    }

    public double getWeigth(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWeight(double newWeight){
        if(newWeight > 0){
            this.weight = newWeight;
        }
    }

    public void setHeight(double newHeight){
        if(newHeight > 0){
            this.height = newWeigth;
        }
    }
}