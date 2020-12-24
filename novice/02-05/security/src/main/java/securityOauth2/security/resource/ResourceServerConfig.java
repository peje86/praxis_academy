package securityOauth2.security.resource;
// Step 3: Configure Resource Server

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;


@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private ResourceServerTokenServices tokenServices;

    @Autowired
    private JwtAccessTokenConverter accessTokenConverter;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenServices(tokenServices);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .requestMatchers()
            .and()
            .authorizeRequests()
            .antMatchers("/actuator/**", "/api-docs/**","/oauth/*").permitAll()
            .antMatchers("/jwttest/**" ).authenticated();
    }

}