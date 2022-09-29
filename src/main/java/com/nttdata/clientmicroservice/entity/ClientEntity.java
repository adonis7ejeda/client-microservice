package com.nttdata.clientmicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientEntity {
    private String name;
    private String middle_name;
    private String fist_surname;
    private String second_surname;
    private String phone;
    private String address;
    private String city;
}
