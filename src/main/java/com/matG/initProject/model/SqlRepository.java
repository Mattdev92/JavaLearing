package com.matG.initProject.model;
import org.springframework.data.jpa.repository.JpaRepository;

interface SqlRepository extends JpaRepository<Note,Integer>, NoteRepository {
}
