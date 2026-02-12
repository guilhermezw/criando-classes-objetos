package composicao.exercicio03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private Date dataNascimento;

    public Cliente() {
    }

    public Cliente(String nome, String email, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public static SimpleDateFormat getFormatador() {
        return formatador;
    }

    public static void setFormatador(SimpleDateFormat formatador) {
        Cliente.formatador = formatador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return nome + " (" + formatador.format(dataNascimento) + ") - " + email;
    }
}
