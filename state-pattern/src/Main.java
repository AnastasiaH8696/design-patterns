import com.state.example.AnimalActionContext;
import com.state.example.EatActionState;
import com.state.example.PlayActionState;
import com.state.example.SleepActionState;

public class Main {
    public static void main(String[] args) {
        AnimalActionContext context = new AnimalActionContext();

        EatActionState eatActionState = new EatActionState();
        eatActionState.doAction(context);
        System.out.println(context.getState().toString());

        SleepActionState sleepActionState = new SleepActionState();
        sleepActionState.doAction(context);
        System.out.println(context.getState().toString());

        PlayActionState playActionState = new PlayActionState();
        playActionState.doAction(context);
        System.out.println(context.getState().toString());

    }
}