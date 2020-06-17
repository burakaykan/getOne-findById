package me.burakaykan.getOnefindById.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1772117159185494620L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToOne
    private Department department;

}
