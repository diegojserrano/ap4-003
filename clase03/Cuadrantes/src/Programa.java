public class Programa {

    public static void main(String[] args) {


        float x, y;
        // Completar!!!

        if (x != 0 && y != 0) {
            int cuadrante;

            if (x > 0) { // esta en el cuadrante I o IV
                if (y > 0) cuadrante = 1;
                else       cuadrante = 4;
            } else { // esta en el cuadrante II o III
                if (y > 0) cuadrante = 2;
                else       cuadrante = 3;
            }
            System.out.println("El punto está en el cuadrante " + cuadrante);
        } else { // Está en el origen o en un eje
            System.out.println("Está en el origen o en un eje");
            // Podriamos poner otras condiciones para ver dónde está
        }
    }
}
