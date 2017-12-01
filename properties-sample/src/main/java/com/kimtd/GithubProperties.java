package com.kimtd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GithubProperties {

    @Value("${com.kimtd.github.name}")
    private String name;

    @Value("${com.kintd.github.url}")
    private String url;
}
