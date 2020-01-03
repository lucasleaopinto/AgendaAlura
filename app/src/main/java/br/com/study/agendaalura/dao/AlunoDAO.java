package br.com.study.agendaalura.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.study.agendaalura.model.Aluno;

public class AlunoDAO {

    private final static List<Aluno> listaAlunos = new ArrayList<>();

    public void salva(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public List<Aluno> todos(){
        return new ArrayList<>(listaAlunos);
    }
}
