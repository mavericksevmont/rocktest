package io.rocktest.integration;

import io.rocktest.RockTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.Assert.assertNull;

@SpringBootTest
public class HttpMock extends RockTest {
    private static Logger LOG = LoggerFactory.getLogger(HttpMock.class);

    @Test
    public void simpleMock() throws IOException, InterruptedException {
        String ret=run("simplehttpmock.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void mockCall() throws IOException, InterruptedException {
        String ret=run("http.yaml");
        assertNull("Scenario should succeed",ret);
    }

    @Test
    public void mockDB() throws IOException, InterruptedException {
        String ret=run("httpmockdb.yaml");
        assertNull("Scenario should succeed",ret);
    }


}
