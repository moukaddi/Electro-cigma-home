package com.electro.cigma.dtos;

import com.electro.cigma.entity.Thumbnail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchView {
    private int id;
    private String name;
    private double amount;
    private double rating;
    private int raters;
    private boolean available;
    private boolean isTrending;
    private Thumbnail thumbnail;
}
