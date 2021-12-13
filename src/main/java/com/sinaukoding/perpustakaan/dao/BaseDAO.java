package com.sinaukoding.perpustakaan.dao;

import com.sinaukoding.perpustakaan.entity.BaseEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

@SuppressWarnings({"uncheckec", "ConstantConditions"})
public abstract class BaseDAO<T extends BaseEntity<T>> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> type;

    {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T findOne(T param){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();

        CriteriaQuery<T> query = builder.createQuery(type);

        Root<T> root = query.from(type);

        query.orderBy(builder.asc(root.get("id")));
        return singleResult(query , predicates(param,builder, root, false));
    }
    public Collection<T> find(T param, int offset, int limit){

    }

    public List<Predicate> predicates(T param, CriteriaBuilder builder, Root<T> root, boolean isCount){
        return new ArrayList<>();
    }
    public <I> I singleResult(CriteriaQuery<I> query, List<Predicate> predicates){
        try {
            query.where(predicates.toArray(new Predicate[0]));

            return entityManager.createQuery(query).getSingleResult();
        }catch (NoResultException ignore) {

        }

        return null;
    }
    public List<T> listResult(CriteriaQuery<T> query, List<Predicate> predicates, int offset, int limit){
        query.where(predicates.toArray(new Predicate[0]));
        query.distinct(true);

        typeQuery<T> typeQuery = entityManager.createQuery(query);

        if(limit != Integer.MAX_VALUE){
            typeQuery.setMaxResults(limit);
        }
    }
}
