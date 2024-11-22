package LAB;

import java.util.Random;

public class Laptop extends Computador {
    Random random = new Random();
    private boolean gpu;

    public Laptop(int id) {
        super(id);
        setNivel("Edge");
        setRam((int) Math.pow(2, random.nextInt(3) + 4));
        setArmazenamento((int) Math.pow(2, random.nextInt(3) + 8));
        setCpu((double) (Math.round(((random.nextDouble() + 2) * 10)))/10);
        if (random.nextInt(2) == 1)
            setArquitetura("x64");
        else
            setArquitetura("ARM");
        if (random.nextInt(2) == 1)
            this.gpu = true;
        else
            this.gpu = false;
    }

    public boolean getGpu() {
        return gpu;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    public double getConsumo() {
        if(this.gpu)
            return Math.round((50 * this.getCPU() * 1.2));
        else
            return Math.round((50 * this.getCPU()));
    }

    public String getTipo() {return "Laptop";}

    public String toString() {
        if(this.gpu)
            return (super.toString() + "; GPU -> Sim");
        else
            return (super.toString() + "; GPU -> Não");
    }
}