package Set.OrdenaçãoemSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;
    public GerenciadorAlunos(){
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula){
        Aluno removeALuno = null;
        for(Aluno a : alunoSet){
            if(a.getMatricula().equals(matricula)){
                removeALuno = a;
            }
        }
        alunoSet.remove(removeALuno);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        System.out.println(alunosPorNota);
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos GerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        GerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        GerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        GerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        GerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(GerenciadorAlunos.alunoSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        GerenciadorAlunos.removerAlunoPorMatricula(000L);
        GerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(GerenciadorAlunos.alunoSet);

        // Exibindo alunos ordenados por nome
        GerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        GerenciadorAlunos.exibirAlunosPorNota();
    }
}
