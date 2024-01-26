package com.harsh.noteapp.feature_note.data.data_source

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.room.Database


@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase {

    abstract val noteDao: NoteDao


}