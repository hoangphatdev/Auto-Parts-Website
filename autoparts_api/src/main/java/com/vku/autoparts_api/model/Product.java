package com.vku.autoparts_api.model;


import com.vku.autoparts_api.util.DateTimeUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;
    private int quantity;

    @Column(name = "discount_price")
    private BigDecimal discountPrice;

    private String description;

    private String brand;

    private String origin;

    @Column(name = "warranty_month")
    private int warrantyMonth;

    // khong them columnDefinition = "DATETIME(0), vi se hardcode cua mysql vao java, neu ta doi mysql -> sqlserver thi
    // mat cong doi code, chi nen format date time bang backend
    @Column(name = "created_at")
    private String createdAt = DateTimeUtil.getFormattedDateTime();
    @Column(name = "updated_at")
    private String updatedAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @OneToMany(mappedBy = "product", orphanRemoval = true, fetch = FetchType.LAZY,cascade = CascadeType.ALL  )
    private List<CompatibleCar> compatibleCarList = new ArrayList();

    @OneToMany(mappedBy = "product", orphanRemoval = true ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ProductImage> imageList = new ArrayList();

//     khong nen cascade ALL, boi vi neu xoa product thi order, cart bi xoa theo --> khong duoc
    @OneToMany(mappedBy = "product", orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<CartItem> cartItemList = new ArrayList();

    @OneToMany(mappedBy = "product", orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList = new ArrayList();

}
