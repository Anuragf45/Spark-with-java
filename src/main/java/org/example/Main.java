package org.example;

import org.apache.spark.sql.SparkSession;

public class Main {
    public static void main(String[] args) {

        SparkSession spark= SparkSession.builder().appName("newApp").master("master").getOrCreate();

    }
}