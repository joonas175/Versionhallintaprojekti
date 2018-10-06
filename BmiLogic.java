class BmiLogic {

    private double weight;
    private double height;
    private String BmiValue;

    public void generateBMI(){
        double result = 0;
        result = this.weight / ((this.height/100) * (this.height/100));
        result = (double) Math.round(result * 100) / 100;
        BmiValue = Double.toString(result);
    }

    public String getBmiValue() {
        return this.BmiValue;
    }

    public void setBmiValue(String newBmi) {
        this.BmiValue = new String(newBmi);
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
            this.height = newHeight;
        }
    }
}