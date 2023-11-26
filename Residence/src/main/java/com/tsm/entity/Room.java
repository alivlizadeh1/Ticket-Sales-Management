package com.tsm.entity;

import lombok.*;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
public class Room {

    @Id
    private long id;

    private short number;

    private byte capacity;

    private double pricePerDay;

    private boolean isReserved;
}
