package org.example.nutritionreport;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.example.nutritionreport.model.MacroNutrient;
import org.example.nutritionreport.model.Nutrition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class NutritionReportApplication {

    public static void main(String[] args) throws JRException {


        SpringApplication.run(NutritionReportApplication.class, args);
        String filePath = "/home/vkumarv/Desktop/Java/NutritionReport/src/main/resources/templates/nutritionreport.jrxml";

        Nutrition protien = new Nutrition("Protein", 62, 83, "G");

        Nutrition x = new Nutrition("Protein",62,83,"G");
        Nutrition y = new Nutrition("Carbs",62,83,"G");

        List<Nutrition> nutritionList = new ArrayList<>();
        nutritionList.add(protien);
        nutritionList.add(x);
        nutritionList.add(y);
        System.out.println(Arrays.toString(nutritionList.toArray()));

        JRBeanCollectionDataSource nutritionDataSource = new JRBeanCollectionDataSource(nutritionList);



        MacroNutrient carb = new MacroNutrient("Carbs",28);
        MacroNutrient fat = new MacroNutrient("fat",32);
        MacroNutrient protein = new MacroNutrient("Protein",20);


        List<MacroNutrient> macroNutrientList = new ArrayList<>();
        macroNutrientList.add(carb);
        macroNutrientList.add(fat);
        macroNutrientList.add(protein);
        JRBeanCollectionDataSource macroNutrientDataset = new JRBeanCollectionDataSource(macroNutrientList);


        Map<String, Object> parameters = new HashMap<>();
        parameters.put("firstName","Varun");
        parameters.put("lastName", "Kumar");
        parameters.put("date", "01/01/24");
        parameters.put("nutritionDataSet",nutritionDataSource);
        parameters.put("macroNutrientDataSource",macroNutrientDataset);


        JasperReport report = JasperCompileManager.compileReport(filePath);
        JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(print, "/home/vkumarv/Desktop/sampleReport.pdf");
        System.out.println("Report Generated Successfully");
    }

}
