package se.lexicon.workshop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.workshop.config.ComponentScanConfig;
import se.lexicon.workshop.data_access.StudentDao;
import se.lexicon.workshop.util.UserInputService;

public class App {

    public static void main(String[] args) {
    }

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    StudentDao studentDao = context.getBean(StudentDao.class);
    UserInputService userInputService = context.getBean(UserInputService.class);


}
