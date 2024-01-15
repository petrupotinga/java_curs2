package многопоточность;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.FOARFECA);
        friend1Action.add(Action.HIRTIE);
        friend1Action.add(Action.FOARFECA);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.HIRTIE);
        friend2Action.add(Action.PIATRA);
        friend2Action.add(Action.PIATRA);
        new BestFriend("Vanea", friend1Action, exchanger);
        new BestFriend("Petru", friend2Action, exchanger);
    }
}

enum Action {
    PIATRA, FOARFECA, HIRTIE
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if ((myAction == Action.PIATRA && friendsAction == Action.FOARFECA)
                || (myAction == Action.FOARFECA && friendsAction == Action.HIRTIE)
                || (myAction == Action.HIRTIE && friendsAction == Action.PIATRA)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}