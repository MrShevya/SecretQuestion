package edu.mrshevya.secretquestion;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SQuestionController {

@RequestMapping(value = "/questions/")
    protected String[] getQuestions(){
        //выгружаем вопросы из базы базовых вопросов, выдаем их под айдишниками стандартных вопросов
        String[] avs = new String[] {"a", "b"};
        return avs;
    }

    @RequestMapping(value = "/questions/{id}")
    protected String getBaseQuestion(@PathVariable(value = "questionid") Long id){
        return "s";
    }

    @PostMapping(value = "/setQuestion/{question}")
    protected void setQuestion(int id, int questionid){ // если questionid равен нулю, задавать свой вопрос, если другой, брать по id из базы вопросов

    }

    protected String getCurrentAnswer(int id){
      return "s"; // запрос в базу и выдача вопроса по айдишнику
    }

    protected boolean login(int id, String quest_a){
        return true; // запрос в базу по id и сверка данного юзером ответа с базой
    }

    protected void removeQuestion(int id){

    }

    protected String getCurrentQuestion(int id){
        return "s";
    }

}
