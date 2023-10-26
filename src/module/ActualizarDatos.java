package module;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarDatos {

    Statement myStamt = null;
    ResultSet myRes = null;

    public ActualizarDatos(){
        System.out.println("Comenzamos a actualizar datos");
    }

    public void Actualizacion(Conector conector, String tabla, String ColumnaChange, String dato, String LocalizationColumn, String localizatorDate) throws SQLException {
        String updateQuery = "UPDATE " + tabla + " SET " + ColumnaChange + " = ? WHERE " + LocalizationColumn + " = ?";
        PreparedStatement preparedStatement = conector.myConn.prepareStatement(updateQuery);
        preparedStatement.setString(1, dato);
        preparedStatement.setString(2, localizatorDate);
        int rowsAffected = preparedStatement.executeUpdate();
        if(rowsAffected > 0){
            System.out.println("Se ha realizado el cambio con exito");
        }
    }



}
