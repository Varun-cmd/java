package org.example.report;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.example.report.model.Nutrition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ReportApplication {

    public static void main(String[] args) throws JRException {

        SpringApplication.run(ReportApplication.class, args);
        String filePath = "/home/vkumarv/JaspersoftWorkspace/sampleReport/driver_report.jrxml";


        Nutrition Timber = new Nutrition("Timber",48,50,"Tonnes");
        Nutrition Cement = new Nutrition("Cement",100,105,"Tonnes");
        Nutrition Rebars = new Nutrition("Rebars",150,150,"Tonnes");
        Nutrition Sand = new Nutrition("Sand",85,87,"Tonnes");


        List<Nutrition> goodsList=new ArrayList<>();
        goodsList.add(Timber);
        goodsList.add(Cement);
        goodsList.add(Rebars);
        goodsList.add(Sand);

        JRBeanCollectionDataSource driverData = new JRBeanCollectionDataSource(goodsList);



        Map<String, Object> parameters = new HashMap<>();
        parameters.put("firstName5646", "Varun");
        parameters.put("lastName", "Kumar");
        parameters.put("date", "01/01/24");
        parameters.put("nutritionDataSet", driverData);

        JasperReport report = JasperCompileManager.compileReport(filePath);
        JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(print, "/home/vkumarv/Desktop/test.pdf");

    }

}
