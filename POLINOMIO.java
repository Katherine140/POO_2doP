package PROYECTO;

public class POLINOMIO implements COMPLEMENTO {
    protected String tipo;
    protected String grado;
    protected String terminos;

    public POLINOMIO() {
        //this.color = "Verde";
    }

    public POLINOMIO(String tipo) {
        this.tipo = tipo;

    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo=tipo;

    }

    @Override
    public String getGrado() {
        return grado;

    }

    @Override
    public void setGrado(String grado) {
        this.grado=grado;

    }

    @Override
    public String getTerminos() {
        return terminos;

    }

    @Override
    public void setTerminos(String terminos) {
        this.terminos=terminos;

    }
}