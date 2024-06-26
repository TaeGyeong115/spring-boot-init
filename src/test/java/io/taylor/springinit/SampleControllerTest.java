package io.taylor.springinit;

import io.taylor.sample.SampleController;
import io.taylor.sample.SampleService;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK) // 통합 테스트
//@AutoConfigureMockMvc
@WebMvcTest(SampleController.class) // slice test
//@ExtendWith(OutputCaptureExtension.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

    @MockBean
    // 사용하는 게 있다면 빈을 주입해야 함
    SampleService mockSampleService;

    @Autowired
    MockMvc mockMvc;

    @Rule
    public OutputCaptureRule outputCapture = new OutputCaptureRule();

    @Test
    public void hello() throws Exception {
        when(mockSampleService.getName()).thenReturn("taylor");

        mockMvc.perform(get("/hello")).andExpect(content().string("hello taylor"));

        // log massage 확인
        assertThat(outputCapture.toString())
                .contains("holoman")
                .contains("skip");
    }

// rest call
//    @Autowired
//    WebTestClient webTestClient;
//
//    @Test
//    public void hello() throws Exception {
//        when(mockSampleService.getName()).thenReturn("taylor");
//
//        webTestClient.get().uri("/hello")
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(String.class).isEqualTo("hello taylor");
//        assertThat(outputCapture.toString());
//    }

//    @Autowired
//    TestRestTemplate testRestTemplate;
//
//    @Test
//    public void hello() throws Exception {
//        when(mockSampleService.getName()).thenReturn("taylor");
//
//        String result = testRestTemplate.getForObject("/hello", String.class);
//        assertThat(result).isEqualTo("hello taylor");
//    }

//    @Autowired // application context에 있는 빈을 mock으로 만든 객체로 교체
//    MockMvc mockMvc;
//
//    @Test
//    public void hello() throws Exception {
//        mockMvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("hello taylor"))
//                .andDo(print());
//    }
}
