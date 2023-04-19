
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws SQLException {

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
//1820.56
        System.out.println(c);

    }
//    public static void main(String[] args) throws IOException {
//
//        Path archivo = Paths.get("ticket.csv");
//        Scanner lector = new Scanner(archivo);
//        Compra c = new Compra();
//
//        lector.useLocale(Locale.forLanguageTag("es-AR"));
//        // float y double solo con comas!
//        lector.useDelimiter("[;\\n\\r]+");
//
//        while(lector.hasNext()) {
//            String desc = lector.next();
//            long cod = lector.nextLong();
//            float precio = lector.nextFloat();
//            float cant = lector.nextFloat();
//
//            Item nuevo = new Item(cod, desc, precio, cant);
//            c.agregarItem(nuevo);
//        }
//
//        lector.close();
////1820.56
//        System.out.println(c);
//
//    }
}
