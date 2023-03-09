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
public class Offers_Credit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_offer;
    @Enumerated(EnumType.STRING)
    private Type_of_credit credit;
    private Integer amount;
    private String interest;
    private Date date_creation;
    @OneToMany(mappedBy ="offers_credit" )
    private List<Request> requests;

}
