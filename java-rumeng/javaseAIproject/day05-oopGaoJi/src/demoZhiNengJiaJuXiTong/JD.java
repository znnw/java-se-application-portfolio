package demoZhiNengJiaJuXiTong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JD implements Switch {
    private String name;
    private boolean status;
    @Override
    public void press(){
        status = !status;
    }
}
