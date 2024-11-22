package LAB;

import java.util.Random;

public class Servidor extends Computador {
    Random random = new Random();

    public Servidor(int id) {
        super(id);
        setNivel("Cloud");
        setRam((int) Math.pow(2, random.nextInt(3) + 7));
        setArmazenamento((int) Math.pow(2, random.nextInt(5) + 10));
        setCpu((double) (Math.round(((random.nextDouble() + 3) * 10)))/10);
        if (random.nextInt(2) == 1) {
            setArquitetura("x64");
        } else {
            setArquitetura("ARM");
        }
    }

    public double getConsumo() {return Math.round((80 * this.getCPU()));}

    public String getTipo() {return "Servidor";}
}