package org.example;


import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.SparkSession;
import org.example.Models.UserModel;

import java.util.ArrayList;
import java.util.Arrays;

import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.lit;

public class Main {
    public static void main(String[] args) {
       SparkSession spark= SparkSession.builder().master("local").appName("App").getOrCreate();
        Dataset<Row> details=spark.read().option("header",true).csv("/Users/anuragsrivastava/Downloads/Spark_java/src/main/resources/file.csv");
        details.show();


//        Dataset<Row> colDet=details.select(col("first_name"));
//        colDet.show();
    //    details.select(col("first_name")).show();

//        Dataset<Row> data=spark.createDataFrame(Arrays.asList(
//              new UserModel("Anurag Srivastava","anuragf45","anuragf45@gmail.com","anurag9090"),
//                new UserModel("Rahul","naamToSunaHiHoga","rahuldhek@gmail.com","kajol")
//        ),UserModel.class);
//        data.show();
//data.write().option("header",true).option("delimiter","|").mode(SaveMode.Append).csv("/Users/anuragsrivastava/Downloads/Spark_java/src/main/resources");
//data.show();

        /////removing a column
        //details.drop("Login email").show();

        ///////adding a column
       // details.withColumn("newColumn",lit("Anurag")).show();



    }
}