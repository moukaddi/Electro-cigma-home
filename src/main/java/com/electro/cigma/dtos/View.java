package com.electro.cigma.dtos;

import com.electro.cigma.entity.Thumbnail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class View {
    private int id;
    private String title;
    private double price;
    private Thumbnail thumbnail;
}
