package org.example.nutritionreport.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Nutrition {

    private String nutritionName;
    private int goal;
    private String metric;
    private int total;
}
