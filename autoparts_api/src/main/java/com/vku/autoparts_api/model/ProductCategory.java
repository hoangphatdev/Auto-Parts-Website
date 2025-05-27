package com.vku.autoparts_api.model;

import com.vku.autoparts_api.util.DateTimeUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product_categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "created_at")
    private String createdAt = DateTimeUtil.getFormattedDateTime();
    @Column(name = "updated_at")
    private String updatedAt;
}
