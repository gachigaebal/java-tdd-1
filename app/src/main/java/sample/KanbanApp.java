package sample;

import java.util.ArrayList;

class KanbanApp {
    public KanbanState addCard(KanbanState state, String cardName) {
        ArrayList<String> todo1 = state.getTodo();
        todo1.add(cardName);
        return new KanbanState(todo1, state.getInProgress(), state.getDone());
    }

    public KanbanState progressCard(KanbanState state, String cardName) {
    
        ArrayList<String> todo1 = state.getTodo();
        int index = todo1.indexOf(cardName);

        if (index > -1) {
            todo1.remove(index);

            ArrayList<String> inProgress1 = state.getInProgress();
            inProgress1.add(cardName);

            return new KanbanState(todo1, inProgress1, state.getDone());
        }


        ArrayList<String> inProgress1 = state.getInProgress();
        index = inProgress1.indexOf(cardName);

        if (index > -1) {
            inProgress1.remove(index);

            ArrayList<String> done1 = state.getDone();
            done1.add(cardName);

            return new KanbanState(todo1, inProgress1, done1);
        }
        return state;
    }
}