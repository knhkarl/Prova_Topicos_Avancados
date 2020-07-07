package com.univas.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univas.ENTITIES.Delivery;

@Repository
public class DeliveryDAO {
	
	@Autowired
	private EntityManager em;

	public void save(Delivery delivery) {
		em.getTransaction().begin();
		em.persist(delivery);
		em.getTransaction().commit();
	}

	public void update(Delivery delivery) {
		em.getTransaction().begin();
		em.merge(delivery);
		em.getTransaction().commit();
	}

	public List<Delivery> listAll() {
		return em.createQuery("select * from delivery d order by d.ordercode", Delivery.class).getResultList();
	}

	public Delivery findById(float ordercode) {
		return em.find(Delivery.class, ordercode);
	}

	public void remove(float ordercode) {
		em.getTransaction().begin();
		Delivery deliveryToRemove = findById(ordercode);
		if (deliveryToRemove != null) {
			em.remove(deliveryToRemove);
		}
		em.getTransaction().commit();
	}

}
