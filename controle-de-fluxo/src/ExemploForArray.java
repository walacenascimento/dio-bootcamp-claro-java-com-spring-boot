 // ExemploForArray.java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
/* 
        for (int i=0; i <alunos.length; i++) {
            System.out.println("O aluno no indice x=" + i + " é " + alunos[i]);
        }
*/            

        /* Exemplo com FOR EACH*/
        for (String aluno : alunos) {
            System.out.println("Os alunos da turma são: " + aluno);
        }
    
    }
}
