public class Proyecto {
    private String nombre;
    private String descripcion;
    private double initialCost;
    // Establece el nombre y la descripción en caso de no especificar ninguna
    public Proyecto(){
        nombre = "Nombre del proyecto";
        descripcion = "Descripci\u00f3n del proyecto";
    }
    //Fija la descripción en caso de que no se especifique
    public Proyecto(String nombre){
        this.nombre = nombre;
        descripcion = "Descripci\u00f3n del proyecto";
    }
    //Fija ambas, que son llamadas desde ProyectoTest
    public Proyecto(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    // Fija nombre, proyecto y el costo inicial provenientes de ProyectoTest
    public Proyecto(String nombre, String descripcion, Double initialCost){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.initialCost = initialCost;
    }
    // Getters y Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion; 
    }
    public double getInitialCost(){
        return initialCost;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }
    //elevatorPitch
    public String elevatorPitch(){
        if(initialCost > 0){
            return nombre+" ("+initialCost+"): "+descripcion;
        }
        else{
            return nombre+" (Costo no especificado): "+descripcion;
        }
    }
}