package com.matG.initProject.model;

import java.util.List;

public interface NoteRepository {
    List<Note> findAll();
    Note save(Note entity);
}
