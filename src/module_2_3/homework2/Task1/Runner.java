package module_2_3.homework2.Task1;

public class Runner {

    public static void main(String[] args) {
        LuggageSpace luggageSpace = new LuggageSpace();
        luggageSpace.planeArrival("SU-077");
        luggageSpace.planeArrival("AO-222");
        luggageSpace.print();
        luggageSpace.unloadLuggage();
        luggageSpace.print();
        luggageSpace.unloadLuggage();


    }
}
//Создать раннер, в нем багажное отделение. Организовать два прилета SU-077, AO-222.
//Разгрузить багажное отделение. Сначала должны выйти чемоданы su-077, потом ao-222.