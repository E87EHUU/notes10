package com.example.notes10.di;

import com.example.notes10.domain.InMemoryNotesRepository;
import com.example.notes10.domain.NotesRepository;


public class Dependencies {

    public static final NotesRepository NOTES_REPOSITORY = new InMemoryNotesRepository();
}