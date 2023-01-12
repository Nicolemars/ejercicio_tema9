public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(24, "Carlos", "3245678987",200000);
        System.out.print("Nombre del cliente: "+cliente.nombre + "\n" +
                "Edad del cliente: "+cliente.edad+"\n" +
                "Telefono del cliente: "+cliente.telefono+"\n" +
                "Credito del cliente: "+cliente.credito+"\n\n");

        Trabajador trabajador = new Trabajador(28, "Armando", "7327246", 150000);
        System.out.print("Nombre del trabajador: "+trabajador.nombre + "\n" +
                "Edad del trabajador: "+trabajador.edad+"\n" +
                "Telefono del trabajador: "+trabajador.telefono+"\n" +
                "Credito del trabajador: "+trabajador.salario);

    }
}
class Persona {
    int edad;
    String nombre, telefono;

    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    double credito;
    public Cliente(int edad, String nombre, String telefono, double credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }
}
class Trabajador extends Persona{
    double salario;
    public Trabajador(int edad, String nombre, String telefono,double salario){
        super(edad,nombre, telefono);
        this.salario = salario;
    }
}