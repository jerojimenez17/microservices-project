package com.clientes.spring.entities;


import lombok.EqualsAndHashCode;
        import lombok.Getter;
        import lombok.Setter;
        import lombok.ToString;
        import javax.persistence.*;


@Entity
@Table(name ="suppliers")
@ToString
@EqualsAndHashCode

@Getter
@Setter
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String web;
    private String contact;
}