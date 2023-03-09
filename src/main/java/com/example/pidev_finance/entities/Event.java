package com.example.pidev_finance.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvent;
    private String nameEvent;
    private String descriptionEvent;
    private Date dateEvent;
    @Enumerated
    private TypeEvent type;
    @OneToMany(mappedBy ="event" )
    private List<ShareHolder> shareHolders;

}
