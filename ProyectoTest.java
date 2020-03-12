public class ProyectoTest {
    public static void main(String[] args) {
        Proyecto proyecto0 = new Proyecto();
        Proyecto proyecto1 = new Proyecto("Jugueteria");
        Proyecto proyecto2 = new Proyecto("Pizzeria", "Entrega de pizzas a domicilio");
        Proyecto proyecto3 = new Proyecto("Supermercado", "Abastecimiento de confites", 1000000.0);

        System.out.println(proyecto0.elevatorPitch());
        System.out.println(proyecto1.elevatorPitch());
        System.out.println(proyecto2.elevatorPitch());
        System.out.println(proyecto3.elevatorPitch());
    }
}