package HERENCIA;

public class ANIMALES implements ComAnimal{
    protected String color;
    protected String tamaño;
    protected String edad;

    public ANIMALES(){
        //this.color = "Verde";
    }
    public ANIMALES (String color){
        this.color = color;

    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void setTamaño(String tamaño) {
this.tamaño = tamaño;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public void setEdad(String edad) {
this.edad = edad;
    }
}
