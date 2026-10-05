import java.util.ArrayList;

public class AudioContent extends DynamicContent {
    private ArrayList participants;

    public AudioContent(String name, String description, String location, int duration, ArrayList participants) {
        super(name, description, location, duration);
        setParticipants(participants);
    }

    public ArrayList getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList participants) {
        if (participants != null) {
            this.participants = participants;
        } else {
            this.participants = new ArrayList<>();
        }
    }

    public String listParticipants() {
        if (participants == null || participants.isEmpty()) {
            return "Unknown participants";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < participants.size(); i++) {
            sb.append("\t").append(participants.get(i));
            if (i < participants.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        if (participants == null || participants.isEmpty()) {
            return super.toString() + "\nParticipants:\n\t" + listParticipants();
        }
        return super.toString() + "\nParticipants:\n" + listParticipants();
    }
}