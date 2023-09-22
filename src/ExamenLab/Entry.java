package ExamenLab;

public class Entry {
    
    public String username;
    public long posregistro;
    public Entry siguiente;
    
    public Entry(String username, long posregistro){
        this.username=username;
        this.posregistro=posregistro;
        siguiente=null;
    }
}
