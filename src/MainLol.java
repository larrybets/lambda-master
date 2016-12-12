import java.util.ArrayList;
import java.util.List;

/**
 * Created by larryandre on 12/12/2016.
 */
public class MainLol {
    public static void main(String[] args) {
        EstadisticasLOL player1 = new EstadisticasLOL("oden", 1, 1, 1, 30, 1, 0, 3, 6);
        EstadisticasLOL player2 = new EstadisticasLOL("garruk", 120, 3, 5, 455, 2, 9, 2, 0);
        EstadisticasLOL player3 = new EstadisticasLOL("jace", 111, 444, 2, 5, 3, 2, 4, 57);
        EstadisticasLOL player4 = new EstadisticasLOL("liliana", 112, 32, 44, 4, 3, 2, 68, 35);
        EstadisticasLOL player5 = new EstadisticasLOL("paco", 90, 22, 55, 6, 3, 0, 4, 0);
        EstadisticasLOL player6 = new EstadisticasLOL("tezzeret", 0, 1, 444, 444, 33, 1, 2, 0);

        List<EstadisticasLOL> lista = new ArrayList<>();
        lista.add(player1);
        lista.add(player2);
        lista.add(player3);
        lista.add(player4);
        lista.add(player5);
        lista.add(player6);

        checkEstadistica modificaVida = (a) -> {
            return a.modificaVida();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaVida.check(a)));
        checkEstadistica modificaAtaque = (a) -> {
            return a.modificaAtaque();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaAtaque.check(a)));
        checkEstadistica modificaMovimiento = (a) -> {
            return a.modificaMovimiento();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaMovimiento.check(a)));

        checkEstadistica modificaRegeneraVida = (a) -> {
            return a.modificaRegeneraVida();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaRegeneraVida.check(a)));

        checkEstadistica modificaArmadura = (a) -> {
            return a.modificaArmadura();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaArmadura.check(a)));

        checkEstadistica modificaResistenciaMagica = (a) -> {
            return a.modificaResistenciaMagica();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaResistenciaMagica.check(a)));
        checkEstadistica modificaMana = (a) -> {
            return a.modificaMana();
        };
        lista.forEach(a -> System.out.println(a + " - " + modificaMana.check(a)));

        System.out.println("////////////////////////////");
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();
        System.out.println("******");
        System.out.println("******");
        System.out.println("jugador.1");
        System.out.println("******");
        System.out.println("******");
        p1.calcularEstadisticas();
        p1.añadirObjeto(player1);
        p1.añadirObjeto(player2);
        p1.añadirObjeto(player3);
        p1.calcularEstadisticas();
        System.out.println("******");
        System.out.println("******");
        System.out.println("jugador.2");
        System.out.println("******");
        System.out.println("******");

        p2.calcularEstadisticas();
        p2.añadirObjeto(player4);
        p2.añadirObjeto(player5);
        p2.añadirObjeto(player6);
        p2.calcularEstadisticas();


    }
}
