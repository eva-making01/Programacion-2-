class Escuela{ 
     private String carrera;
        private String salon;
        private String alumno;

        public Escuela(String carrera, String salon, String alumno){
            this.carrera = carrera;
            this.salon = salon;
            this.alumno = alumno;
        }

    public void enseñar (String nombremateria){

        System.out.println("" + alumno + " aprendio la materia de: " + nombremateria);
        System.out.println("En la carrera de: " + carrera);
        System.out.println("En el salon: " + salon);
    }
    public void titularse (String nombremateria){

        System.out.println(" " + alumno + " se titula en la carrera de: " + nombremateria);
        System.out.println("En el salon: " + salon);
    }
    public void pagar (String nombremateria){

        System.out.println(" " + alumno + " pago el semestre de la UDG" );
        System.out.println("En la carrera de: " + carrera);
        System.out.println("En el salon: " + salon);
        System.out.println("El  " + java.time.LocalDate.now());
    }
}