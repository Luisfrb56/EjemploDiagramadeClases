
package ejemplodiagramadeclases;


public class Persoa {
         private String nome,direccion;
        
    public Persoa(String n, String d){
       this.nome=n;
       this.direccion=d;
       
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", direccion=" + direccion + '}';
    }
    
}