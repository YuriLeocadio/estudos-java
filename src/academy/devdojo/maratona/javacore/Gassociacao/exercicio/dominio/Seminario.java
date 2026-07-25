package academy.devdojo.maratona.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] estudantes;
    private Local local;
    private Professor professor;


    public Seminario(String titulo, Professor professor, Aluno[] estudantes, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.estudantes = estudantes;
        this.local = local;
    }

    public Seminario(String titulo, Professor professor, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.local = local;
    }

    public void imprimir() {
        System.out.println("Seminário: " + this.titulo);
        if (professor != null) {
            System.out.println("Professor: " + professor.getNome());
        }
        if (estudantes != null) {
            for (int i = 0; i < estudantes.length; i++) {
                System.out.println("Estudante: " + estudantes[i].getNome());
            }
        }
        if (local != null) {
            System.out.println("Local: " + local.getEndereco());
        }
        System.out.println("-----------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Aluno[] estudantes) {
        this.estudantes = estudantes;
    }
}
