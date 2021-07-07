public class Socios {
    private String nombre;
    private int numero;
    private String sexo;
    public Socios(String nombre) {
        this.nombre=nombre;
        this.numero=1;
    }
    String GetNombre() {
        return nombre;
    }
    int Getnumero() {
        return numero;
    }
    void SetSexo(String sexo) {
        this.sexo=sexo;
    }
    String GetSexo() {
        return sexo;
    }
    void SetNum() {
        this.numero++;
    }
}

