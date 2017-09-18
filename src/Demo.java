import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    int id;
    String name;
    float price;

    public Demo() {}

    public Demo(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static void acceptConsumer(Demo i) {
        System.out.println(i.id + i.name + i.price);
    }


    public static void main(String args[]){
        List<Demo> productsList = new ArrayList<Demo>();
        
        productsList.add(new Demo(1,"HP Laptop",25000f));
        productsList.add(new Demo(2,"Dell Laptop",30000f));
        productsList.add(new Demo(3,"Lenevo Laptop",28000f));
        productsList.add(new Demo(4,"Sony Laptop",28000f));
        productsList.add(new Demo(5,"Apple Laptop",90000f));
        Stream<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price);        // fetching price
//                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2.collect(Collectors.toList()));

        Stream.iterate(10, element -> element+1).filter(e -> e%2 == 0).limit(5).forEach(System.out::println);
        List list = new ArrayList();

        productsList.forEach(Demo::acceptConsumer);

    }
}
