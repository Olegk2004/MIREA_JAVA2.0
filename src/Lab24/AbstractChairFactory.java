package Lab24;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    FunctionalChair createMultifunctionalChair();

    MagicChair createMagicalChair();
}
