package module2.homework2.Task1;

public class Runner {

    public static void main(String[] args) {
        LuggageSpace luggageSpace = new LuggageSpace();
        luggageSpace.planeArrival("SU-077");
        luggageSpace.planeArrival("AO-222");
        luggageSpace.unloadLuggage();
    }
}