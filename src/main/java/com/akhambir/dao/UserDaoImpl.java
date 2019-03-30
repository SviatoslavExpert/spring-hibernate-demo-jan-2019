package com.akhambir.dao;

import com.akhambir.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User getByUsername(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User as u inner join fetch u.roles as r where u.username =:username", User.class)
                .setParameter("username", username)
                .uniqueResult();
    }

    @Override
    public User addUser(User user) {
        Long id = (Long) sessionFactory.getCurrentSession().save(user);
        user.setId(id);
        return user;
    }

}
