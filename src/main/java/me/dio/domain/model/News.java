package me.dio.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "news")
public class News extends BaseItem {
    public News(Long id, String icon, String name, String description) {
        super(id, icon, name, description);
    }
}
