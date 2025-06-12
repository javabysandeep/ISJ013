import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Course {
    private int id;
    private String name;
    private int price;
}
