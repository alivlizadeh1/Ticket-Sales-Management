package com.tsm.entity;

import lombok.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class Hotel {
    @Id
    private long id;

    private String name;

    private float star;

    private String address;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Room> rooms;
}
