import Lab24.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        MagicChair magicChair = chairFactory.createMagicChair();
        magicChair.sitOn();
        magicChair.doMagic();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        System.out.println(functionalChair.sum(1, 2));
        functionalChair.sitOn();
    }
}