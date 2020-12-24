

// Let’s create an AuditingConfig configuration class and 
//add the @EnableJpaAuditing annotation to it.

// We’re creating a separate class because we’ll be adding 
// more auditing related configurations later. 
// So it’s better to have a separate class.


// We’ll keep all the configuration classes inside
// a package named config. Go ahead and create the config
// package inside com.example.polls, and then create
// the AuditingConfig class inside config package -

package com.example.polls.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {
    // That's all here for now. We'll add more auditing configurations later.
}
