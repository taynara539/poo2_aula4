package classeAdicionareBuscar;

import java.util.*;

import org.springframework.stereotype.Component;

import classeModelo.*;


public class BuscandoAdicionando {
	
	

	// Para adicionar Disciplina em Aluno
	public Aluno adicionarDisciplinaEmAluno(String cpfAluno, String nomeDisciplina, List<Aluno> alunos,
			List<Disciplina> disciplinas) {
		Aluno aluno;
		Disciplina disciplina;

		for (Disciplina d : disciplinas) {
			if (d.getNomeDisciplina().equals(nomeDisciplina)) {
				disciplina = d;

				for (Aluno a : alunos) {
					if (a.getCpf().equals(cpfAluno)) {
						aluno = a;

						aluno.getMatricula().getDisciplinas().add(disciplina);
						return aluno;

					}

				}
				break;
			}
		}
		return aluno = new Aluno();
	}


	// Para adicionar Professor em Disciplina
	public Disciplina adicionarProfessorEmDisciplina(String cpfProfessor, String nomeDisciplina,
			List<Disciplina> disciplinas, List<Professor> professores) {
		Professor professor;
		Disciplina disciplina;

		for (Professor p : professores) {
			if (p.getCpf().equals(cpfProfessor)) {
				professor = p;

				for (Disciplina d : disciplinas) {
					if (d.getNomeDisciplina().equals(nomeDisciplina)) {
						disciplina = d;
						disciplina.setProfessor(professor);

						return disciplina;

					}
				}

				break;
			}

		}
		disciplina = new Disciplina();
		return disciplina;
	}

}
