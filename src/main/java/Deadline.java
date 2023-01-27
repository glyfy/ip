import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Deadline extends Task{
    protected String by;
    public Deadline(String desc, String by) {
        super(desc);
        this.by = by;
        if (by.matches("\\d{4}-\\d{2}-\\d{2}")){
            LocalDate date = LocalDate.parse(by);
            this.by = date.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
        }
    }
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by:" + by + ")";
    }
}
