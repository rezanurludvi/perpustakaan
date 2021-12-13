package com.sinaukoding.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@Setter
@Getter
@NoArgsConstructor
public class Book extends BaseEntity<Book> {

    private static final long serialVersionUID = 1973078447685027472L;
    @Column(name = "title", columnDefinition = "VARCHAR(150)")
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "description")
    private String description;
}
