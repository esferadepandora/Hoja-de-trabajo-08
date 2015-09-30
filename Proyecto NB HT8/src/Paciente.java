public class Paciente implements Comparable<Paciente>{
    //ATRIBUTOS
    private String nombre;
    private String padecimiento;
    private String prioridad;
    
    //CONSTRUCTORES
    public Paciente(String nombre, String padecimiento, String prioridad) {
	this.nombre=nombre;
        this.padecimiento=padecimiento;
        this.prioridad=prioridad;
    }
    public Paciente() {
	nombre="";
        padecimiento="";
        prioridad="";
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getPadecimiento(){
        return padecimiento;
    }
    public String getPrioridad(){
        return prioridad;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPadecimiento(String padecimiento){
        this.padecimiento=padecimiento;
    }
    public void setPrioridad(String prioridad){
        this.prioridad=prioridad;
    }  

    @Override
    public int compareTo(Paciente o) {
        int resultado=0;
        if((this.prioridad).compareTo(prioridad)==0){
            resultado=0;
        }
        if((this.prioridad).compareTo(prioridad)==1){
            resultado=1;
        }
        if((this.prioridad).compareTo(prioridad)==-1){
            resultado=-1;
        }
        return resultado;
    }      
}
