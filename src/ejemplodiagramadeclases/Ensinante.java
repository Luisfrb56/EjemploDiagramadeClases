
package ejemplodiagramadeclases;


public class Ensinante extends Persoa{
    private String materia;

    public Ensinante(String materia, String nome, String direccion) {
        super(nome, direccion);
        this.materia = materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString()+" Ensinante{" + " materia= " + materia + '}';
    }
    

    }

