package LAB;

import java.util.ArrayList;

public class NCSLab{
    private int lastID = 1;
    private ArrayList<Computador> arrayComputadoresNCSLab = new ArrayList<>(15);

    public NCSLab() {
        for(int i = 0; i < 5; i++){
            Computador servidor = new Servidor(lastID);
            arrayComputadoresNCSLab.add(servidor);
            lastID++;
        }
        for(int i = 0; i < 5; i++){
            Computador laptop = new Laptop(lastID);
            arrayComputadoresNCSLab.add(laptop);
            lastID++;
        }
        for(int i = 0; i < 5; i++){
            Computador raspberryPi = new RaspberryPi(lastID);
            arrayComputadoresNCSLab.add(raspberryPi);
            lastID++;
        }
    }

    public void printComputadores() {
        System.out.println("Computadores:");
        for(Computador computador: arrayComputadoresNCSLab){
            System.out.println(computador);
        }
        System.out.println();
    }

    public void printComputadoresx64() {
        System.out.println("Computadores de arquitetura x64:");
        for(Computador computador: arrayComputadoresNCSLab){
            if(computador.getArquitetura().equalsIgnoreCase("x64")){
                System.out.println(computador);
            }
        }
        System.out.println();
    }

    public void printConsumosComputadores() {
        System.out.println("Consumos dos computadores:");
        for(Computador computador: arrayComputadoresNCSLab){
            System.out.print("ID -> " + computador.getId() + "; Tipo -> " + computador.getTipo());
            System.out.println("; Consumo -> " + computador.getConsumo() + "W");
        }
        System.out.println();
    }
}