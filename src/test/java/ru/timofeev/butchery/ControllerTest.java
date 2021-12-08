package ru.timofeev.butchery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.timofeev.butchery.controllers.LoginController;
import ru.timofeev.butchery.controllers.ProductsController;
import ru.timofeev.butchery.controllers.RequestController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private ProductsController productsController;
    @Autowired
    private RequestController requestController;
    @Autowired
    private LoginController loginController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(productsController).isNotNull();
        assertThat(requestController).isNotNull();
        assertThat(loginController).isNotNull();
    }
}
