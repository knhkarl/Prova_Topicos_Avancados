package com.univas.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.univas.ENTITIES.Auditing;

public class AuditingDAO {
	
	@Autowired
	private EntityManager em;

	public void save(Auditing auditing) {
		em.getTransaction().begin();
		em.persist(auditing);
		em.getTransaction().commit();
	}

	public void update(Auditing auditing) {
		em.getTransaction().begin();
		em.merge(auditing);
		em.getTransaction().commit();
	}

	public List<Auditing> listAll() {
		return em.createQuery("select * from auditing s order by s.identifier", Auditing.class).getResultList();
	}

	public Auditing findById(int identifier) {
		return em.find(Auditing.class, identifier);
	}

}
