package com.matG.initProject.controller;
import com.matG.initProject.model.Note;
import com.matG.initProject.model.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {
    private final NoteRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(NoteController.class);
    NoteController(final NoteRepository repository){
        this.repository = repository;
    }
    @GetMapping("/notes")
    ResponseEntity<List<Note>> readAllNotes(){
        logger.warn("Warning ! All Notes exposed");
        return ResponseEntity.ok(repository.findAll());
    }
    @PostMapping("/notes")
    ResponseEntity<List<Note>> createNote(@RequestBody Note note){
        logger.warn("Note creation");
        repository.save(note);
        return ResponseEntity.noContent().build();
    }
}
