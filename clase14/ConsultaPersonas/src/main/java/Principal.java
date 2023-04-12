import java.sql.*;

public class Principal {
    public static void main(String[] args) throws SQLException {


        // Establecer la conexión
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Personas", "root", "root");

        // Obtener una sentencia
        Statement st = conn.createStatement();

        // Ejecutar la consulta
        ResultSet rs = st.executeQuery("select * from personas"); // Traeme todas las columnas de la tabla de personas
        // Recorrer el conjunto de filas
        while (rs.next()) {
            // Una vuelta por cada persona
            int doc = rs.getInt("documento");
            String nom = rs.getString("nombre");
            String ape = rs.getString("apellido");
            int edad = rs.getInt("edad");

            System.out.println(doc + " - " + nom + " - " + ape + " - " + edad);
        }

        // Cerrar todo
        rs.close();
        conn.close();
    }


}
