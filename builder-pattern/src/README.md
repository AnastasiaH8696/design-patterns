You should define the ```IQuizQuestion``` interface. 

It should describe a quiz question (with multiple answers to choose from). 

Your definition for ```IQuizQuestion``` should include abstract methods, such as 
* ```setTitle```
* ```setQuestion```

You should define the ```QuizQuestion``` class. 

It should implement ```IQuizQuestion```.

You should define the ```Builder``` class as a static nested class in ```QuizQuestion```.

Builder should implement ```IQuizQuestionBuilder```. 

Hereto the definition of ```IQuizQuestionBuilder```:

```
public interface IQuizQuestionBuilder {
public IQuizQuestionBuilder setTitle(String text);
public IQuizQuestionBuilder setQuestion(String text);
public IQuizQuestionBuilder addAnswer(String text, boolean correct);
public IQuizQuestion create();
}
```

You should test your code with the following code snippet:
```
IQuizQuestionBuilder builder1 = new QuizQuestion.Builder();

builder1.setTitle(“We Love Canada”);
builder1.setQuestion(“Canada starts with…?”);
builder1.addAnswer(“Canada starts with the letter ‘A’.”,false);
builder1.addAnswer(“Canada starts with the letter ‘B’.”,false);
builder1.addAnswer(“Canada starts with the letter ‘C’.”,true);
builder1.addAnswer(“Canada starts with the letter ‘D’.”,false);
builder1.addAnswer(“Canada starts with the letter ‘E’.”,false);
IQuizQuestion question1 = builder.create();
```