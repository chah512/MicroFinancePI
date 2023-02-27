package com.example.pidev_finance.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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
    @Enumerated
    private Type_of_credit credit;
    private Integer amount;
    private String interest;
    private Date date_creation;

}
