package com.crmiguez.iop_grid;

import com.crmiguez.iop_grid.repository.PriceRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IopGridApplicationTests {

    @Test
    void contextLoads() {
    }

    @Sql({"/schema.sql", "/data.sql"})
    public class SpringBootInitialLoadIntegrationTest {

        @Autowired
        private PriceRepository priceRepository;

        @Test
        public void testLoadDataForTestClass() {
            assertEquals(4, priceRepository.findAll());
        }

        @Test
        public void testOne() {
            assertEquals(1, priceRepository.findByEndDateAndProductIdAndBrandId("2020-06-14-10.00.00",35455,1));
        }

        @Test
        public void testTwo() {
            assertEquals(1, priceRepository.findByEndDateAndProductIdAndBrandId("2020-06-14-16.00.00", 35455, 1));

        }
        @Test
        public void testThree() {
                assertEquals(1, priceRepository.findByEndDateAndProductIdAndBrandId("2020-06-14-21.00.00",35455,1));
        }

        @Test
        public void testFour() {
                assertEquals(1, priceRepository.findByEndDateAndProductIdAndBrandId("2020-06-15-10.00.00",35455,1));
        }

        @Test
        public void testFive() {
                assertEquals(1, priceRepository.findByEndDateAndProductIdAndBrandId("2020-06-14-10.00.00",35455,1));
        }
    }

}
