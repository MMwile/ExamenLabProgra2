package ExamenLab;

import java.util.ArrayList;

public class HashTable {
    
    private Entry inicio=null;
    private int tamaño=0;
    
    public boolean add(String username, long posregistro){
        if(inicio==null){
            inicio=new Entry(username,posregistro);
        }else{
            Entry temporal=inicio;
            while(temporal.siguiente!=null){
               temporal=temporal.siguiente;
            }
            temporal.siguiente=new Entry(username,posregistro);
            return true;
        }
        return false;
    }
    
    public boolean remove(String username){
        if(inicio!=null){
            if(inicio.username.equals(username)){
                inicio=inicio.siguiente;
            }else{
                Entry temporal=inicio;
                while(temporal.siguiente!=null){
                    if(temporal.siguiente.username.equals(username)){
                        temporal.siguiente=temporal.siguiente.siguiente;
                        return true;
                    }
                    temporal=temporal.siguiente;
                }
            }
        }
        return false;
    }
    
    public long Search(String username){
        if(inicio!=null){
            if(inicio.username.equals(username)){
                return inicio.posregistro;
            }else{
                Entry temporal=inicio;
                while(temporal.siguiente!=null){
                    if(temporal.username.equals(username)){
                        return temporal.posregistro;
                    }
                    temporal=temporal.siguiente;
                }
            }
        }
        return -1;
    }
    
    //Inge no pidio esta funcion pero yo la utilizo para listar todos los usuarios activos
    public ArrayList<String> getAllActiveUsers(){
        ArrayList<String> users = new ArrayList();
        if(inicio!=null){
            Entry temporal=inicio;
            while(temporal!=null){
                users.add(temporal.username);
                temporal=temporal.siguiente;
            }
            return users;
        }
        return null;
    }
}
