package hu.yuuzer.lannister.core.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by yuuzer on 6/5/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META-INF/services-ctx.xml")
public class InfoServiceIntTest {

    @Autowired
    private InfoService infoService;

    @Test
    public void shouldReadVersionFromProperty() throws Exception {
        String version = infoService.getVersion();

        assertThat(version, equalTo("1.0"));


    }
}
