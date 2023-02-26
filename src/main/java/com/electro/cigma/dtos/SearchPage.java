package com.electro.cigma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchPage {

    private List<SearchView> searchView;
    private int itemCount;

}
