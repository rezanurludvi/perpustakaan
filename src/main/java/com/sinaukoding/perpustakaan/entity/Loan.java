package com.sinaukoding.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loan")
@Setter
@Getter
@NoArgsConstructor
public class Loan extends BaseEntity<Loan>{

    private static final long serialVersionUID = 7828181831849857943L;

    public enum StatusLoan{
        BORROWED,
        RETURNED
    }

    @Column(name = "type_identity")
    private String type_identity;

    @Column(name = "number_identity")
    private String number_identity;

    @Column(name = "duration")
    private String duration;

    @Column(name = "loan_date")
    @Temporal(TemporalType.DATE)
    private Date loanDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date return_date;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusLoan status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_id")
    private User user;
}
