import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

class Car{
    int id;
    String name;
    int money;

    public Car (int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }
}

public class streamCollector {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<Car>();
        //Adding Cars
        carList.add(new Car(113,"Suzuki",15000));
        carList.add(new Car(224,"BW",18000));
        carList.add(new Car(333,"Audi",20000));
        carList.add(new Car(442,"Ford",15000));
        carList.add(new Car(553,"Fiat",14000));
        //Getting the average Age
        Double avgAge = carList.stream()
                .collect(Collectors.averagingInt(s->s.money));
        System.out.println("Average Money of Cars are: "+avgAge);
    }
}

