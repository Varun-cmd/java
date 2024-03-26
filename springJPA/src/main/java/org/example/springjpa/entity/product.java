package org.example.springjpa.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(
        name="Product",
        schema="test",
        uniqueConstraints =
        @UniqueConstraint(
                name = "productName",
                columnNames="productName"
        )

)
public class product {

    @Id     // from javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pId;
    @Column(nullable = false)
    String productName;
    @Column(nullable = false)
    double price;
    @Column(nullable = false)
    Boolean stock;

    @CreationTimestamp
    private LocalDateTime created;
    @UpdateTimestamp
    private LocalDateTime updated;


}
