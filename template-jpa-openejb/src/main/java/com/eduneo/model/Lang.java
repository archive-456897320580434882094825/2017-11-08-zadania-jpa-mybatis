package com.eduneo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Michał Kordulewski
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "lang")
public class Lang implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "code", unique = true)
    private String code;

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "name", unique = true)
    private String name;

}
