public class Fabrica {

    public static void main(String[] args){

        Coche car1 = new Coche();
        car1.setMatricula("1234-DF");
        car1.setModelo("Toledo");
        car1.setColor("azul");
        car1.setKilometros(200);

        Coche car2 = new Coche("5678-AG");
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.setColor("rojo");
        car2.isTechoSolar(true);
        car2.setKilometros(300);
        car2.setNumPlazas(2);

        Coche car3 = new Coche(5,5);
        car3.setMatricula("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("gris");
        car3.setKilometros(400);

        Coche car4 = new Coche("VW", "Caddy", "blanco");
        car4.setMatricula("3456-XS");
        car4.isTechoSolar(true);
        car4.setKilometros(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);


        Coche[] c = new Coche[4];
        c[0] = car1;
        c[1] = car2;
        c[2] = car3;
        c[3] = car4;

        /*
        for(int i=0; i < c.length; i++){
            caracteristicas(c[i]);
        }
        */

        //bucle for mejorado
        for (Coche c1 : c) {
            caracteristicas(c1);
        }

    }

    public static void caracteristicas(Coche c){
        String mensaje = "Matricula: " + c.getMatricula()
                + "\nMarca: " + c.getMarca()
                + "\nModelo: " + c.getModelo()
                + "\nColor: " + c.getColor()
                + "\nTecho Solar: " + c.getTechoSolar()
                + "\nKilometros:  " + c.getKilometros()
                + "\nNum Puertas: " + c.getNumPuertas()
                + "\nNum Plazas: " + c.getNumPlazas();
        System.out.println(mensaje+"\n");
    }

}



