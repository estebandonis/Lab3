/**
* Es donde se ejecuta todo el programa
* @author: Esteban Donis
* @version: 1.00
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class Controlador {
    /**
     * El donde el programa principal sucede
     * @param args
     */
    public static void main(String[] args) {
        Sistema sistem = new Sistema();
        Vista vista = new Vista();
        int opcion = 0;

        vista.bienvenida();
        while (opcion != 4){
            vista.mostrarPosts(sistem.getPosts());
            opcion = vista.menu();
            if (opcion == 1){
                String tipo = vista.tipoPost();
                if (tipo.equalsIgnoreCase("Texto")){
                    sistem.crearPostTexto(vista.crearPostTexto());
                }
                else if (tipo.equalsIgnoreCase("Imagen")){
                    sistem.crearPostImagen(vista.crearPostImagen());
                }
                else if (tipo.equalsIgnoreCase("Audio")){
                    sistem.crearPostAudio(vista.crearPostAudio());
                }
                else if (tipo.equalsIgnoreCase("Video")){
                    sistem.crearPostVideo(vista.crearPostVideo());
                }
                else if (tipo.equalsIgnoreCase("Emoticon")){
                    sistem.crearPostEmoticon(vista.crearPostEmoticon());
                }
            }
            else if (opcion == 2){
                LocalDate fechaDeseada = vista.obtenerFecha();
                ArrayList<Post> posts = sistem.getPosts();
                int numero = 0;
                for (int i = 0; i < posts.size(); i++){
                    Post post = posts.get(i);
                    if (fechaDeseada.equals(post.getFecha())){
                        vista.mostrarPost(post);
                        numero += 1;
                    }
                }
                if (numero > 0){
                    int num = vista.accion();
                    int num2 = vista.seleccionPost();
                    if (num == 1){
                        sistem.agregarComentario(num2, vista.comentario());
                    }
                    else if (num == 2){
                        sistem.agregarLike(num2);
                    }
                    else if (num == 3){
                        sistem.accion(num2);
                    }
                }
                else {
                    System.out.println("");
                    System.out.println("No se encontraron ningun post en esa fecha en particular");
                }
                
            }
            else if (opcion == 3){
                String hashtag = vista.obtenerHashtags();
                ArrayList<Post> posts = sistem.getPosts();
                int numero = 0;
                for (int i = 0; i < posts.size(); i++){
                    Post post = posts.get(i);
                    String hash = post.getHashtags();
                    String[] hashes = hash.split("#");
                    for (int a = 0; a < hashes.length; a++){
                        hash = hashes[a];
                        if (hashtag.equalsIgnoreCase(hash)){
                            vista.mostrarPost(post);
                            numero += 1;
                        }
                    }
                }
                if (numero > 0){
                    int num = vista.accion();
                    int num2 = vista.seleccionPost();
                    if (num == 1){
                        sistem.agregarComentario(num2, vista.comentario());
                    }   
                    else if (num == 2){
                        sistem.agregarLike(num2);
                    }
                    else if (num == 3){
                        sistem.accion(num2);
                    }
                }
                else{
                    System.out.println("");
                    System.out.println("No se encontro ningun post con ese hashtag en particular");
                }
                
            }
            else if (opcion == 4){
                System.exit(0);//Se sale del programa
            }
            else{
                System.out.println("Elija una opcion valida");
            }
        }
    }
}
