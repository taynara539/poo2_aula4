package classeDAO2;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GenericDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void create(T objeto) {
		getSession().persist(objeto);
		return;
	}

	public void delete(T objeto) {
		if (getSession().contains(objeto))
			getSession().delete(objeto);
		else
			getSession().delete(getSession().merge(objeto));
		return;
	}

	public T getById(Class<T> cls, long id) {
		return getSession().load(cls, id);
	}

	public void update(T objeto) {
		getSession().merge(objeto);
		return;
	}

	@SuppressWarnings("unchecked")
	public List<T> todos(Class<T> cls) {
		return getSession().createQuery("from " + cls.getName()).list();
	}

}
