/**
 * Created by Aaron on 4/17/2016.
 */
public abstract class DrinkElement implements Drink {

    protected Drink drink;

    public DrinkElement(Drink drink){
        this.drink = drink;
    }
    public double price(){
        return drink.price();
    }
}
