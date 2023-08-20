package com.example.SpringQuickPollApplication2.Domain;

import jakarta.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VOTE_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;
}
