package Ejercicio3;

public class electrodomestico {

    private double precio;
    private String color;
    private String consumo;
    private double peso;

    public electrodomestico() {
        this.color = "blanco";
        this.consumo = "F";
        this.precio = 100.0;
        this.peso = 5.0;
    }

    public electrodomestico(double precio, double peso) {
        this.precio = 500;
        this.color = "";
        this.consumo = "A";
        this.peso = 847.5;
    }

    public String getColor() {
        return getColor();
    }

    public void setColor() {
        this.color = color;
    }

    public double getprecio() {
        return getprecio();
    }

    public void setPrecio() {
        this.precio = precio;
    }

    public String getConsumo() {
        return getConsumo();
    }

    public void setConsumo() {
        this.consumo = consumo;
    }

    public double getpeso() {
        return getpeso();
    }

    public void setPeso() {
        this.peso = peso;
    }

    public void comprobarconsumo(String consumo) {
        if (!consumo.equalsIgnoreCase("A") && !consumo.equalsIgnoreCase("B") && !consumo.equalsIgnoreCase("C") && consumo.equalsIgnoreCase("D") && consumo.equalsIgnoreCase("E") && consumo.equalsIgnoreCase("F")){
            this.consumo="F";
        }else {
            this.consumo=consumo;
        }
    }
    public void comprobarcolor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && color.equalsIgnoreCase("azul") && color.equalsIgnoreCase("gris")){
            this.color="blanco";
        }else{
            this.color=color;
        }
    }
    public void preciofinal(double precio){
        if(peso>0 && peso<=19){
            precio = precio+10;
            preciofinal(precio);
        }else if (peso>19 && peso<=49){
            precio = precio+50;
            preciofinal(precio);
        }else if (peso>49 && peso<=79){
            precio = precio+80;
            preciofinal(precio);
        }else if (peso>=80){
            precio = precio+100;
            preciofinal(precio);
        }
        if (consumo == "A"){
            precio = precio+100;
            preciofinal(precio);
        }else if (consumo == "B"){
            precio = precio+80;
            preciofinal(precio);
        }else if (consumo == "C"){
            precio = precio+60;
            preciofinal(precio);
        }else if (consumo == "D"){
            precio = precio+50;
            preciofinal(precio);
        }else if (consumo == "E"){
            precio = precio+30;
            preciofinal(precio);
        }else if (consumo == "F"){
            precio = precio+10;
            preciofinal(precio);
        }
    }
    public void Lavadora(int carga){

    }
}
