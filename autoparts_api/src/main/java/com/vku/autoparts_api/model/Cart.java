package com.vku.autoparts_api.model;

import com.vku.autoparts_api.util.DateTimeUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CartStatus status = CartStatus.ACTIVE;

    @Column(name = "created_at")
    private String createdAt;
//    DateTimeUtil.getFormattedDateTime();
    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne( fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "cart", orphanRemoval = true,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> itemList = new ArrayList<>();

    public enum CartStatus{
        ACTIVE, SUBMITTED,
    }
}
