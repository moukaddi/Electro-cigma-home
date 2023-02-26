package com.electro.cigma.dtos;

import com.electro.cigma.entity.Thumbnail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WishlistView {
    private int wid;
    private int pid;
    private String name;
    private double price;
    private Thumbnail thumbnail;
    private boolean available;
}
