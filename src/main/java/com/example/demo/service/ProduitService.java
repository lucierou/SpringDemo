package com.example.demo.service;

import com.example.demo.entity.Produit;
import com.example.demo.interfaces.IDAO;
import com.example.demo.tools.ServiceHibernate;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ProduitService implements IDAO<Produit> {

    // @Autowired
    private ServiceHibernate serviceHibernate;

    private Session session;

    public ProduitService(ServiceHibernate serviceHibernate) {
        this.serviceHibernate = serviceHibernate;
        session = this.serviceHibernate.getSession();
    }

    @Override
    public boolean create(Produit o) {
        session.beginTransaction();
        session.persist(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Produit o) {
        session.beginTransaction();
        session.persist(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Produit o) {
        session.beginTransaction();
        session.remove(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Produit findById(int id) {
        session.beginTransaction();
        Produit produit = session.get(Produit.class, id);
        session.getTransaction().commit();
        return produit;
    }

    @Override
    public List<Produit> findAll() {
        return Arrays.asList(
                new Produit(1, "Asus", "asusRef", new Date(), 25.50, 1),
                new Produit(2, "HP", "hpRef", new Date(), 50.25, 2)
        );
    }


}
