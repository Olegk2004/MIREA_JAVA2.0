package Lab24;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public FunctionalChair createMultifunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicalChair() {
        return new MagicChair();
    }
}