public class Coche {

        private String matricula;
        private String marca;
        private String modelo;
        private String color;
        private boolean techoSolar;
        private double kilometros;
        private int numPuertas;
        private int numPlazas;

        public Coche(){
            setMatricula("Sin matricular");
            setMarca("SEAT");
            setModelo("ALTEA");
            setColor("blanco");
            isTechoSolar(false);
            setKilometros(0.0);
            setNumPuertas(3);
            setNumPlazas(5);
        }

        /**
         * Constructor Coche (matricula): creamos un coche con una matrícula determinada. Al resto de variables de instancia se les asignará el valor por defecto.
         * @param matricula
         */
        public Coche(String matricula){
            this();
            setMatricula(matricula);
        }

        /**
         * Constructor Coche (numPuertas, numPlazas): creamos un coche según un nº de puertas y un nº de plazas (ambos números han de cumplir los requisitos). El resto de variables tomarán valores por defecto.
         * @param numPuertas
         * @param numPlazas
         */
        public Coche(int numPuertas, int numPlazas){
            this();
            setNumPuertas(numPuertas);
            setNumPlazas(numPlazas);
        }

        /**
         * Constructor Coche (marca,modelo,color): crea un coche y le asigna la marca, el modelo y el color pasados por parámetro. El resto de variables tomarán valores por defecto.
         * @param marca
         * @param modelo
         * @param color
         */
        public Coche(String marca, String modelo, String color){
            this();
            setMarca(marca);
            setModelo(modelo);
            setColor(color);
        }

        /**
         * Método avanzar(kilometros): este método hace que el mecánico recorra kilómetros para hacer avanzar el cuentakilómetros. Le suma los kilómetros a los que ya tenía. Muestra un mensaje por pantalla indicando la operación realizada y los kilómetros totales del coche.
         * @param kilometros
         */
        public void avanzar(double kilometros){
            this.kilometros = this.kilometros + kilometros;
            System.out.println("Operación realizada \n"
                    + "Los kilometros totales del coche son: " + getKilometros());
        }

        /**
         * Método tunear(): este método deja el cuentakilómetros a cero y le instala un techo solar, en el caso de que no lo tuviera ya instalado. Muestra un mensaje indicando la operación.
         */
        public void tunear(){
            this.kilometros = 0.0;
            //Sino tiene techo solar, se lo asignamos
            if(this.techoSolar!= true){
                this.techoSolar = true;
            }
            else{
                System.out.println("no se puede añadir el techo solar, porque ya lo tiene");
            }
            System.out.println("Operación realizada");
        }

        /**
         * Método tunear(color): este método sobrecarga el método anterior, pintando el coche del color pasado como parámetro, deja el cuentakilómetros a cero y le instala un techo solar, en el caso de que no lo tuviera ya instalado. Muestra un mensaje indicando la operación.
         * @param color
         */
        public void tunear(String color){
            this.color = color;
            this.kilometros = 0.0;
            if(this.techoSolar!= true){
                this.techoSolar = true;
            }
            else{
                System.out.println("no se puede añadir el techo solar, porque ya lo tiene");
            }
            System.out.println("Operación realizada");
        }

        /**
         * Método matricular(matricula): matricula un coche (le asigna la matrícula). Muestra un mensaje indicando la operación.
         * @param matricula
         */
        public void matricular(String matricula){
            this.matricula = matricula;
            System.out.println("Operación realizada" + this.matricula);
        }

        public String getMatricula(){
            return matricula;
        }

        public void setMatricula(String matricula){
            this.matricula = matricula;
        }

        public String getMarca(){
            return marca;
        }

        public void setMarca(String marca){
            this.marca = marca;
        }

        public String getModelo(){
            return modelo;
        }

        public void setModelo(String modelo){
            this.modelo = modelo;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTechoSolar() {
            String mensaje;
            if(techoSolar==true){
                mensaje = "Si";
            }
            else{
                mensaje = "No";
            }
            return mensaje;
        }

        public void isTechoSolar(boolean techoSolar) {
            this.techoSolar = techoSolar;
        }

        public double getKilometros() {
            return kilometros;
        }

        public void setKilometros(double kilometros) {
            /**
             * Si los kilometros pasado por parametros son igual mayor a 0, se asigna sus km.
             */
            if(kilometros >= 0.0){
                this.kilometros = kilometros;
            }
            //Sino, le asignamos por defecto 0 km.
            else{
                this.kilometros = 0.0;
            }
        }

        public int getNumPuertas() {
            return numPuertas;
        }

        public void setNumPuertas(int numPuertas) {
            if(numPuertas > 0 && numPuertas <=5){
                this.numPuertas = numPuertas;
            }
            else{
                System.out.println("El número de puertas por defecto es 3, por tanto lo asignamos.");
                this.numPuertas = 3;
            }

        }

        public int getNumPlazas() {
            return numPlazas;
        }

        public void setNumPlazas(int numPlazas) {
            if(numPlazas > 0 && numPlazas <= 7){
                this.numPlazas = numPlazas;
            }
            else{
                System.out.println("El número de plazas por defecto es 5, por tanto lo asignamos");
                this.numPlazas = 5;
            }
        }


    }




