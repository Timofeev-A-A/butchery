package ru.timofeev.butchery.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "request")
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "client_name")
    private String client_name;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "delivery_date")
    private Date delivery_date;
}
