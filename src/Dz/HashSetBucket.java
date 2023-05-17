package Dz;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import static java.util.Objects.isNull;

public class HashSetBucket {
    private List<ValueEntry> entries;

    public HashSetBucket() {
        if(isNull(entries)) {
            entries = new LinkedList<>();
        }
    }

    public List<ValueEntry> getEntries() {
        return entries;
    }

    public void addEntry(ValueEntry entry) {
        this.entries.add(entry);
    }

    public void removeEntry(ValueEntry entry) {
        this.entries.remove(entry);
    }
}

