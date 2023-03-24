package Prototype;

public class Carga implements Cloneable {

    private int Serial;
    private String nome;
    private String material;

    public Carga(int serial, String nome, String material){

        this.Serial = serial;
        this.nome = nome;
        this.material = material;
    }

    public int getSerial() {
        return Serial;
    }

    public void setSerial(int serial) {
        this.Serial = serial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    @Override
    public Carga clone() throws CloneNotSupportedException {
        Carga cargaClone = (Carga) super.clone();
        return cargaClone;
    }
    @Override
    public String toString() {
        return "Carga{" +
                "serial=" + Serial +
                ", nome='" + nome + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

