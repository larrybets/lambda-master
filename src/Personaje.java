import java.util.List;

/**
 * Created by larryandre on 12/12/2016.
 */
public class Personaje {
    private int vida = 0;
    private int ataque = 0;
    private int velocidadAtaque = 0;
    private int velocidadMovimiento = 0;
    private int regeneracionDeVida = 0;
    private int armadura = 0;
    private int resistenciaMagica = 0;
    private int mana = 0;
    private List<EstadisticasLOL> objetos;

    public Personaje(int vida, int ataque, int velocidadAtaque,
                     int velocidadMovimiento, int regeneracionDeVida,
                     int armadura, int resistenciaMagica,
                     int mana, List<EstadisticasLOL> objetos) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidadAtaque = velocidadAtaque;
        this.velocidadMovimiento = velocidadMovimiento;
        this.regeneracionDeVida = regeneracionDeVida;
        this.armadura = armadura;
        this.resistenciaMagica = resistenciaMagica;
        this.mana = mana;
        this.objetos = objetos;
    }

    public Personaje() {

    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidadAtaque() {
        return velocidadAtaque;
    }

    public void setVelocidadAtaque(int velocidadAtaque) {
        this.velocidadAtaque = velocidadAtaque;
    }

    public int getVelocidadMovimiento() {
        return velocidadMovimiento;
    }

    public void setVelocidadMovimiento(int velocidadMovimiento) {
        this.velocidadMovimiento = velocidadMovimiento;
    }

    public int getRegeneracionDeVida() {
        return regeneracionDeVida;
    }

    public void setRegeneracionDeVida(int regeneracionDeVida) {
        this.regeneracionDeVida = regeneracionDeVida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getResistenciaMagica() {
        return resistenciaMagica;
    }

    public void setResistenciaMagica(int resistenciaMagica) {
        this.resistenciaMagica = resistenciaMagica;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void añadirObjeto(EstadisticasLOL o) {
        objetos.add(o);
    }

    public void eliminarObjeto(EstadisticasLOL o) {
        for (int i = 0; i < objetos.size(); i++) {
            if (objetos.get(i).getAlias().equals(o.getAlias())) {
                objetos.remove(i);
            }
        }
    }

    public void calcularEstadisticas() {
        for (EstadisticasLOL o : objetos) {
            this.vida += o.getVida();
            this.ataque += o.getAtaque();
            this.velocidadAtaque += o.getVelAtaque();
            this.velocidadMovimiento += o.getVelMov();
            this.regeneracionDeVida += o.getRegenerar();
            this.armadura += o.getArmadura();
            this.resistenciaMagica += o.getResMag();
            this.mana += o.getMana();
        }
        System.out.println("Vida: " + this.vida);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Velocidad ataque: " + this.velocidadAtaque);
        System.out.println("Velocidad Movimiento: " + this.velocidadMovimiento);
        System.out.println("Regeneracion de vida: " + this.regeneracionDeVida);
        System.out.println("Armadura: " + this.armadura);
        System.out.println("Resistencia Magica: " + this.resistenciaMagica);
        System.out.println("Mana: " + this.mana);
    }

}
