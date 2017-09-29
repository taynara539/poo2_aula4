package classeAdicionareBuscar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classeModelo.Aluno;
import classeModelo.Disciplina;
import classeModelo.Professor;

@Component
public class Adicionando {

	@Autowired
	private Adicionar adicionando;
	

	public Aluno adicionarDisciplinaEmAluno(String cpfAluno, String nomeDisciplina, List<Aluno> alunos,
			List<Disciplina> disciplinas) {

		return adicionando.adicionarDisciplinaEmAluno(cpfAluno, nomeDisciplina, alunos, disciplinas);

	}


	
	public Disciplina adicionarProfessorEmDisciplina(String cpfProfessor, String nomeDisciplina,
			List<Disciplina> disciplinas, List<Professor> professores) {

		return adicionando.adicionarProfessorEmDisciplina(cpfProfessor, nomeDisciplina, disciplinas, professores);
	}

	
}
