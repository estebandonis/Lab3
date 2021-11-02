/**
 * Es donde sucede la logica del programa
 */

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Post> Posts = new ArrayList<Post>();
    private int numPost = 1;

    /**
     * Se utiliza para crear y agregar los posts de texto a la lista de posts
     * @param datos
     */
    public void crearPostTexto(String[] datos){
        Texto post = new Texto(numPost, datos[0], datos[1], datos[2]);
        Posts.add(post);
        numPost += 1;
    }

    /**
     * Se utiliza para crear y agregar los posts de imagen a la lista de posts
     * @param datos
     */
    public void crearPostImagen(String[] datos){
        Imagen post = new Imagen(numPost, datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), datos[4], Integer.parseInt(datos[5]));
        Posts.add(post);
        numPost += 1;
    }

    /**
     * Se utiliza para crear y agregar los posts de audio a la lista de posts
     * @param datos
     */
    public void crearPostAudio(String[] datos){
        Audio post = new Audio(numPost, datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]), Integer.parseInt(datos[5]));
        Posts.add(post);
        numPost += 1;
    }

    /**
     * Se utiliza para crear y agregar los posts de video a la lista de posts
     * @param datos
     */
    public void crearPostVideo(String[] datos){
        Video post = new Video(numPost, datos[0], datos[1], datos[2], Integer.parseInt(datos[3]), Integer.parseInt(datos[4]));
        Posts.add(post);
        numPost += 1;
    }

    /**
     * Se utiliza para crear y agregar los posts de emoticon a la lista de posts
     * @param datos
     */
    public void crearPostEmoticon(String[] datos){
        Emoticon post = new Emoticon(numPost, datos[0], datos[1], datos[2]);
        Posts.add(post);
        numPost += 1;
    }

    /**
     * Nos ayuda para obtener la lista de posts hechos
     * @return
     */
    public ArrayList<Post> getPosts() {
        return Posts;
    }

    /**
     * Nos sirve para agregarle un comentario a un post en especifico
     * @param num
     * @param comentario
     */
    public void agregarComentario(int num, String comentario){
        for (int i = 0; i < Posts.size(); i++){
            Post post = Posts.get(i);
            if (post.getID() == num){
                post.agregarComentario(comentario);
                Posts.set(i, post);
            }
        }
    }

    /**
     * Nos sirve para agregarle un like a un post en especifico
     * @param num
     */
    public void agregarLike(int num){
        for (int i = 0; i < Posts.size(); i++){
            Post post = Posts.get(i);
            if (post.getID() == num){
                post.agregarLike();
                Posts.set(i, post);
            }
        }
    }

    /**
     * Nos sirve para reproducir un post en especifico
     * @param num
     */
    public void accion(int num){
        for (int i = 0; i < Posts.size(); i++){
            Post post = Posts.get(i);
            if (post.getID() == num){
                System.out.println(post);
            }
        }
    }
}
