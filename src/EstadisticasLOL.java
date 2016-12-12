/**
 * Created by larryandre on 12/12/2016.
 */
public class EstadisticasLOL {
    private String alias = "";
    private int vida = 0;
    private int ataque = 0;
    private int armadura = 0;
    private int mana = 0;
    private int ResMag = 0;
    private int regenerar = 0;
    private int velAtaque = 0;
    private int velMov = 0;

    public EstadisticasLOL() {
    }

    public EstadisticasLOL(String alias, int vida, int ataque, int armadura, int mana, int resMag, int regenerar, int velAtaque, int velMov) {
        this.alias = alias;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.mana = mana;
        this.ResMag = resMag;
        this.regenerar = regenerar;
        this.velAtaque = velAtaque;
        this.velMov = velMov;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getResMag() {
        return ResMag;
    }

    public void setResMag(int resMag) {
        ResMag = resMag;
    }

    public int getRegenerar() {
        return regenerar;
    }

    public void setRegenerar(int regenerar) {
        this.regenerar = regenerar;
    }

    public int getVelAtaque() {
        return velAtaque;
    }

    public void setVelAtaque(int velAtaque) {
        this.velAtaque = velAtaque;
    }

    public int getVelMov() {
        return velMov;
    }

    public void setVelMov(int velMov) {
        this.velMov = velMov;
    }

    public boolean modificaVida() {
        if (this.vida != 0)
            return true;
        return false;
    }

    public boolean modificaAtaque() {
        if (this.ataque != 0)
            return true;
        return false;
    }

    public boolean modificaMovimiento() {
        if (this.velMov != 0)
            return true;
        return false;
    }

    public boolean modificaRegeneraVida() {
        if (this.regenerar != 0)
            return true;
        return false;
    }

    public boolean modificaArmadura() {
        if (this.armadura != 0)
            return true;
        return false;
    }

    public boolean modificaResistenciaMagica() {
        if (this.ResMag != 0)
            return true;
        return false;
    }

    public boolean modificaMana() {
        if (this.vida != 0)
            return true;
        return false;
    }

}
