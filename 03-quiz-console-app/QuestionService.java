import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "what is Arjun's favorite sport?", "table-tennis", "badminton", "football", "volleyball", "football");
        questions[1] = new Question(2, "what is Kevin's favorite sport?", "table-tennis", "badminton", "football", "volleyball", "badminton");
        questions[2] = new Question(3, "what is Joshua's favorite sport?", "football", "wushu-sanda", "mma", "badminton", "mma");
        questions[3] = new Question(4, "what is Rashmit's favorite sport?", "table-tennis", "badminton", "football", "volleyball", "football");
        questions[4] = new Question(5, "what is Anuraag's favorite sport?", "cricket", "cycling", "basketball", "football", "cricket");

    }

    public void playQuiz()
    {
        int i = 0;
        for(Question q : questions)
        {
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("options: ");
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.println("enter your answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }


        for(String s : selection)
        {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void getScore()
    {
        int score = 0;
        for(int i = 0; i<questions.length; i++)
        {   
            Question que = questions[i];
            String rightAnswer = que.getAnswer();
            String userAnswer = selection[i];
            
            if(rightAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("You're score is: "+score);
    }
}
