package com.example.demojpapostgres;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class SampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

}
