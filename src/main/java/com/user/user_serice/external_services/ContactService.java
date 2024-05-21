package com.user.user_serice.external_services;

import com.user.user_serice.entity.Contact;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="contact-service")
public interface ContactService
{

    @GetMapping("/contacts/{id}")
    java.util.List<Contact> getContacts(@PathVariable("id") Long id);


}
