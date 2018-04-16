package com.rabears.config;

import com.rabears.dao.PersonRepository;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class CMDRunnerTest {
    CMDRunner runner;

    PersonRepository repository;

    @Before
    public void setup(){
        runner = new CMDRunner();
        repository = mock(PersonRepository.class);
    }

    @Test
    public void runner() throws Exception {
        runner.runner(repository).run(new String[]{""});
        verify(repository,times(1)).findAll();
    }
}