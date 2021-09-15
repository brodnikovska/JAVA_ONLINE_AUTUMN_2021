package controller;

import model.Model;
import model.entities.NotUniqueLoginException;
import model.entities.NoteBook;
import view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private NoteBook noteBook;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook =
                new InputNoteNoteBook(view, sc);
        inputNoteNoteBook.inputNote();

        NoteBook noteBook = getNoteBook(inputNoteNoteBook);
        System.out.println(noteBook);
        noteBook.printNote(noteBook);
    }

    private NoteBook getNoteBook(InputNoteNoteBook inputNoteNoteBook) {
        NoteBook noteBook;
        while (true) {
            try {
                noteBook = new NoteBook(inputNoteNoteBook.getFirstName(), inputNoteNoteBook.getLogin());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                inputNoteNoteBook.inputLogin();
            }
        }
        return noteBook;
    }


}
