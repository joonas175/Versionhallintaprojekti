class Main {
    public static void main(String... args){
        BmiLogic logic = new BmiLogic();
        BmiUI app = new BmiUI(args, logic);
    }
}