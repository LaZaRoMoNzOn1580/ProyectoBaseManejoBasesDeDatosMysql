package module;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarDato {

    PreparedStatement preparedStatement = null;
    public EliminarDato(){
        System.out.println("Vamos a Ejeccutar una Eliminacion de Datos");
    }

    public void eliminarPersona(Conector conector, String tabla, String columnaDeEliminacion, String valorAEliminar) throws SQLException {
        String deleteQuery = "DELETE FROM " + tabla + " WHERE " + columnaDeEliminacion + " = ?";

        try{
            PreparedStatement preparedStatement = conector.myConn.prepareStatement(deleteQuery);
            preparedStatement.setString(1, valorAEliminar);
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Se eliminó el registro exitosamente.");
            } else {
                System.out.println("No se encontró ningún registro para eliminar.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
