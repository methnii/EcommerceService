package edu.icet.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String name;
    private String address;
    private Double salary;

}

