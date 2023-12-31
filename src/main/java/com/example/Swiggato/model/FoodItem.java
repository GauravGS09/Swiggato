package com.example.Swiggato.model;

import com.example.Swiggato.Enum.FoodCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.awt.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String dishName;

    double price;

    @Enumerated(EnumType.STRING)
    FoodCategory category;

    boolean veg;

    boolean available;
    @ManyToOne
    @JoinColumn
    Cart cart;

    @ManyToOne
    @JoinColumn
   OrderEntity order;

    @ManyToOne
    @JoinColumn
    Restaurant restaurant;
}
