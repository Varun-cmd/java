package org.example.nutritionreport.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MacroNutrient {
    private String macroNutrientName;
    private int macroNutrientValue;

}
