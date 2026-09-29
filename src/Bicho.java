
public class Bicho {

    private String nome;
    private int fome;
    private int energia;
    private String humor;

    public Bicho(String nome) {
        this.nome = nome;
        energia = 50;
        fome = 50;
        humor = "Normal";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 100) {
        } else {
            IO.println("Digite um número valido: ");
        }
        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia > 0 || energia < 100) {
        } else {
            IO.println("Digite um Valor valido: ");
        }
        this.energia = energia;
    }

    public String getHumor() {
        if (energia >= 50 && fome <= 50) {
            return humor = "neutro";
        } else if (energia >= 75 && fome >= 75) {
            return humor = "Bravo";
        } else {
            return humor = "calmo";

        }
    }
}