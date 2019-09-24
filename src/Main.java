public class Main {
    public static void main(String args[]){

        Escola unifeob = new Escola();

        System.out.println("-----------------------------------------------");
        System.out.println("\nMedia do curso ADS: " + unifeob.calculaMediaCurso("ADS"));
        System.out.println("\n-----------------------------------------------");
        System.out.println("\nMedia da série 4: " + unifeob.calculaMediaSerie(4));
        System.out.println("\n-----------------------------------------------");
        System.out.println("\nMedia do aluno Anderson: " + unifeob.calculaMediaAluno("Anderson"));
        System.out.println("\n-----------------------------------------------");
        System.out.println("\nMedia da disciplina SO: " + unifeob.calculaMediaDisciplina("SO"));

    }
}
