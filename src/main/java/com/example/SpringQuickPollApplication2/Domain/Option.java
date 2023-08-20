package com.example.SpringQuickPollApplication2.Domain;


import jakarta.persistence.*;

@Entity
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OPTION_ID")
    private Long id;
    @Column(name = "OPTION_VALUE")
    private String value;


    public Option(){}
    public Option(Long id) {
        this.id = id;
    }

    public Option(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
