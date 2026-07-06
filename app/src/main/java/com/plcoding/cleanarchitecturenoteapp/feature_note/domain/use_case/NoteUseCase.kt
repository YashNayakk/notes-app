package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

data class NoteUseCase(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
)
