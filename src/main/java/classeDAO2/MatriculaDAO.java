package classeDAO2;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import classeModelo.Matricula;

@Repository
@Transactional
public class MatriculaDAO extends GenericDAO<Matricula> {


}
