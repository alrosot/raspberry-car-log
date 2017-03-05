package br.com.trofo.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPing() {
        ResponseEntity<String> entity =
                restTemplate.getForEntity("/ping", String.class);

        Assert.assertTrue(entity.getStatusCode().is2xxSuccessful());
        Assert.assertEquals("pong", entity.getBody());
    }
}