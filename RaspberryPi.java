package LAB;

import java.util.Random;

public class RaspberryPi extends Computador {
    Random random = new Random();

    public RaspberryPi(int id) {
        super(id);
        setNivel("IoT");
        setRam((int) Math.pow(2, random.nextInt(3) + 1));
        setArmazenamento((int) Math.pow(2, random.nextInt(4) + 4));
        setCpu((double) (Math.round(((random.nextDouble() + 1) * 10)))/10);
        if (random.nextInt(2) == 1) {
            setArquitetura("x64");
        } else {
            setArquitetura("ARM");
        }
    }

    public double getConsumo() {return Math.round((20 * this.getCPU()));}

    public String getTipo() {return "Raspberry Pi";}
}