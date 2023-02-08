package com.example.notes10.domain;

import java.util.List;

public interface NotesRepository {

    List<Note> getAll();
}