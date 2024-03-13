package org.aelion.stocks.stock;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "community_id")
    private Long communityId;

    @Column(name = "product_id")
    private Long productId;

    private Integer quantity;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(name = "movement_type")
    private MovementType movementType;

    @Column(name = "movement_date")
    private LocalDateTime movementDate;

    public enum MovementType {
        ENTRY, EXIT
    }
}
