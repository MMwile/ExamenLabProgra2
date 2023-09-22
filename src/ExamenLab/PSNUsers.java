package ExamenLab;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class PSNUsers {
    
    RandomAccessFile usuarios;
    HashTable users;
    
    public PSNUsers() throws IOException{
        usuarios = new RandomAccessFile("usuarios.data","rw");
        reloadHashTable();
    }
    
    private void reloadHashTable() throws IOException{
        users = new HashTable();
        if(usuarios.length()!=0){
            usuarios.seek(0);
            while(usuarios.getFilePointer()<usuarios.length()){
                long posicion = usuarios.getFilePointer();
                String username = usuarios.readUTF();
                usuarios.skipBytes(8);
                if(usuarios.readBoolean()==true)
                    users.add(username, posicion);
            }
        }
    }
    
    public void addUser(String username) throws IOException{
        long posregistro=0;
        if(usuarios.length()!=0){
            usuarios.seek(usuarios.length());
            posregistro=usuarios.getFilePointer();
        }
        if(users.Search(username)==-1){
            usuarios.writeUTF(username);
            usuarios.writeInt(0);
            usuarios.writeInt(0);
            usuarios.writeBoolean(true);
            users.add(username, posregistro);
            JOptionPane.showMessageDialog(null, "Se ha creado el usuario exitosamente", "Usuario creado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "El usuario ya está creado", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void deactivateUser(String username)throws IOException{
        if(users.Search(username)!=-1){
            usuarios.seek(users.Search(username));
            usuarios.readUTF();
            usuarios.skipBytes(8);
            usuarios.writeBoolean(false);
            users.remove(username);
        }
    }
    
    public void addTrophyTo(String username, String juego, String nombretrofeo, Trophy tipo) throws IOException{
        RandomAccessFile trofeos = new RandomAccessFile("psn.data","rw");
        if(trofeos.length()!=0){
            trofeos.seek(trofeos.length());
        }
        usuarios.seek(users.Search(username));
        usuarios.readUTF();
        long mantenerse=usuarios.getFilePointer();
        int puntos = usuarios.readInt();
        usuarios.seek(mantenerse);
        usuarios.writeInt(puntos+tipo.points);
        mantenerse=usuarios.getFilePointer();
        int cantrofeos = usuarios.readInt();
        usuarios.seek(mantenerse);
        usuarios.writeInt(cantrofeos+=1);
        trofeos.writeUTF(username);
        trofeos.writeUTF(tipo.name());
        trofeos.writeUTF(juego);
        trofeos.writeUTF(nombretrofeo);
        trofeos.writeLong(Calendar.getInstance().getTimeInMillis());
    }
    
    public String playerInfo(String username) throws IOException{
        if(users.Search(username)!=-1){
            RandomAccessFile trofeos = new RandomAccessFile("psn.data","rw");
            String datos = username+"\n";
            usuarios.seek(users.Search(username));
            datos+="Nombre: "+usuarios.readUTF()+"\n";
            datos+="Cantidad de puntos: "+usuarios.readInt()+"\n";
            datos+="Cantidad de trofeos: "+usuarios.readInt()+"\n\n\n";
            datos+="Trofeos\nFecha - Tipo - Juego - Descripcion\n";
            trofeos.seek(0);
            while(trofeos.getFilePointer()<trofeos.length()){
                String usuario=trofeos.readUTF();
                String tipo=trofeos.readUTF();
                String juego=trofeos.readUTF();
                String descripcion=trofeos.readUTF();
                Date fecha = new Date(trofeos.readLong());
                String formato = fecha+" - "+tipo+" - "+juego+" - "+descripcion+"\n";
                if(username.equals(usuario)){
                    datos+=formato;
                }
            }
            return datos;
        }
        return null;
    }
    
    //Funcion auxiliar de la otra
    public ArrayList<String> getAllUsers(){
        return users.getAllActiveUsers();
    }
}
