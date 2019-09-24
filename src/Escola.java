import java.util.ArrayList;

public class Escola {

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Escola(){
        alunos.add(new Aluno("Anderson", "ADS", 4 , "LTP IV", 1.6));
        alunos.add(new Aluno("João", "ADS", 4 , "LTP IV", 9.8));
        alunos.add(new Aluno("Joaquim", "ADS", 2 , "SO", 7.8));
        alunos.add(new Aluno("Maria", "ADS", 2 , "SO", 3.4));
        alunos.add(new Aluno("Anderson", "ADS", 4 , "SO", 5.4));
    }

    public Double calculaMediaCurso(String curso){
        int quantidade = 0;
        double nota = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).curso == curso) {
                nota = nota + alunos.get(i).avaliacao;
                quantidade = quantidade + 1;
            }
        }
        return  nota / quantidade;
    }

    public Double calculaMediaSerie(int serie){
        int quantidade = 0;
        double nota = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).serie == serie) {
                nota = nota + alunos.get(i).avaliacao;
                quantidade = quantidade + 1;
            }
        }
        return  nota / quantidade;
    }

    public Double calculaMediaAluno(String aluno){
        int quantidade = 0;
        double nota = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).nome == aluno) {
                nota = nota + alunos.get(i).avaliacao;
                quantidade = quantidade + 1;
            }
        }
        return  nota / quantidade;
    }

    public Double calculaMediaDisciplina(String disciplina){
        int quantidade = 0;
        double nota = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).disciplina == disciplina) {
                nota = nota + alunos.get(i).avaliacao;
                quantidade = quantidade + 1;
            }
        }
        return  nota / quantidade;
    }
}
