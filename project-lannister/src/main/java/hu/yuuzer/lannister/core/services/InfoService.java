package hu.yuuzer.lannister.core.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by yuuzer on 6/5/2015.
 */
@Service
public class InfoService {

    @Value("${lannister.version}")
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
