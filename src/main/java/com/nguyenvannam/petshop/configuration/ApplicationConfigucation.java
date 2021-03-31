package com.nguyenvannam.petshop.configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigucation{
//    @Bean
//    public PasswordEncoder getpasswordEncoder(){
//        return new BCryptPasswordEncoder(8);
//    }

    @Bean
    public ModelMapper modelMapper (){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return mapper;
    }
}
