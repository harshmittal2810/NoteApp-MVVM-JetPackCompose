package com.harsh.noteapp.feature_note.domain.use_case

import com.harsh.noteapp.feature_note.domain.model.InvalidNoteException
import com.harsh.noteapp.feature_note.domain.model.Note
import com.harsh.noteapp.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of note can't be empty")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of note can't be empty")
        }

        repository.insertNote(note)
    }

}