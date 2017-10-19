package com.dn.serverless.customer;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CustomerGetAllHandler implements RequestHandler<Object, List<Customer>> {

    @Override
    public List<Customer> handleRequest(Object input, Context context) {

    	DynamoDBMapper mapper = new DynamoDBMapper(DynamoDBUtil.getClient());
		
    	DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
    	scanExpression.withConsistentRead(false);
    	
    	return mapper.scan(Customer.class, scanExpression);
    }

}
