import entidades.Servidor;
import entidades.Usuario;
import entidades.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Usuario> usuariosCadastrados = new ArrayList<>();
        List<Mensagem> mensagensEnviadas = new ArrayList<>();

        Servidor servidor1 = new Servidor("Os Coringões",mensagensEnviadas,usuariosCadastrados);

        Usuario usuario1 = new Usuario("Igoorr",1010);
        usuariosCadastrados.add(usuario1);

        Mensagem mensagem1 = new Mensagem("Olá Galera! Como estão?", "Igoorr", "17:08:01");
        mensagensEnviadas.add(mensagem1);
        System.out.println(servidor1);

        List<Mensagem> filtroAutor = mensagensEnviadas.stream()
                .filter(m->m.getAutor().equals("Igoorr"))
                .toList();
        filtroAutor.forEach(System.out::println);
    }
}