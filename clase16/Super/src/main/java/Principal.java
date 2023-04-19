
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SQLException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Super", "root", "root");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from Items");

        Compra c = new Compra();
        while(rs.next()) {
            String desc = rs.getString("nombre");
            long cod = rs.getLong("codigo");
            float precio = rs.getFloat("precio");
            float cant = rs.getFloat("cantidad");
            boolean ret = rs.getBoolean("retirado");


            Item nuevo = new Item(cod, desc, precio, cant, ret);
            c.agregarItem(nuevo);
        }

        rs.close();
        conn.close();

        System.out.println(c);

        // Generar un JSON con todos los datos del ticket
        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(c));
        om.writeValue(Paths.get("compra.json").toFile(),c);



    }

}
