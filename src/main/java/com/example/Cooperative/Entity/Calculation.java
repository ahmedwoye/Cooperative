package com.example.Cooperative.Entity;

import com.example.Cooperative.Enum.OperationType;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "calculation")
public class Calculation {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private int number1;
    @Setter
    private int number2;
    @Setter
    private int result;

    @Setter
    @Enumerated(EnumType.STRING)
    private OperationType operationType;

}

