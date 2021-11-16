import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDecricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dalthon = new Dev();
        dalthon.setNome("Dalthon");
        dalthon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dalthon.getConteudosEscritos());
        dalthon.progredir();
        dalthon.progredir();
        System.out.println("Conteúdos Concluídos: " + dalthon.getConteudosConcluidos());
        System.out.println("XP " + dalthon.calculaTotalXp());

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + joao.getConteudosEscritos());
        joao.progredir();
        System.out.println("Conteúdos Concluídos: " + joao.getConteudosConcluidos());
        System.out.println("XP " + joao.calculaTotalXp());
    }
}
