package ch.pma.repo;

import ch.pma.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void whenSavingCustomer_thenCorrect() {
        customerRepository.save(new Customer("Bob", "bob@domain.com"));
        Customer customer = customerRepository.findById(1L).orElseGet(()
                -> new Customer("john", "john@domain.com"));
        assertThat("Wrong name", customer.getName(), is(equalTo("Bob")));
    }
}
