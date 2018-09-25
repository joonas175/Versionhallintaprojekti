class BmiLogic {

    private double weight;
    private double height;

    public BmiLogic(double newWeight, double newHeight) {
        setHeight(newHeight);
        setWeight(newWeight);
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