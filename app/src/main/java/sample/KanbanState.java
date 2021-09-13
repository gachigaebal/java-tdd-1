package sample;

import java.util.ArrayList;

class KanbanState {
    private ArrayList<String> todo;
    private ArrayList<String> inProgress;
    private ArrayList<String> done;

    public KanbanState() {
        todo = new ArrayList<String>();
        inProgress = new ArrayList<String>();
        done = new ArrayList<String>();
    }

    public KanbanState(ArrayList<String> todo, ArrayList<String> inProgress, ArrayList<String> done) {
      this.todo = todo;
      this.inProgress = inProgress;
      this.done = done;
    }

    public ArrayList<String> getTodo() {
        return new ArrayList<String>(todo);
    }

    public ArrayList<String> getInProgress() {
        return new ArrayList<String>(inProgress);
    }

    public ArrayList<String> getDone() {
        return new ArrayList<String>(done);
    }

    public int getTodoColumnSize() {
        return todo.size();
    }

    public int getInProgressColumnSize() {
        return inProgress.size();
    }

    public int getDoneColumnSize() {
        return done.size();
    }
}
