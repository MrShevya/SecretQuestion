package edu.mrshevya.secretquestion;


import org.springframework.web.bind.annotation.*;

@RestController
public class SQuestionController {

    @GetMapping(value = "/questions/")
    protected String[] getQuestions(){
        //выгружаем все вопросы из базы базовых вопросов, выдаем их под айдишниками стандартных вопросов
        String[] avs = new String[] {"a", "b"};
        return avs;
    }

    @GetMapping(value = "/questions/{id}")
    protected String getBaseQuestion(@PathVariable(value = "questionid") Long id){
        return "s";
    }
    // выдаем один базовый вопрос по id

    @PostMapping(value = "/setQuestion/{question}")
    protected void setQuestion(int id, int questionid){ // если questionid равен нулю, задавать свой вопрос, если другой, брать по id из базы вопросов
    }

    @GetMapping(value = "/getAnswer/{id}")
    protected String getCurrentAnswer(@PathVariable(value = "questionid") Long id){
      return "s"; // запрос в базу и выдача вопроса по айдишнику
    }


    protected boolean login(int id, String quest_a){
        return true; // запрос в базу по id и сверка данного юзером ответа с базой
    }

    @PostMapping
    protected void removeQuestion(int id){ // удалить вопрос по id

    }

}
