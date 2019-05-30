package co.edu.udistrital.WebSocketSpring;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.google.gson.Gson;

import co.edu.udistrital.dto.MedicalSignal;
import co.edu.udistrital.dto.MensajeBroadcast;

@Controller
public class AppController {

	@MessageMapping("/sendSignal")
    @SendTo("/topic/medicalSignal")
    public MensajeBroadcast recibirSenal(String message) throws Exception {
		final Gson gson = new Gson();
		final MedicalSignal senalMedicaJson = gson.fromJson(message, MedicalSignal.class);
        Thread.sleep(1000); // simulated delay
        //HtmlEscape convierte caracteres especiales en caracteres HTML
        return new MensajeBroadcast(HtmlUtils.htmlEscape(senalMedicaJson.getDato()));
    }
}
