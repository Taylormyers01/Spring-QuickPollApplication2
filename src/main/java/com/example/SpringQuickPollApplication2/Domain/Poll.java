package com.example.SpringQuickPollApplication2.Domain;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POLL_ID")
    private Long id;
    @Column(name = "QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "POLL_ID")
    @OrderBy
    private Set<Option> options;

}
