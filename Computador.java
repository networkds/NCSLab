package LAB;

public class Computador{
    private String nivel = null;
    private int id;
    private int ram = 0;
    private int armazenamento = 0;
    private double cpu = 0;
    private String arquitetura = null;

    public Computador(int id) {this.id = id;}

    public String getNivel() {return this.nivel;}

    public int getId() {return this.id;}

    public int getRam() {return this.ram;}

    public int getArmazenamento() {return this.armazenamento;}

    public double getCPU() {return this.cpu;}

    public String getArquitetura() {return this.arquitetura;}

    public double getCpu() {return cpu;}

    public void setArmazenamento(int armazenamento) {this.armazenamento = armazenamento;}

    public void setArquitetura(String arquitetura) {this.arquitetura = arquitetura;}

    public void setCpu(double cpu) {this.cpu = cpu;}

    public void setId(int id) {this.id = id;}

    public void setNivel(String nivel) {this.nivel = nivel;}

    public void setRam(int ram) {this.ram = ram;}

    public String toString(){
        return ("ID -> " + this.getId() + "; RAM -> " + this.getRam() + "GB; Armazenamento -> " + this.getArmazenamento() + "GB; CPU -> " + this.getCPU() + "GHz; Nível -> " + this.getNivel() + "; Arquitetura -> " + this.getArquitetura());
    }

    public String getTipo() {return "Computador";}

    public double getConsumo() {return 0;}
}