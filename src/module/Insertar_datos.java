package module;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertar_datos {
    PreparedStatement myStatmen = null;

    public Insertar_datos(){
        System.out.println("Se realizara el intento de Insertar datos");
    }

    public void InsertarNuevaRowCon2PrimerasColumnas(Conector conector,String tabla,String [] args) throws SQLException {

        String sql = ("INSERT INTO " + tabla + " (" + args[0] + ", " + args[1] + ") VALUES (?, ?)");
        myStatmen = conector.myConn.prepareStatement(sql);
        myStatmen.setString(1,args[2]);
        myStatmen.setString(2,args[3]);

        int rowsAffect = myStatmen.executeUpdate();

        if(rowsAffect > 0){
            System.out.println("Se ha creado un nuevo emplado");
        }

    }

}
