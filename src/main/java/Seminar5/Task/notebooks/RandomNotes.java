package Seminar5.Task.notebooks;

public class RandomNotes implements Notes{
    @Override
    public String getNotes(String str) {
        return str.toUpperCase();

    }
}
