package Lab24;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    FunctionalChair createFunctionalChair();

    MagicChair createMagicChair();
}
