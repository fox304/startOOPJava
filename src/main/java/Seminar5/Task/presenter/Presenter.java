package Seminar5.Task.presenter;

import Seminar5.Task.notebooks.Notes;
import Seminar5.Task.ui.View;

public class Presenter {
    View view;
    Notes notes;

    public Presenter(View view, Notes notes) {
        this.view = view;
        this.notes = notes;
        view.setPresenter(this);
    }
    public void button(String str){
       String st =  notes.getNotes(str);
       view.addNote(st);


    }
}
