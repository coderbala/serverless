package com.dn.serverless.customer;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CustomerCreateHandler implements RequestHandler<Customer, String> {

    @Override
    public String handleRequest(Customer customer, Context context) {
    	
    	DynamoDBMapper mapper = new DynamoDBMapper(DynamoDBUtil.getClient());
    	mapper.save(customer);
    	return customer.getId();
    }

}
