 public class Main{
    public static void main(String[] args) {
        Persona Persona = new Persona();
        Persona.setNombre("camilo");
        Persona.setEdad( 16);
        Persona.setTelefono(322492224);

        System.out.println(Persona.getNombre());
        System.out.println(Persona.getEdad());
        System.out.println(Persona.getTelefono());
    }
 }
     class Persona{                   
        private String nombre;
        private int edad;
        private int telefono; 

        public Persona(){

        }
    public String getNombre(){
        return nombre;
    }
   public void setNombre(String nombre){
    this.nombre= nombre;
}
public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    this.edad= edad;
}
public int getTelefono(){
    return telefono;
}
public void setTelefono(int telefono){
    this.telefono= telefono;
}

   }
   
    
