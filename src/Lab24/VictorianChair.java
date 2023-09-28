package Lab24;

public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return age;
    }
    public VictorianChair(int age){
        this.age = age;
    }
    @Override
    public void sitOn() {
        System.out.println("Вы сидите на Викторианском стуле возрастом" + getAge());
    }
}
