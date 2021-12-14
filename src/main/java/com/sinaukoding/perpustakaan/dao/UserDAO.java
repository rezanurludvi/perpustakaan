package com.sinaukoding.perpustakaan.dao;

import com.sinaukoding.perpustakaan.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserDAO extends BaseDAO<User> {
    @Override
    public List<Predicate> predicates(User param, CriteriaBuilder builder, Root<User> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
