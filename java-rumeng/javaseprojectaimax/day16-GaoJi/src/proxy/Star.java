package proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Star implements StarService{
    private String name;
    @Override
    public void sing(String name) {
        System.out.println(this.name + "表演唱歌" + name);
        System.out.println("===========");
    }
    @Override
    public String dance() {
        System.out.println(this.name + "表演跳舞" + name);
        System.out.println("===========");
        return "dance"+"谢谢 ";
    }
}
