package com.tsm.entity;

import lombok.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "city_sequence_generator")
    @SequenceGenerator(name = "city_sequence_generator" , initialValue = 100)
    private long id;

    @Column(name = "country_name", unique = true, updatable = false)
    private String countryName;

    @Column(name = "city_name", unique = true, updatable = false)
    private String cityName;

    @OneToMany(mappedBy = "city")
    private Set<Hotel> hotels;
}
