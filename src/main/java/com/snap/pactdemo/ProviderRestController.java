package com.snap.pactdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderRestController {

    @GetMapping("/get/{name}/{price}")
    public DataModel getMapping(@PathVariable String name, @PathVariable Double price) {
        return DataModel.builder()
                .name(name)
                .price(price)
                .build();
    }

    @PostMapping("/post")
    public DataModel getMapping(@RequestBody DataModel dataModel) {
        log.info(dataModel.toString());
        return dataModel;
    }
}
