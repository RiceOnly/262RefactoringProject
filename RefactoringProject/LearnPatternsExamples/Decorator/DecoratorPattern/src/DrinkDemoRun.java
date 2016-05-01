/**
 * Created by Aaron on 4/17/2016.
 */
public class DrinkDemoRun {

    public static void main(String[] args) {

        ChaiTea chaiTea = new ChaiTea();

        Soy soyChaiTea = new Soy(new ChaiTea());

        System.out.println("This is the new price: " + soyChaiTea.price());

    }
}
