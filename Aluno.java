import java.util.Scanner;

public class Aluno {
    String nome;
    Long matricula;
    String curso;
    Float nota1;
    Float nota2;

    void materiasCurso(String curso) {
        String addMateria = "S";
        while ("S".equals(addMateria)){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Você deseja adicionar uma matéria?");
            addMateria = scanner.nextLine();
            if("S".equals(addMateria)){
                System.out.println("Digite o nome da matéria:");
                String nomeMat = scanner.nextLine();
                System.out.println("Digite a nota 1");
                Float nota1 = Float.valueOf(scanner.nextLine());
                System.out.println("Digite a nota 2");
                Float nota2 = Float.valueOf(scanner.nextLine());
                System.out.println("Sua Matéria é "+ nomeMat);
                calcMedia(curso, nota1, nota2);
            }

        }

        }
    void calcMedia(String curso,Float nota1, Float nota2){
        Float media = (nota1 + nota2) / 2;
        System.out.println("Seu curso é "+ curso + "Sua média é:"+ media);
    }
}
/**
 * escreva uma classe para representar um aluno
 * crie atributos relacionados a esse aluno: nome, matrícula, nome do curso
 * e 3 disciplinas que esse aluno está matriculado no curso 
 */