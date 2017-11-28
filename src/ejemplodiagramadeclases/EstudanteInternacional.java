
package ejemplodiagramadeclases;


public class EstudanteInternacional extends Persoa{
    private String nomeCole, pais;
    private int nivel;
    public EstudanteInternacional(String nome, String direccion,String nC,int nivel,String pais){
        super(nome,direccion);
        this.nomeCole=nC;
        this.nivel=nivel;
        this.pais=pais;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString()+" EstudanteInternacional{ " + " nomeCole= " + nomeCole + ", pais= " + pais + ", nivel=" + nivel + '}';
    }
    
}
