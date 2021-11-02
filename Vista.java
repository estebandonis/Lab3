/**
 * Nos ayuda a interacutar con el usuario
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Scanner scan = new Scanner(System.in);

    /**
     * Le da la bienvenida al usuario
     */
    public void bienvenida(){
        System.out.println("Ya estas de regreso!?, Bienvenido!");
    }

    /**
     * Despliega el menu
     * @return
     */
    public int menu(){
        System.out.println("Elija una opción:");
		System.out.println("1. Publicar Post");//Le damos todas las opciones disponibles
		System.out.println("2. Ver los post publicados en una fecha en particular");
		System.out.println("3. Ver los post que tienen un hastag en comun");
        System.out.println("4. Salir/n/n");
        boolean paso = false;
        int option = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                option = Integer.parseInt(optionString);//Lo cambiamos a int
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        return option;//regresamos el valor convertido
    }

    /**
     * Le pide el usuario que diga que tipo de post quiere publicar
     * @return
     */
    public String tipoPost(){
        System.out.println("¿Que tipo de post va a realizar?");
        System.out.println("1. Texto");
        System.out.println("2. Multimedia");
        System.out.println("3. Emoticon");
        boolean paso = false;
        int option = 0;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                option = Integer.parseInt(optionString);//Lo cambiamos a int
                if(option > 0 && option < 4){
                    paso = true;
                }
                else{
                    System.out.println("Ingrese un numero dentro del rango");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }

        if (option == 1){
            return "Texto";
        }

        else if (option == 2){
            System.out.println("¿Que tipo de post multimedia va a realizar?");
            System.out.println("1. Imagen");
            System.out.println("2. Audio");
            System.out.println("3. Video");
            paso = false;
            option = 0;
            while (paso == false){//Aplicamos un metodo para que escriba el 
                try {
                    String optionString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                    option = Integer.parseInt(optionString);//Lo cambiamos a int
                    if(option > 0 && option < 4){
                        paso = true;
                    }
                    else{
                        System.out.println("Ingrese un numero dentro del rango");
                    }
                } catch (Exception e) {
                    System.out.println("Ingrese un valor correcto, por favor");
                }
            }
            if (option == 1){
                return "Imagen";
            }
            else if (option == 2){
                return "Audio";
            }
            else if (option == 3){
                return "Video";
            }
        }
        else if (option == 3){
            return "Emoticon";
        }
        return "nada";
    }
    
    /**
     * Nos sirve para crear un post de texto
     * @return
     */
    public String[] crearPostTexto(){
        String[] datos = new String[3];
        
        System.out.println("Escriba su nombre");
        datos[0] = scan.nextLine();
        System.out.println("Escriba los hashtags");
        datos[1] = scan.nextLine();
        System.out.println("Escriba el texto a publicar (Debe ser menor de 20 caracteres)");
        boolean paso = false;
        while (paso == false){
            String text = scan.nextLine();
            if (text.length() < 20){
               datos[2] = text;
               paso = true;
            }
            else{
                System.out.println("El texto debe ser menor a 20 caracteres");
            }
        }

        return datos;
    }

    /**
     * Nos sirve para crear un post de imagen
     * @return
     */
    public String[] crearPostImagen(){
        String[] datos = new String[6];
        
        System.out.println("Escriba su nombre");
        datos[0] = scan.nextLine();
        System.out.println("Escriba los hashtags");
        datos[1] = scan.nextLine();
        System.out.println("Escriba la url");
        datos[2] = scan.nextLine();
        System.out.println("Escriba su peso en kilobytes");
        boolean paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[3] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        System.out.println("Escriba el formato");
        datos[4] = scan.nextLine();        
        System.out.println("Escriba la resolucion de la imagen");
        paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[5] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        
        return datos;
    }

    /**
     * Nos sirve para crear un post de audio
     * @return
     */
    public String[] crearPostAudio(){
        String[] datos = new String[6];
        
        System.out.println("Escriba su nombre");
        datos[0] = scan.nextLine();
        System.out.println("Escriba los hashtags");
        datos[1] = scan.nextLine();
        System.out.println("Escriba la url");
        datos[2] = scan.nextLine();
        System.out.println("Escriba su peso en kilobytes");
        boolean paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[3] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        System.out.println("Escriba el sample rate");
        paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[4] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        System.out.println("Escriba el bit depth del audio");
        paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[5] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        
        return datos;
    }

    /**
     * Nos sirve para crear un post de video
     * @return
     */
    public String[] crearPostVideo(){
        String[] datos = new String[5];
        
        System.out.println("Escriba su nombre");
        datos[0] = scan.nextLine();
        System.out.println("Escriba los hashtags");
        datos[1] = scan.nextLine();
        System.out.println("Escriba la url");
        datos[2] = scan.nextLine();
        System.out.println("Escriba su peso en kilobytes");
        boolean paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[3] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        System.out.println("Escriba el frame rate");
        paso = false;
        while (paso == false){//Aplicamos un metodo para que escriba el 
            try {
                String datoString = scan.nextLine();//Recibimos el valor como String para evitar un bug con el metodo nextLine()
                int dato = Integer.parseInt(datoString);//Lo cambiamos a int
                datos[4] = datoString;
                paso = true;
            } catch (Exception e) {
                System.out.println("Ingrese un valor correcto, por favor");
            }
        }
        
        return datos;
    }

    /**
     * Nos sirve para crear un post de emoticon
     */
    public String[] crearPostEmoticon(){
        String[] datos = new String[3];
        
        System.out.println("Escriba su nombre");
        datos[0] = scan.nextLine();
        System.out.println("Escriba los hashtags");
        datos[1] = scan.nextLine();
        System.out.println("Escriba el emoticon a publicar");
        datos[2] = scan.nextLine();

        return datos;
    }

    /**
     * Nos muestra los posts publicados
     * @param posts
     */
    public void mostrarPosts(ArrayList<Post> posts){
        for (int i = 0; i < posts.size(); i++){
            Post post = posts.get(i);
            String tipo = post.getTipo();
            if (tipo.equalsIgnoreCase("texto")){
                Texto texto = (Texto) post;
                ArrayList<String> comentarios = texto.getComentarios();
                System.out.println("");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Numero Post: "+texto.getID()+"  "+texto.getAutor()+"."+texto.getFecha()+"."+texto.getHora()+" likes: "+texto.getLikes());
                System.out.println(texto.getHashtags());
                System.out.println("(texto) " + texto.getTexto());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
                System.out.println("");
                if (comentarios.size() > 0){
                    System.out.println("---> comentarios:");
                    for (int a = 0; a < comentarios.size(); a++){
                        System.out.println("("+a+") "+ comentarios.get(a));
                    }
                }
                System.out.println("");
            }
            else if (tipo.equalsIgnoreCase("imagen")){
                Imagen imagen = (Imagen) post;
                ArrayList<String> comentarios = imagen.getComentarios();
                System.out.println("");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Numero Post: "+imagen.getID()+"  "+imagen.getAutor()+"."+imagen.getFecha()+"."+imagen.getHora()+" likes: "+imagen.getLikes());
                System.out.println(imagen.getHashtags());
                System.out.println("(imagen) " + imagen.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
                System.out.println(imagen.getKilobytes()+" KB, "+imagen.getFormato()+ ", "+ imagen.getResolucion());

                if (comentarios.size() > 0){
                    System.out.println("---> comentarios:");
                    for (int a = 0; a < comentarios.size(); a++){
                        System.out.println("("+a+") "+ comentarios.get(a));
                    }
                }
                System.out.println("");
            }
            else if (tipo.equalsIgnoreCase("audio")){
                Audio audio = (Audio) post;
                ArrayList<String> comentarios = audio.getComentarios();
                System.out.println("");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Numero Post: "+audio.getID()+"  "+audio.getAutor()+"."+audio.getFecha()+"."+audio.getHora()+" likes: "+audio.getLikes());
                System.out.println(audio.getHashtags());
                System.out.println("(audio) " + audio.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
                System.out.println(audio.getKilobytes()+" KB, SampleRate: "+audio.getSampleRate()+ " kHz, BitDepth: "+ audio.getBitDepth());

                if (comentarios.size() > 0){
                    System.out.println("---> comentarios:");
                    for (int a = 0; a < comentarios.size(); a++){
                        System.out.println("("+a+") "+ comentarios.get(a));
                    }
                }
                System.out.println("");
            }
            else if (tipo.equalsIgnoreCase("video")){
                Video video = (Video) post;
                ArrayList<String> comentarios = video.getComentarios();
                System.out.println("");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Numero Post: "+video.getID()+"  "+video.getAutor()+"."+video.getFecha()+"."+video.getHora()+" likes: "+video.getLikes());
                System.out.println(video.getHashtags());
                System.out.println("(video) " + video.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
                System.out.println(video.getKilobytes()+" KB, FrameRate: "+video.getFrameRate()+ " fps");

                if (comentarios.size() > 0){
                    System.out.println("---> comentarios:");
                    for (int a = 0; a < comentarios.size(); a++){
                        System.out.println("("+a+") "+ comentarios.get(a));
                    }
                }
                System.out.println("");
            }
            else if (tipo.equalsIgnoreCase("emoticon")){
                Emoticon emoticon = (Emoticon) post;
                ArrayList<String> comentarios = emoticon.getComentarios();
                System.out.println("");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Numero Post: "+emoticon.getID()+"  "+emoticon.getAutor()+"."+emoticon.getFecha()+"."+emoticon.getHora()+" likes: "+emoticon.getLikes());
                System.out.println(emoticon.getHashtags());
                System.out.println("(emoticon) " + emoticon.getEmoticon());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
                System.out.println("");
                if (comentarios.size() > 0){
                    System.out.println("---> comentarios:");
                    for (int a = 0; a < comentarios.size(); a++){
                        System.out.println("("+a+") "+ comentarios.get(a));
                    }
                }
                System.out.println("");
            }
        }
    }

    /**
     * Nos ayuda a mostrar un post en especifico
     * @param post
     */
    public void mostrarPost(Post post){
        String tipo = post.getTipo();
        if (tipo.equalsIgnoreCase("texto")){
            Texto texto = (Texto) post;
            ArrayList<String> comentarios = texto.getComentarios();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero Post: "+texto.getID()+"  "+texto.getAutor()+"."+texto.getFecha()+"."+texto.getHora()+" likes: "+texto.getLikes());
            System.out.println(texto.getHashtags());
            System.out.println("(texto) " + texto.getTexto());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println("");
            if (comentarios.size() > 0){
                System.out.println("---> comentarios:");
                for (int a = 0; a < comentarios.size(); a++){
                    System.out.println("("+a+") "+ comentarios.get(a));
                }
            }
            System.out.println("");
        }
        else if (tipo.equalsIgnoreCase("imagen")){
            Imagen imagen = (Imagen) post;
            ArrayList<String> comentarios = imagen.getComentarios();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero Post: "+imagen.getID()+"  "+imagen.getAutor()+"."+imagen.getFecha()+"."+imagen.getHora()+" likes: "+imagen.getLikes());
            System.out.println(imagen.getHashtags());
            System.out.println("(imagen) " + imagen.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println(imagen.getKilobytes()+" KB, "+imagen.getFormato()+ ", "+ imagen.getResolucion());

            if (comentarios.size() > 0){
                System.out.println("---> comentarios:");
                for (int a = 0; a < comentarios.size(); a++){
                    System.out.println("("+a+") "+ comentarios.get(a));
                }
            }
            System.out.println("");
        }
        else if (tipo.equalsIgnoreCase("audio")){
            Audio audio = (Audio) post;
            ArrayList<String> comentarios = audio.getComentarios();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero Post: "+audio.getID()+"  "+audio.getAutor()+"."+audio.getFecha()+"."+audio.getHora()+" likes: "+audio.getLikes());
            System.out.println(audio.getHashtags());
            System.out.println("(audio) " + audio.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println(audio.getKilobytes()+" KB, SampleRate: "+audio.getSampleRate()+ " kHz, BitDepth: "+ audio.getBitDepth());

            if (comentarios.size() > 0){
                System.out.println("---> comentarios:");
                for (int a = 0; a < comentarios.size(); a++){
                    System.out.println("("+a+") "+ comentarios.get(a));
                }
            }
            System.out.println("");
        }
        else if (tipo.equalsIgnoreCase("video")){
            Video video = (Video) post;
            ArrayList<String> comentarios = video.getComentarios();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero Post: "+video.getID()+"  "+video.getAutor()+"."+video.getFecha()+"."+video.getHora()+" likes: "+video.getLikes());
            System.out.println(video.getHashtags());
            System.out.println("(video) " + video.getUrl());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println(video.getKilobytes()+" KB, FrameRate: "+video.getFrameRate()+ " fps");

            if (comentarios.size() > 0){
                System.out.println("---> comentarios:");
                for (int a = 0; a < comentarios.size(); a++){
                    System.out.println("("+a+") "+ comentarios.get(a));
                }
            }
            System.out.println("");
        }
        else if (tipo.equalsIgnoreCase("emoticon")){
            Emoticon emoticon = (Emoticon) post;
            ArrayList<String> comentarios = emoticon.getComentarios();
            System.out.println("");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Numero Post: "+emoticon.getID()+"  "+emoticon.getAutor()+"."+emoticon.getFecha()+"."+emoticon.getHora()+" likes: "+emoticon.getLikes());
            System.out.println(emoticon.getHashtags());
            System.out.println("(emoticon) " + emoticon.getEmoticon());//Vamos extrayendo los datos de la base de datos y los vamos imprimiendo conforme los vamos extrayendo
            System.out.println("");
            if (comentarios.size() > 0){
                System.out.println("---> comentarios:");
                for (int a = 0; a < comentarios.size(); a++){
                    System.out.println("("+a+") "+ comentarios.get(a));
                }
            }
            System.out.println("");
        }
    }

    /**
     * Obtenemos la fecha que se quiere buscar
     * @return
     */
    public LocalDate obtenerFecha(){
        int[] date = new int[3];
        System.out.println("Ingrese el dia a revisar");
        boolean paso = false;
        while(paso == false){
            try {
                String dia = scan.nextLine();
                int diaInt = Integer.parseInt(dia);
                paso = true;
                date[0] = diaInt;
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        System.out.println("Ingrese el mes a revisar");
        paso = false;
        while(paso == false){
            try {
                String mes = scan.nextLine();
                int mesInt = Integer.parseInt(mes);
                paso = true;
                date[1] = mesInt;
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        System.out.println("Ingrese el año a revisar");
        paso = false;
        while(paso == false){
            try {
                String year = scan.nextLine();
                int yearInt = Integer.parseInt(year);
                paso = true;
                date[2] = yearInt;
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        LocalDate fecha = LocalDate.of(date[2], date[1], date[0]);
        return fecha;
    }

    /**
     * Obtenemos el hashtag a buscar
     * @return
     */
    public String obtenerHashtags(){
        System.out.println("Escriba el hashtag que quiere buscar (Sin el '#')");
        String hashtag = scan.nextLine();
        return hashtag;
    }

    /**
     * Obtenemos que tipo de accion se quiere realizar con el post escogido
     * @return
     */
    public int accion(){
        System.out.println("¿Que quiere hacer?");
        System.out.println("1. Comentar");//Le damos todas las opciones disponibles
		System.out.println("2. Dar Like");
		System.out.println("3. Reproducir");
        int num = 0;
        boolean paso = false;
        while(paso == false){
            try {
                String numString = scan.nextLine();
                num = Integer.parseInt(numString);
                paso = true;
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        return num;
    }

    /**
     * Obtenemos el comentario que se quiere realizar
     * @return
     */
    public String comentario(){
        System.out.println("Escriba el comentario");
        boolean paso = false;
        String comentario = "";
        while(paso == false){
            try {
                comentario = scan.nextLine();
                if (comentario.length() < 20){
                    paso = true;
                }
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        return comentario;
    }

    /**
     * Nos ayuda a seleccionar el post a manipular
     * @return
     */
    public int seleccionPost(){
        System.out.println("¿Sobre que post quiere realizar la accion?");
        boolean paso = false;
        int num = 0;
        while(paso == false){
            try {
                String numString = scan.nextLine();
                num = Integer.parseInt(numString);
                paso = true;
            } catch (Exception e) {
                System.out.println("Escriba un numero");
            }
        }
        return num;
    }
}