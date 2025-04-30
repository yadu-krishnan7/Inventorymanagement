package com.inventory.inventoryManagement.service.impl;

import com.inventory.inventoryManagement.entities.PromoCode;
import com.inventory.inventoryManagement.exceptions.PromoCodeNotFoundException;
import com.inventory.inventoryManagement.repo.PromoCodeRepository;
import com.inventory.inventoryManagement.service.PromoCodeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class PromoCodeServiceImpl implements PromoCodeService {

    private final PromoCodeRepository promoCodeRepository;

    public PromoCodeServiceImpl(PromoCodeRepository promoCodeRepository) {
        this.promoCodeRepository = promoCodeRepository;
    }

    @Override
    public PromoCode findByCode(String code) {
        Optional<PromoCode> promoCodeOptional = promoCodeRepository.findByCode(code);

        if(promoCodeOptional.isPresent()){
            return promoCodeOptional.get();
        }
        throw new PromoCodeNotFoundException("PromoCode not found "+code);
    }
}
