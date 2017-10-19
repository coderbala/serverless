package com.dn.serverless.customer;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class DynamoDBUtil {

    private static AmazonDynamoDB dynamodbClient;
    private static final String DYNAMODB_REGION_KEY = "DYNAMODB_REGION";

    public static final AmazonDynamoDB getClient() {
        if (null != dynamodbClient) {
            return dynamodbClient;
        }

        String region = System.getenv(DYNAMODB_REGION_KEY);
        if (region == null) {
            region = Regions.US_EAST_1.name();
        }
        
        dynamodbClient = AmazonDynamoDBClientBuilder.standard()
                .withRegion(region)
                .build();

        return dynamodbClient;
    }
}
