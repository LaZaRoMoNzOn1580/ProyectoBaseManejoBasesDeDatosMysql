import module.*;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try{

            Conector conectar = new Conector("jdbc:mysql://localhost:3306/platziblog","root","Lazaro12345@*");
            Procesamiento_Datos Prd = new Procesamiento_Datos();
            EliminarDato ErD = new EliminarDato();
            //Insertar_datos Isd = new Insertar_datos();
            //ActualizarDatos Acd = new ActualizarDatos();
            String Tabla = "people";
            conectar.CrearConexion();
            System.out.println("**************************");
            //Acd.Actualizacion(conectar, Tabla, "city", "Madrid", "frist_name", "Tania");
            ErD.eliminarPersona(conectar,Tabla,"frist_name","Dani");
            Prd.ProcesarColumna(conectar,Tabla, new String[]{"frist_name","last_name","city","address"});



        } catch (Exception e){
             e.printStackTrace();
            System.out.println("Algo ha Salido Mal");
        }
    }
}
