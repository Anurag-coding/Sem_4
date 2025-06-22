import java.util.*;
class Car implements Comparable<Car> {
    private int modelNo,stock;private String name;
    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;this.name = name;this.stock = stock;
    }
    public int getModelNo() {
        return modelNo;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return modelNo == car.modelNo && stock == car.stock && Objects.equals(name, car.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(modelNo, name, stock);
    }
}
public class q3 {
	public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(2013, "Creta", 10));
        carList.add(new Car(2017, "Audi", 45));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2015, "BMW", 55));
        Collections.sort(carList);
        System.out.println("Sorted list of Car objects based on stock:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
/* output:-
   Sorted list of Car objects based on stock:
   2013 Creta 10
   2020 MG 13
   2018 Kia 20
   2017 Audi 45
   2015 BMW 55
*/