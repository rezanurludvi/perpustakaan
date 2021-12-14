package com.sinaukoding.perpustakaan.dao;

import com.sinaukoding.perpustakaan.entity.Loan;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class LoanDAO extends BaseDAO<Loan>{
    @Override
    public List<Predicate> predicates(Loan param, CriteriaBuilder builder, Root<Loan> root, boolean isCount) {
        List<Predicate> predicates = super.predicates(param, builder, root, isCount);

        return predicates;
    }
}
