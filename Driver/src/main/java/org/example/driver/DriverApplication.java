package org.example.driver;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;



@SpringBootApplication
public class DriverApplication {

    public static void main(String[] args) throws FileNotFoundException, JRException {
        SpringApplication.run(DriverApplication.class, args);
        System.setProperty("java.awt.headless", "true");


        String outputFile="/home/vkumarv/Desktop/test"+"SampleReport.pdf";
        List<Employee> listItem = new ArrayList<>();


        Employee d1 = new Employee(1,"Will","Smith","Chennai",150000);
        Employee d2 = new Employee(2,"Ram","Kumar","Madurai",125000);
        Employee d3 = new Employee(3,"Sam","Tucker","Chennai",140000);
        Employee d4 = new Employee(4,"John","Doe","Coimbatore",110000);
        Employee d5 = new Employee(5,"Peter","Griffin","Mumbai",190000);
        listItem.add(d1);
        listItem.add(d2);
        listItem.add(d3);
        listItem.add(d4);
        listItem.add(d5);
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listItem);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("CollectionBeanParams",itemsJRBean);

        InputStream input = new FileInputStream(new File("/home/vkumarv/JaspersoftWorkspace/Student/JasperReport_A4.jrxml"));

        JasperDesign jasperDesign = JRXmlLoader.load(input);

        JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,new JREmptyDataSource());

        JasperViewer.viewReport(jasperPrint);
        JasperExportManager.exportReportToPdfFile(jasperPrint, outputFile);

        System.out.println("File created");

    }


}









