package classePrincipal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import classeAdicionareBuscar.*;
import classeDAO2.*;
import classeModelo.*;

@ComponentScan(basePackages = {"classeDAO2", "classeModelo", "classePrincipal"}) 
public class Principal {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Principal.class);

		ProfessorDAO professorDAO = context.getBean(ProfessorDAO.class);
		MatriculaDAO matriculaDAO = context.getBean(MatriculaDAO.class);
		DisciplinaDAO disciplinaDAO = context.getBean(DisciplinaDAO.class);
		BuscandoAdicionando adicionar = new BuscandoAdicionando();
		AlunoDAO alunnnnn = context.getBean(AlunoDAO.class);

		Professor professor;
		Aluno aluno;
		Matricula matricula;
		Disciplina disciplina;

		// Criar 5 alunos

		aluno = new Aluno();
		aluno.setAtivo(true);
		aluno.setCpf("789456");
		aluno.setDataInicio(new Date());
		aluno.setNome("Taynara");
		matricula = new Matricula();
		matricula.setDisciplinas(new ArrayList<>());
		matriculaDAO.create(matricula);
		aluno.setMatricula(matricula);
		alunnnnn.create(aluno);

		aluno = new Aluno();
		aluno.setAtivo(true);
		aluno.setCpf("6");
		aluno.setCpf("456123");
		aluno.setDataInicio(new Date());
		aluno.setNome("Ruan");
		matricula = new Matricula();
		matricula.setDisciplinas(new ArrayList<>());
		matriculaDAO.create(matricula);
		aluno.setMatricula(matricula);
		alunnnnn.create(aluno);

		aluno = new Aluno();
		aluno.setAtivo(true);
		aluno.setCpf("123789");
		aluno.setDataInicio(new Date());
		aluno.setNome("Lourdes");
		matricula = new Matricula();
		matricula.setDisciplinas(new ArrayList<>());
		matriculaDAO.create(matricula);
		aluno.setMatricula(matricula);
		alunnnnn.create(aluno);

		aluno = new Aluno();
		aluno.setAtivo(true);
		aluno.setCpf("457849");
		aluno.setDataInicio(new Date());
		aluno.setNome("Shirley");
		matricula = new Matricula();
		matricula.setDisciplinas(new ArrayList<>());
		matriculaDAO.create(matricula);
		aluno.setMatricula(matricula);
		alunnnnn.create(aluno);

		aluno = new Aluno();
		aluno.setAtivo(true);
		aluno.setCpf("741258");
		aluno.setDataInicio(new Date());
		aluno.setNome("Valteir");
		matricula = new Matricula();
		matricula.setDisciplinas(new ArrayList<>());
		matriculaDAO.create(matricula);
		aluno.setMatricula(matricula);
		alunnnnn.create(aluno);

		// Criar 3 professores

		professor = new Professor();
		professor.setNome("Marcus");
		professor.setIdade(30);
		professor.setCpf("965872");
		professorDAO.create(professor);

		professor = new Professor();
		professor.setNome("Luiz");
		professor.setIdade(56);
		professor.setCpf("968555");
		professorDAO.create(professor);

		professor = new Professor();
		professor.setNome("Carlos");
		professor.setIdade(44);
		professor.setCpf("789441");
		professorDAO.create(professor);

                
                //teste
		// Criar 4 Disciplinas

		disciplina = new Disciplina();
		disciplina.setNomeDisciplina("Português");
		disciplina.setDataInicio(new Date());
		disciplina.setPeriodo(6);
		disciplinaDAO.create(disciplina);

		disciplina = new Disciplina();
		disciplina.setNomeDisciplina("Matemática");
		disciplina.setDataInicio(new Date());
		disciplina.setPeriodo(6);
		disciplinaDAO.create(disciplina);

		disciplina = new Disciplina();
		disciplina.setNomeDisciplina("Geografia");
		disciplina.setDataInicio(new Date());
		disciplina.setPeriodo(5);
		disciplinaDAO.create(disciplina);

		disciplina = new Disciplina();
		disciplina.setNomeDisciplina("História");
		disciplina.setDataInicio(new Date());
		disciplina.setPeriodo(4);
		disciplinaDAO.create(disciplina);

		// Adicionar Professor em Disciplina

		/*List<Disciplina> disciplinas = disciplinaDAO.todos(Disciplina.class);
		List<Professor> professores = professorDAO.todos(Professor.class);
		List<Aluno> alunos = alunnnnn.getAll();

		disciplinaDAO.update(adicionar.adicionarProfessorEmDisciplina("965872", "Português", disciplinas, professores));

		disciplinaDAO.update(adicionar.adicionarProfessorEmDisciplina("789441", "Geografia", disciplinas, professores));

		disciplinaDAO
				.update(adicionar.adicionarProfessorEmDisciplina("968555", "Matemática", disciplinas, professores));

		disciplinaDAO.update(adicionar.adicionarProfessorEmDisciplina("789441", "História", disciplinas, professores));

		// Adicionando Disciplina em Matricula
		Aluno aux;

		aux = new Aluno();
		adicionar.adicionarDisciplinaEmAluno("789456", "Português", alunos, disciplinas);
		aux = adicionar.adicionarDisciplinaEmAluno("789456", "Matemática", alunos, disciplinas);
		matriculaDAO.update(aux.getMatricula());

		aux = new Aluno();
		adicionar.adicionarDisciplinaEmAluno("456123", "Matemática", alunos, disciplinas);
		aux = adicionar.adicionarDisciplinaEmAluno("456123", "Geografia", alunos, disciplinas);
		matriculaDAO.update(aux.getMatricula());

		aux = new Aluno();
		adicionar.adicionarDisciplinaEmAluno("123789", "História", alunos, disciplinas);
		aux = adicionar.adicionarDisciplinaEmAluno("123789", "Matemática", alunos, disciplinas);
		matriculaDAO.update(aux.getMatricula());

		aux = new Aluno();
		adicionar.adicionarDisciplinaEmAluno("457849", "Geografia", alunos, disciplinas);
		aux = adicionar.adicionarDisciplinaEmAluno("457849", "Matemática", alunos, disciplinas);
		matriculaDAO.update(aux.getMatricula());

		aux = new Aluno();
		adicionar.adicionarDisciplinaEmAluno("741258", "Matemática", alunos, disciplinas);
		aux = adicionar.adicionarDisciplinaEmAluno("741258", "História", alunos, disciplinas);
		matriculaDAO.update(aux.getMatricula());
*/
		context.close();

		System.out.println("khkshkds");

	}

}