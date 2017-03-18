package br.com.alelo.api;


import br.com.alelo.repository.TaxaAdicionalEntity;
import br.com.alelo.repository.TaxaAdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@PreAuthorize("hasAuthority('USER')")
public class AleloPrecoApi {

    @Autowired
    private TaxaAdicionalRepository taxaAdicionalRepository;

    @RequestMapping(method = RequestMethod.GET , path = "/test")
    public String requestTest(@Valid String data){

        TaxaAdicionalEntity taxaAdicional = taxaAdicionalRepository.findByProduto("Flex");
        if (taxaAdicional == null){
            return "the request came null";
        }
        return "you have sent '" + data + "' and the return from the database was '" + taxaAdicional.toString();
    }
}
