//package Memorabilia;
import java.util.*;
public class Memorabilia {
    // ARREGLO PELICULAS
    String[] peliculas =  new String[25] ;
    Scanner entrada = new Scanner (System.in);
    int[] idPeliculas =  new int[25];
    int[] anioPeliculas =  new int[25];
    
    // ARREGLOS DE CLIENTE
    int[] idClientes = new int[25];
    String[] nombreClientes = new String[25];
    int[] telefonoClientes = new int[25];

    // ARREGLOS DE INGRESOS DE PELICULAS 
    int[] idingrepeli = new int[5];
    String[] nombreingrepeli = new String[5];
    int[] anioingrepeli = new int[5];
    String[] categoriaingrepeli = new String[5];



    
    public static void main ( String[] args){
    Memorabilia practica2 = new Memorabilia();
    }
    
    public Memorabilia (){
        menu();
        
    }
    
    public  void menu(){
            int opcion;
        do {
            
             System.out.println("\t\t******* BIENVENIDO AL MEMORABILIA ********");
             System.out.println ("Ingrese una Opcion");
             System.out.println ("1). Prestamos de Peliculas");
             System.out.println ("2). Devolucion de Peliculas");
             System.out.println ("3). Mostrar las peliculas");
             System.out.println ("4). Ingreso de Peliculas");
             System.out.println ("5). Ingresar Clientes Nuevos");
             System.out.println ("6). Mostrar Clientes");
             System.out.println ("7). Reportes");
             System.out.println ("8). Salir");
             opcion = entrada.nextInt();
             
                switch ( opcion){

                    //Prestamos de peliculas
                    case 1 :
                      
                        
                        break;
                    
                    //Devolucion de peliculas
                    case 2 :
                        break;
                     
                    // Mostrar peliculas    
                    case 3 :
                         menuPeliculas();
                        break;
                    
                    
                    //Ingreso de peliculas  
                    case 4 :
                        ingresarPeliculas();
                        
                        break;
                     
                     //Ingresar clientes nuevos   
                    case 5 :
                        ingresarClientes();
                        //ingresarClientes( id, nombres, telefono, 5);
                        break;
                    
                    // Mostrar clientes   
                    case 6 :
                        //mostrarClientes(id, nombres, telefono, 5);
                        mostrarClientes(idClientes, nombreClientes, telefonoClientes);
                        break;
                    
                    // Reportes  
                    case 7 :
                        break;
                        
                    case 8 :
                        System.out.println("*****Gracias por Preferirnos*****");
                        break;
                         
          
                }
             
          }while( opcion !=8 );
   
   }
    
    // Todas las peliculas agregadas 
    public void mostrarAccion ( ){
        
        idPeliculas [0] = 51;
        peliculas [0] = "Joker";
        anioPeliculas [0] = 2019;
        
        idPeliculas [1] = 52;
        peliculas [1] = "Avengers EndGame";
        anioPeliculas [1] = 2019;
         
        idPeliculas [2] = 55;
        peliculas [2] = "Jonh wick 3";
        anioPeliculas [2] = 2018;
        
        idPeliculas [3] = 57;
        peliculas [3] = " X-MEN Apocalipsis";
        anioPeliculas [3] = 2014;
        
        idPeliculas [4] = 60;
        peliculas [4] = "Transformers 3";
        anioPeliculas [4] = 2007;
    
    }
    
    public void mostrarComedia(){

        idPeliculas [0] = 62;
        peliculas [0] = "Que paso ayer 3";
        anioPeliculas [0] = 2016;

        idPeliculas [1] = 64;
        peliculas [1] = "Son como niños";
        anioPeliculas [1] = 2009;

        idPeliculas [2] = 66;
        peliculas [2] = "Scary Movie 5";
        anioPeliculas [2] = 2015;

        idPeliculas [3] = 68;
        peliculas [3] = "Quiero Matar a mi jefe 2";
        anioPeliculas [3] = 2014;

        idPeliculas [4] = 70;
        peliculas [4] = "Chiquito pero Peligroso";
        anioPeliculas [4] = 2005;
    
    }
    
    public void mostrarRomanticas(){
        
        idPeliculas [0] = 81;
        peliculas [0] = "2 metros de ti";
        anioPeliculas [0] = 2018;

        idPeliculas [1] = 83;
        peliculas [1] = " Titanic";
        anioPeliculas [1] = 2005;

        idPeliculas [2] = 85;
        peliculas [2] = "Yo antes de ti";
        anioPeliculas [2] = 2015;

        idPeliculas [3] = 87;
        peliculas [3] = "Diario de Noa";
        anioPeliculas [3] = 2007;

        idPeliculas [4] = 89;
        peliculas [4] = "50 Sombras de Grey";
        anioPeliculas [4] = 2015;
    
    }
    
    public void mostrarMiedo(){
        
        idPeliculas [0] = 92;
        peliculas [0] = "El conjuro 2";
        anioPeliculas [0] = 2016;

        idPeliculas [1] = 94;
        peliculas [1] = "Insidiaus 4";
        anioPeliculas [1] = 2018;

        idPeliculas [2] = 96;
        peliculas [2] = "Annabelle";
        anioPeliculas [2] = 2014;

        idPeliculas [3] = 98;
        peliculas [3] = "Paranormal 2";
        anioPeliculas [3] = 2012;

        idPeliculas [4] = 100;
        peliculas [4] = "IT 2";
        anioPeliculas [4] = 2019;
    
    }
    
    public void mostrarInfantil(){
        
        idPeliculas [0] = 12;
        peliculas [0] = "Barnnie";
        anioPeliculas [0] = 2001;

        idPeliculas [1] = 14;
        peliculas [1] = "Teletubhis";
        anioPeliculas [1] = 2000;

        idPeliculas [2] = 16;
        peliculas [2] = "Micky Mosue";
        anioPeliculas [2] = 1889;

        idPeliculas [3] = 18;
        peliculas [3] = "El Rey Leon";
        anioPeliculas [3] = 2002;

        idPeliculas [4] = 20;
        peliculas [4] = "Toy Story 4";
        anioPeliculas [4] = 2019;
    
    }
    
    // EL MENU DE PARA MOSTRAR LAS PELICULAS 
    public void menuPeliculas(){
        int opcioncategoria;
        
        do{
            System.out.println("\n*****Menu de las categorias de las peliculas*****");
            System.out.println("1). Accion.");
            System.out.println("2). Comedia.");
            System.out.println("3). Romantica.");
            System.out.println("4). Miedo.");
            System.out.println("5). Infantil.");
            System.out.println("6). Volver al menu principal.");
            
            System.out.println("\nIngrese la opcion que desee: ");
            opcioncategoria = entrada.nextInt();
            
            switch (opcioncategoria){
                case 1: 
                mostrarCategoriaAccion ();
                DatoAccion(idingrepeli, nombreingrepeli, anioingrepeli);
                    
                    break;
                case 2: 
                mostrarCategoriaComedia ();
                DatoComedia(idingrepeli, nombreingrepeli, anioingrepeli);

                    break;
                case 3:
                mostrarCategoriaRomantica ();
                DatoRomantica(idingrepeli, nombreingrepeli, anioingrepeli);

                    break;
                case 4:
                mostrarCategoriaMiedo ();
                DatoMiedo(idingrepeli, nombreingrepeli, anioingrepeli);

                    break;
                case 5:
                mostrarCategoriaInfantil ();
                DatoInfantil(idingrepeli, nombreingrepeli, anioingrepeli);

                    break;
                case 6:
                    System.out.println("\nVolviendo al menu principal");
                    System.out.println("-");
                    System.out.println("-");
                    System.out.println("-\n");
                    break;  
            }
        }while(opcioncategoria!=6);
    }

    //Categorias de las peliculas 
    public void mostrarCategoriaAccion (){
        System.out.println (" \nCATEGORIA DE ACCION");
        for (int i = 0; i < 5; i++) {
            mostrarAccion ();
            
            System.out.println (" "+ idPeliculas [i] +" ---- "+peliculas [i]+" ---- "+anioPeliculas [i]);
        }
    }

    public void mostrarCategoriaComedia (){
        System.out.println (" \nCATEGORIA DE COMEDIA");
        for (int i = 0; i < 5; i++) {
            mostrarComedia();
            
            System.out.println (" "+ idPeliculas [i] +" ---- "+peliculas [i]+" ---- "+anioPeliculas [i]);
        }
    }

    public void mostrarCategoriaRomantica (){
        System.out.println (" \nCATEGORIA ROMANTICA");
        for (int i = 0; i < 5; i++) {
            mostrarRomanticas ();
            
            System.out.println (" "+ idPeliculas [i] +" ---- "+peliculas [i]+" ---- "+anioPeliculas [i]);
        }
    }

    public void mostrarCategoriaMiedo (){
        System.out.println (" \nCATEGORIA DE MIEDO");
        for (int i = 0; i < 5; i++) {
            mostrarMiedo ();
            
            System.out.println (" "+ idPeliculas [i] +" ---- "+peliculas [i]+" ---- "+anioPeliculas [i]);
        }
    }

    public void mostrarCategoriaInfantil (){
        System.out.println (" \nCATEGORIA INFANTIL");
        for (int i = 0; i < 5; i++) {
            mostrarInfantil ();
            
            System.out.println (" "+ idPeliculas [i] +" ---- "+peliculas [i]+" ---- "+anioPeliculas [i]);
        }
        
        
    }

    //INSERTAR LAS PELICULAS 
        public void ingresarPeliculas(){
        int opcioncategoria1;
        
        do{
            System.out.println("\n*****Menu para ingresar peliculas*****");
            System.out.println("1). Accion.");
            System.out.println("2). Comedia.");
            System.out.println("3). Romantica.");
            System.out.println("4). Miedo.");
            System.out.println("5). Infantil.");
            System.out.println("6). Volver al menu principal.");
            
            System.out.println("\nIngrese la opcion que desee: ");
            opcioncategoria1 = entrada.nextInt();
            
            switch (opcioncategoria1){
                case 1:
                    ingresarAccion();
                    
                    break;
                case 2:
                    ingresarComedia();
                    
                    break;
                case 3:
                    ingresarRomantica();
                    
                    break;
                case 4:
                    ingresarMiedo();
                    
                    break;
                case 5:
                    ingresarInfantil();
                    
                    break;
                case 6:
                    System.out.println("\nVolviendo al menu principal");
                    System.out.println("-");
                    System.out.println("-");
                    System.out.println("-\n");
                    break;  
            }
        }while(opcioncategoria1!=6);
    }
    

        public boolean validar(int id, int arreglo[]){
    boolean vald = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == id) {
                vald = false;
                break;
            }

        }
        return vald;

    }
    
    // Ingresar clientes 
    public void ingresarClientes(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreClientes[25-1] == null && op == 2){
            System.out.print("\n Ingrese el ID del cliente: ");
            idAuxiliar = entrada.nextInt();
            
            if (validar(idAuxiliar,idClientes)) {
                for (int i = 0; i < 25; i++) {
                    if (nombreClientes[i] == null ) {
                        idClientes[i] = idAuxiliar;
                    ingresarDatosClientes(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otro clientre");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada1 = new Scanner(System.in);
    public void ingresarDatosClientes (int posicion){
        System.out.print("\nIngrese el nombre del Cliente: ");
        nombreClientes[posicion] = entrada1.nextLine();
        System.out.print("\nIngrese el numero de telefono: ");
        telefonoClientes[posicion] = entrada.nextInt();
    }

    //MOSTRAR CLIENTES 
    public void mostrarClientes(int[] id, String[] nombres, int[] telefono){
        for( int i =0; i< 25;i++){
             if (nombreClientes[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---Telefono: "+telefono[i]+"\n");
            }
           
        }
    }

    //PELICULAS 
    public boolean Canjear(int id, int arreglo[]){
    boolean vald = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == id) {
                vald = false;
                break;
            }

        }
        return vald;

    }

    //INGRESAR PELICULAS 
    /*int[] idingrepeli = new int[5];
    String[] nombreingrepeli = new String[5];
    int[] anioingrepeli = new int[5];
    String[] categoriaingrepeli = new String[5];
    */

    public void ingresarAccion(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreingrepeli[5-1] == null && op == 2){
            System.out.print("\n Ingrese el ID de la pelicula: ");
            idAuxiliar = entrada.nextInt();
            
            if (Canjear(idAuxiliar,idingrepeli)) {
                for (int i = 0; i < 5; i++) {
                    if (nombreingrepeli[i] == null ) {
                        idingrepeli[i] = idAuxiliar;
                    ingresarDatosPelis(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otra pelicula");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada2 = new Scanner(System.in);
    public void ingresarDatosPelis (int posicion){
        System.out.print("\nIngrese el nombre de la pelicula: ");
        nombreingrepeli[posicion] = entrada2.nextLine();
        System.out.print("\nIngrese el anio de la pelicula: ");
        anioingrepeli[posicion] = entrada.nextInt();
    }

    //MOSTRAR PELICULAS 
    public void DatoAccion(int[] id, String[] nombres, int[] anio){
        System.out.println("");
        System.out.println("Peliculas Ingresadas");
        for( int i =0; i< 5;i++){
             if (nombreingrepeli[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---anio: "+anio[i]+"\n");
            }
           
        }
    }

    public void ingresarComedia(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreingrepeli[5-1] == null && op == 2){
            System.out.print("\n Ingrese el ID de la pelicula: ");
            idAuxiliar = entrada.nextInt();
            
            if (Canjear(idAuxiliar,idingrepeli)) {
                for (int i = 0; i < 5; i++) {
                    if (nombreingrepeli[i] == null ) {
                        idingrepeli[i] = idAuxiliar;
                    ingresarDatosPelis2(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otra pelicula");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada3 = new Scanner(System.in);
    public void ingresarDatosPelis2 (int posicion){
        System.out.print("\nIngrese el nombre de la pelicula: ");
        nombreingrepeli[posicion] = entrada3.nextLine();
        System.out.print("\nIngrese el anio de la pelicula: ");
        anioingrepeli[posicion] = entrada.nextInt();
    }

    //MOSTRAR PELICULAS 
    public void DatoComedia(int[] id, String[] nombres, int[] anio){
        System.out.println("");
        System.out.println("Peliculas Ingresadas");
        for( int i =0; i< 5;i++){
             if (nombreingrepeli[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---anio: "+anio[i]+"\n");
            }
           
        }
    }

    public void ingresarRomantica(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreingrepeli[5-1] == null && op == 2){
            System.out.print("\n Ingrese el ID de la pelicula: ");
            idAuxiliar = entrada.nextInt();
            
            if (Canjear(idAuxiliar,idingrepeli)) {
                for (int i = 0; i < 5; i++) {
                    if (nombreingrepeli[i] == null ) {
                        idingrepeli[i] = idAuxiliar;
                    ingresarDatosPelis3(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otra pelicula");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada4 = new Scanner(System.in);
    public void ingresarDatosPelis3 (int posicion){
        System.out.print("\nIngrese el nombre de la pelicula: ");
        nombreingrepeli[posicion] = entrada4.nextLine();
        System.out.print("\nIngrese el anio de la pelicula: ");
        anioingrepeli[posicion] = entrada.nextInt();
    }

    //MOSTRAR PELICULAS 
    public void DatoRomantica(int[] id, String[] nombres, int[] anio){
        System.out.println("");
        System.out.println("Peliculas Ingresadas");
        for( int i =0; i< 5;i++){
             if (nombreingrepeli[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---anio: "+anio[i]+"\n");
            }
           
        }
    }

    public void ingresarMiedo(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreingrepeli[5-1] == null && op == 2){
            System.out.print("\n Ingrese el ID de la pelicula: ");
            idAuxiliar = entrada.nextInt();
            
            if (Canjear(idAuxiliar,idingrepeli)) {
                for (int i = 0; i < 5; i++) {
                    if (nombreingrepeli[i] == null ) {
                        idingrepeli[i] = idAuxiliar;
                    ingresarDatosPelis4(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otra pelicula");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada5 = new Scanner(System.in);
    public void ingresarDatosPelis4 (int posicion){
        System.out.print("\nIngrese el nombre de la pelicula: ");
        nombreingrepeli[posicion] = entrada5.nextLine();
        System.out.print("\nIngrese el anio de la pelicula: ");
        anioingrepeli[posicion] = entrada.nextInt();
    }

    //MOSTRAR PELICULAS 
    public void DatoMiedo(int[] id, String[] nombres, int[] anio){
        System.out.println("");
        System.out.println("Peliculas Ingresadas");
        for( int i =0; i< 5;i++){
             if (nombreingrepeli[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---anio: "+anio[i]+"\n");
            }
           
        }
    }

    public void ingresarInfantil(){
        int op = 2;
        int idAuxiliar;
        
        while(nombreingrepeli[5-1] == null && op == 2){
            System.out.print("\n Ingrese el ID de la pelicula: ");
            idAuxiliar = entrada.nextInt();
            
            if (Canjear(idAuxiliar,idingrepeli)) {
                for (int i = 0; i < 5; i++) {
                    if (nombreingrepeli[i] == null ) {
                        idingrepeli[i] = idAuxiliar;
                    ingresarDatosPelis5(i);
                    break;
                    }
                }
                
            }else {
                System.out.println("Error ya existe ID");
            
            }
           
            System.out.println("\n1.-Regresar al menu principal");
            System.out.println("2.-Agregar otra pelicula");
            System.out.println("Elija una opción:  ");
            op = entrada.nextInt();
            
        }
  
    }
    
    Scanner entrada6 = new Scanner(System.in);
    public void ingresarDatosPelis5 (int posicion){
        System.out.print("\nIngrese el nombre de la pelicula: ");
        nombreingrepeli[posicion] = entrada6.nextLine();
        System.out.print("\nIngrese el anio de la pelicula: ");
        anioingrepeli[posicion] = entrada.nextInt();
    }

    //MOSTRAR PELICULAS 
    public void DatoInfantil(int[] id, String[] nombres, int[] anio){
        System.out.println("");
        System.out.println("Peliculas Ingresadas");
        for( int i =0; i< 5;i++){
             if (nombreingrepeli[i] != null) {
                 System.out.println("Id: "+id[i]+" ---Nombre: "+nombres[i]+" ---anio: "+anio[i]+"\n");
            }
           
        }
    }







    // EL PROGRAMA TERMINA AQUI
}




