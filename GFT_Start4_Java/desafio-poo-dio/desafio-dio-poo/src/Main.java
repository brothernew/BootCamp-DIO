import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Programação JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria JS");
        mentoria2.setDescricao("JavaScript");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Desenvolvimento em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Thiago Pedrozo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscrito: "+dev1.getConteuodoInscrito());
        dev1.progredir();
        System.out.println("-------------------------------------------------");
        System.out.println("Conteúdo Inscrito - Thiago" + dev1.getConteuodoInscrito());
        System.out.println("Conteúdo Concluído - Thiago" + dev1.getConteuodoConcluido());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("============================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Rebeca Nívea");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo inscrito: "+dev2.getConteuodoInscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-------------------------------------------------");
        System.out.println("Conteúdo Inscrito - Rebeca" + dev2.getConteuodoInscrito());
        System.out.println("Conteúdo Concluído - Rebeca" + dev2.getConteuodoConcluido());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
