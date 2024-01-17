import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
public class Task {

    private String task_name;
    private String task_description;
    private StatusTask task_status = StatusTask.on_progress;
    private LocalDateTime task_start_date = LocalDateTime.now();
    private LocalDateTime task_end_date;

}
