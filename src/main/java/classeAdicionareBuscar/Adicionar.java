package classeAdicionareBuscar;

import java.util.List;

import org.springframework.stereotype.Component;

import classeModelo.*;


public interface Adicionar {
	
	public Aluno adicionarDisciplinaEmAluno(String cpfAluno, String nomeDisciplina, List<Aluno> alunos,
			List<Disciplina> disciplinas);


	public Disciplina adicionarProfessorEmDisciplina(String cpfProfessor, String nomeDisciplina,
			List<Disciplina> disciplinas, List<Professor> professores);

	
}
