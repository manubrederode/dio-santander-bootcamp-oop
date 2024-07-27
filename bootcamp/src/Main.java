import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("descrição bootcamp Java");
        bootcamp.getAtividades().add(curso1);
        bootcamp.getAtividades().add(curso2);
        bootcamp.getAtividades().add(mentoria1);

        Dev devClara = new Dev();
        devClara.setNome("Clara");
        devClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Clara:" + devClara.getAtividadesInscritas());
        devClara.progredir();
        devClara.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Clara:" + devClara.getAtividadesInscritas());
        System.out.println("Conteúdos Concluidos Clara:" + devClara.getAtividadesConcluidas());
        System.out.println("XP:" + devClara.calcularTotalXP());

        System.out.println("------------");

        Dev devLeonor = new Dev();
        devLeonor.setNome("Leonor");
        devLeonor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leonor:" + devLeonor.getAtividadesInscritas());
        devLeonor.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Leonor:" + devLeonor.getAtividadesInscritas());
        System.out.println("Conteúdos Concluidos Leonor:" + devClara.getAtividadesConcluidas());
        System.out.println("XP:" + devLeonor.calcularTotalXP());

    }
}