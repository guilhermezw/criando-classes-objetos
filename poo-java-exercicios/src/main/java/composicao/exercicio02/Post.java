package composicao.exercicio02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime data;
    private String titulo;
    private String conteudo;
    private int like;
    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime data, String titulo, String conteudo, int like) {
        this.data = data;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return "Post [" +
                "Data =  " + data +
                ", Titulo = " + titulo + '\'' +
                ", Conteudo = " + conteudo + '\'' +
                ", Like =  " + like +
                ", Comentarios =  " + comentarios +
                ']';
    }
}
