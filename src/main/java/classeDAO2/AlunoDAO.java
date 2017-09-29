package classeDAO2;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import classeModelo.*;

@Repository
@Transactional
public class AlunoDAO extends GenericDAO<Aluno> {

	/*@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}*/

	@SuppressWarnings("unchecked")
	public List<Aluno> getAll() {
		return super.getSession().createQuery("from Aluno a "+
	                                    "left join fetch a.matricula mt "+
				                        "left join fetch mt.disciplinas disc" ).list();
	}

}