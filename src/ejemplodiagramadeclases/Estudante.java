
package ejemplodiagramadeclases;


public class Estudante extends Persoa{
     private String nomeCole;
        private int nivel;
        
    public Estudante(String nome, String direccion,String nC,int nivel){
       super(nome,direccion);
       this.nomeCole=nC;
       this.nivel=nivel;
       
    }

    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNome() {
        return super.getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString()+" Estudante{ " + " nomeCole= " + nomeCole + ", nivel=" + nivel + '}';
    }

}
