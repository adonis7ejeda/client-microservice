package com.nttdata.clientmicroservice.controller;

import com.nttdata.clientmicroservice.entity.ClientEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/clients")
public class ClientController {

    @GetMapping("/{document}/type/{value}")
    public ClientEntity client(@PathVariable("document") int document, @PathVariable("value") Character type){

        log.info("Access endpoint /document/" + document + "/" + type);
        if (document != 23445322) {
            log.debug("Document value " + document + " is invalid");
            throw new BadRequestException("Number of document parameter: " + document + " is not valid." +
                    " Only accepted 23445322.");
        }
        if (type != 'C' && type != 'P') {
            log.debug("Type of document " + type + " is invalid");
            throw new BadRequestException("Type of document parameter: " + type + " is not valid." +
                    " Only accepted 'C' or 'P'.");
        }

        log.info("Success return data of client");
        return new ClientEntity("Adonis", "Sair", "Tejeda", "Rivera",
                "(+57)3156968860", "Calle 63c #14-32", "Barranquilla");
    }

}
