package com.ProjectMyPresent.ProjectMyPresent.config;

import com.ProjectMyPresent.ProjectMyPresent.ProjectMyPresentApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ProjectMyPresentApplication.class);
    }

}
