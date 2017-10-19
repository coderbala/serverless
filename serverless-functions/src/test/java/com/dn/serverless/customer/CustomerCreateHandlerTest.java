package com.dn.serverless.customer;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;
import com.dn.serverless.customer.Customer;
import com.dn.serverless.customer.CustomerCreateHandler;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class CustomerCreateHandlerTest {

    private static Customer customer;

    @BeforeClass
    public static void createInput() throws IOException {
    	
    	customer = new Customer();
    	customer.setAddress1("12345");
    	customer.setAddress2("Lambda Test Dr");
    	customer.setCity("DyanmoDB");
    	customer.setState("AWS");
    	customer.setFirstName("Serverless");
    	customer.setLastName("Lambda");
    	
    }

    private Context createContext() {
        TestContext ctx = new TestContext();
        ctx.setFunctionName("CustomerCreate");
        System.setProperty("DYNAMODB_REGION", "us-east-1");
        return ctx;
    }

    @Test
    public void testCustomerHandler() {
        CustomerCreateHandler handler = new CustomerCreateHandler();
        Context ctx = createContext();

        String output = handler.handleRequest(customer, ctx);

        Assert.assertNotNull(output);
    }
}
