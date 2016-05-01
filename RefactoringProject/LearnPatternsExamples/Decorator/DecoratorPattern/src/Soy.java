/**
 * Created by Aaron on 4/17/2016.
 */
public class Soy extends DrinkElement {

    public Soy(Drink drink) {
        super(drink);
    }

    @Override
    public double price(){
        return newPrice(drink);
    }

    public double newPrice(Drink drink){
        return (drink.price() + 5);

    }
}
