package com.parlakci.ciftlikbank.adapter.jpa.account;

import com.parlakci.ciftlikbank.application.port.AccountPersistPort;
import com.parlakci.ciftlikbank.domain.model.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountPersistJpaAdapter implements AccountPersistPort {
    @Override
    public Account retrieveAccountByUid(String uid) {
        return null;
    }
}
