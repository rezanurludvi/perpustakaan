package com.sinaukoding.perpustakaan.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
@Setter
@Getter
@NoArgsConstructor
public class User extends BaseEntity<User> {

    private static final long serialVersionUID = -3460612085700139400L;

    public enum Role{
        ROLE_USER,
        ROLE_ADMIN
    }

    @Column(name = "role", columnDefinition = "VARCHAR(50)")
    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;

    @Column(name = "profile_name", columnDefinition = "VARCHAR(100)")
    private String profileName;

    @Column(name = "username", columnDefinition = "VARCHAR(50)", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "token")
    private String token;

}
