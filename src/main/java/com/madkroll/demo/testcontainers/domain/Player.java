package com.madkroll.demo.testcontainers.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLAYER_ID_GEN")
    @SequenceGenerator(sequenceName = "player_id_generator", allocationSize = 1, name = "PLAYER_ID_GEN")
    Long id;

    String name;

    @Column(name = "CREATED_DATE")
    Date date;

}
