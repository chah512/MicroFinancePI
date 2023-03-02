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
public class Request implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_request;
    private Date request_date;
    private Integer rising;
    private String statut;
    private String description;
    private String gender;
    @ManyToOne
    private Offers_Credit offers_credit;


}
