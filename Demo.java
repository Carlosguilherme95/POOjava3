public class Demo {
    public static void main(String args[]){
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos Guilherme";
        aluno1.matricula = 123456L;
        aluno1.curso = "Engenharia de Software";
        aluno1.materiasCurso(aluno1.curso);
    }
}
