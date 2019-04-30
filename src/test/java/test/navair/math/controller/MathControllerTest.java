package test.navair.math.controller;

import mil.navair.math.controller.MathController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

public class MathControllerTest {

    private MathController controller;

    @Before
    public void setUp() throws Exception {
        controller = new MathController();
    }

    @Test
    public void addTest() throws Exception {
        Number first = 2;
        Number second = 3;
        Number expected = 5.0;

        ResponseEntity response = controller.add(first, second);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void subtractTest() throws Exception {
        Number first = 2;
        Number second = 3;
        Number expected = -1.0;

        ResponseEntity response = controller.subtract(first, second);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

    @Test
    public void multiplyTest() throws Exception {
        Number first = 2;
        Number second = 3;
        Number expected = 6.0;

        ResponseEntity response = controller.multiply(first, second);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }


    @Test
    public void divideTest() throws Exception {
        Number first = 2;
        Number second = 3;
        Number expected = (1.0 * 2) / 3;

        ResponseEntity response = controller.divide(first, second);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isEqualTo(expected);
    }

}
