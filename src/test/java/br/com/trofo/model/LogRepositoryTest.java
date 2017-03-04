package br.com.trofo.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by arosot on 04/03/2017.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {LogRepositoryImpl.class})
public class LogRepositoryTest {

    @Autowired
    private LogRepository logRepository;

    @Test
    public void shouldSave() throws Exception {
        logRepository.save(new Log());

    }
}