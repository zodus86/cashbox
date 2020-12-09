package com.project.cashbox.controller;


import com.project.cashbox.dto.CashboxDto;
import com.project.cashbox.model.Cashbox;
import com.project.cashbox.model.TypeOfOperation;
import com.project.cashbox.repository.CashboxRepository;
import com.project.cashbox.service.CashboxService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;

class CashboxControllerTest {


    @Test
    void addCashbox() {

        Cashbox cashbox = new Cashbox();
        cashbox.setText("test");
        cashbox.setSum(999l);
        cashbox.setTypeOfOperation(TypeOfOperation.MINUS);

        Assertions.assertNotNull(cashbox);

    }
}