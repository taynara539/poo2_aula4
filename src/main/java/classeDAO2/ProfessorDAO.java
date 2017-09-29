package classeDAO2;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import classeModelo.Professor;;

@Repository
@Transactional
public class ProfessorDAO extends GenericDAO<Professor>{

}
