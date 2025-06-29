//package net.arlynplay.journalApp.controller;
//
//import net.arlynplay.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//    private Map<Long , JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId){
//        return journalEntries.get(myId);
//    }
//
//    @DeleteMapping("/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
//        return journalEntries.remove(myId);
//    }
//}
