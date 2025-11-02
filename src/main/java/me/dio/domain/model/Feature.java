package me.dio.domain.model;

import jakarta.persistence.Entity;
import me.dio.domain.model.BaseItem;

@Entity(name = "feature")
public class Feature extends BaseItem {
    public Feature(Long id, String icon, String name, String description) {
        super(id, icon, name, description);
    }
}