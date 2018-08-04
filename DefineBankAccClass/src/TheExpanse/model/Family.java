package TheExpanse.model;

import TheExpanse.TextConstants;
import TheExpanse.model.colonists.Colonist;

import java.util.*;

public class Family {
    private final String id;
    private final Map<String, Colonist> members;

    public Family(String id) {
        this.id = id;
        this.members = new TreeMap<>();
    }
    public List<Colonist> getMembers() {
        return Collections.unmodifiableList(new ArrayList<>(this.members.values()));
    }

    public void removeMember(String id) {
        this.members.remove(id);
    }

    public void addMember(Colonist colonist) {
        this.members.put(colonist.getId(), colonist);
    }

    public int getPotential() {
        return this.members.values().stream()
                .mapToInt(Colonist::getPotential)
                .sum();
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(String.format(TextConstants.FAMILY_HEADER, this.id));
        this.members.values()
                .forEach(colonist -> sb.append(String.format(TextConstants.FAMILY_ENTRY,
                        colonist.getId(), colonist.getPotential())));
        return sb.toString().trim();
    }

}
