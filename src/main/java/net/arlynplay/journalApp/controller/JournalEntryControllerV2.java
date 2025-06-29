package net.arlynplay.journalApp.controller;

import net.arlynplay.journalApp.entity.JournalEntry;
import net.arlynplay.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    // GET /journal  → all entries
    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }

    // POST /journal  → create new entry
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) {
        myEntry.setDate(LocalDateTime.now());
        return journalEntryService.saveEntry(myEntry);
    }

    // GET /journal/{id}  → single entry
    @GetMapping("/{myId}")
    public ResponseEntity<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId) {
        return journalEntryService.getById(myId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE /journal/{id}  → delete entry
    @DeleteMapping("/{myId}")
    public ResponseEntity<Void> deleteJournalEntryById(@PathVariable ObjectId myId) {
        if (journalEntryService.getById(myId).isPresent()) {
            journalEntryService.deleteById(myId);
            return ResponseEntity.noContent().build();   // 204
        } else {
            return ResponseEntity.notFound().build();    // 404
        }
    }
}
