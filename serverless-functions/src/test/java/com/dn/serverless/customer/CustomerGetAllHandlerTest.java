package com.dn.serverless.customer;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

public class CustomerGetAllHandlerTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();
        ctx.setFunctionName("CustomerGetAll");

        return ctx;
    }

    @Test
    public void testCustomerGetAllHandler() {
        CustomerGetAllHandler handler = new CustomerGetAllHandler();
        Context ctx = createContext();

        List<Customer> output = handler.handleRequest(input, ctx);
        Assert.assertNotNull(output);
    }
}
