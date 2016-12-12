import java.util.ArrayList;
import java.util.List;

/**
 * Created by larryandre on 12/12/2016.
 */
public class LambdasZoo {
    public static void main(String[] args) {

        Animal mono = new Animal(true, false, true, true);
        Animal aguila = new Animal(true, false, false, true);
        Animal perro = new Animal(true, false, true, true);
        List<Animal> animales = new ArrayList<>();
        animales.add(mono);
        animales.add(aguila);
        animales.add(perro);

        CheckAtribut potSaltar = (a) -> {
            return a.isPotSaltar();
        };
        animales.forEach(animal -> System.out.println(animal + " - " + potSaltar.check(animal)));

        CheckAtribut potVolar = (a) -> {
            return a.isPotVolar();
        };
        animales.forEach(animal -> System.out.println(animal + " - " + potVolar.check(animal)));

        CheckAtribut potCaminar = (a) -> {
            return a.isPotCaminar();
        };

        animales.forEach(animal -> System.out.println(animal + " - " + potCaminar.check(animal)));

        CheckAtribut potNadar = (a) -> {
            return a.isPotNadar();
        };
        animales.forEach(animal -> System.out.println(animal + " - " + potNadar.check(animal)));

    }

}
