package Seminar5.Task.ui;

import Seminar5.Task.presenter.Presenter;

public interface View {
    void addNote(String str);
    String printNote();
    void allList();
    void launch();
    void setPresenter(Presenter presenter);
}
