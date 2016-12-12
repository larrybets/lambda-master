/**
 * Created by DAM on 7/11/16.
 */
public class Animal {
    public boolean potSaltar;
    public boolean potVolar;
    public boolean potNadar;
    public boolean potCaminar;

    public Animal(boolean potSaltar, boolean potVolar, boolean potNadar, boolean potCaminar) {

        this.potSaltar = potSaltar;
        this.potVolar = potVolar;
        this.potNadar = potNadar;
        this.potCaminar = potCaminar;
    }

    public boolean isPotCaminar() {
        return potCaminar;
    }

    public boolean isPotSaltar() {
        return potSaltar;
    }

    public boolean isPotNadar() {
        return potNadar;
    }

    public boolean isPotVolar() {
        return potVolar;
    }

}
