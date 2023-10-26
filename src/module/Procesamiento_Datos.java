package module;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Procesamiento_Datos {

    Statement myStamt = null;
    ResultSet myRes = null;

    public Procesamiento_Datos(){
        System.out.println("Comenzamos a procesar Datos");
    }


    public void ProcesarColumna(Conector conector,String tabla,String[] args) throws SQLException {

        myStamt = conector.myConn.createStatement();
        myRes = myStamt.executeQuery("SELECT * FROM " + tabla);

        while (myRes.next()){
            System.out.println(myRes.getString(args[0]) + " " + myRes.getString(args[1]) + " " + myRes.getString(args[2]) + " " + myRes.getString(args[3]));
        }
    }
}
