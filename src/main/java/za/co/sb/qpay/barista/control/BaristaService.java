package za.co.sb.qpay.barista.control;

import org.springframework.stereotype.Service;
import za.co.sb.qpay.barista.entity.Coffee;

import java.util.ArrayList;
import java.util.List;

@Service
public class BaristaService {

    private List<Coffee> listOfCoffees = new ArrayList<>();

    public List<Coffee> listCoffees() {
        setUpMockData();
        return listOfCoffees;
    }

    private void setUpMockData() {
        Coffee coffee1 = Coffee.builder()
                .id(1L)
                .coffeeName("Ispirazione Napoli")
                .coffeeDescription("Intense, Exceptionally Dark & Creamy")
                .build();
        Coffee coffee2 = Coffee.builder()
                .id(1L)
                .coffeeName("Ispirazione Venezia")
                .coffeeDescription("Harmoniously Balanced & Thick Bodied")
                .build();
        Coffee coffee3 = Coffee.builder()
                .id(1L)
                .coffeeName("Cape Town Envivo Lungo")
                .coffeeDescription("Tread a Path: Potent & Roasted")
                .build();
        listOfCoffees.add(coffee1);
        listOfCoffees.add(coffee2);
        listOfCoffees.add(coffee3);
    }


}
