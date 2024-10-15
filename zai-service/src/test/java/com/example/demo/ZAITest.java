package com.example.demo;

//import com.commons.zaiDTOS.client.ClientDTO;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.common.net.HttpHeaders;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.Mockito;
//import org.powermock.api.mockito.PowerMockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.zai.ZaiService;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;
import org.zai.controller.ZAIController;
import org.zai.service.InvopayWebIntigrationService;
import org.zai.service.ZAIService;

//@WebMvcTest({ZAIController.class})
//@SpringBootTest(classes = ZaiService.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class ZAITest {
//    @MockBean
//    private ZAIService zaiService;
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private InvopayWebIntigrationService invopayWebIntigrationService;

    private static final String s = "eyJraWQiOiJjMTFmNmY3OS02YzA5LTQ5NDEtYTE0Yy03MjNiMjI3ODQ4NDciLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJjbGllbnQiLCJhdWQiOiJjbGllbnQiLCJuYmYiOjE2NzI2NjU1ODAsInNjb3BlIjpbIm9wZW5pZCJdLCJpc3MiOiJodHRwOlwvXC9sb2NhbGhvc3Q6ODA4MCIsImV4cCI6MTcwNDIwMTU4MCwiaWF0IjoxNjcyNjY1NTgwfQ.ciNqxqcsOq74nArdSInY83an_05KGKnlQnQ1L6j_FBZIO156LVV7QVQ319LWuzQOtzFomjCHCeXwWfsfz-D6_3xOL4HC-83EiksZt6IuiuK9wX18M0ByhDsIuEsgZI842Dse82ukY3GLXBpYZEwUZ5QApvnbpXmqJUWL9OBc9rTD02fexNbMJHJZj_SMxaTH-E4wBDc-O6wZawEtcZVcwUgZgMh94gDx29HQmFAiyNcANVILctghJjIaU7otaeEDSbcDl2lW09iedziDTnUAualVMAnZI6kJEHNJlxvWYFWt-z5OeaB7zO4gkjvf7Rif9X5L6x_mfTuIbc6nDJIyVg";
//
//    @Test
//    public void createClientTest() throws Exception {
//        ClientDTO clientDTO = ClientDTO.builder().client_fname("John").client_lname("Doe").client_email("john@email.com").ref_country_id(13L).build();
//        Mockito.when(this.zaiService.createClient((ClientDTO) ArgumentMatchers.any())).thenReturn(clientDTO);
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonObj = objectMapper.writeValueAsString(clientDTO);
//        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.post("/create_client", new Object[0])
//                .header(HttpHeaders.AUTHORIZATION, "Bearer " +s)
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(jsonObj);
//        ResultActions perform = this.mockMvc.perform(req);
//        MvcResult mvcResult = perform.andReturn();
//        MockHttpServletResponse responce = mvcResult.getResponse();
//        int status = responce.getStatus();
//        Assertions.assertEquals(200, status);
//    }

    @Test
    public void createClientServiceTest(){
//        ClientDTO clientDTO = ClientDTO.builder().client_fname("John").client_lname("Doe").client_email("john@email.com").ref_country_id(13L).build();
//
//        Mockito.when(this.zaiService.createClient((ClientDTO) ArgumentMatchers.any())).thenReturn(clientDTO);
//        InvopayWebIntigrationService invopayWebMock = PowerMockito.mock(InvopayWebIntigrationService.class);
//        PowerMockito.when(invopayWebMock.getClientCOuntryIsoCountryCode(13).thenReturn("AUS"));

    }


}
