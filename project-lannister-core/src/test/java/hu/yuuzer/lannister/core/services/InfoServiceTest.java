package hu.yuuzer.lannister.core.services;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by yuuzer on 6/5/2015.
 */
public class InfoServiceTest {
    private static final String TEST_VERSION = "test version";

    @Test
    public void shouldTellTheActualVersion() throws Exception {
        InfoService infoService = new InfoService();
        infoService.setVersion(TEST_VERSION);

        String version = infoService.getVersion();

        assertThat(version, equalTo(TEST_VERSION));

    }
}
