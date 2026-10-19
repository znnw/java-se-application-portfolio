package enumDemo;

public class Test2 {
    public static void main(String[] args) {
        move( Constant.UP);
        move2(Direction.DOWN);
    }
    public static void move2(Direction direction){
        switch (direction){
                case Direction.UP:
                System.out.println("向上移动");
                break;
                case Direction.DOWN:
                System.out.println("向下移动");
                break;
                case Direction.LEFT:
                System.out.println("向左移动");
                break;
                case Direction.RIGHT:
                System.out.println("向右移动");
                break;
                default:
                System.out.println("无效的移动方向");
                break;
        }
    }
    public static void move(int direction){
        switch (direction){
            case Constant.UP:
                System.out.println("向上移动");
                break;
            case Constant.DOWN:
                System.out.println("向下移动");
                break;
            case Constant.LEFT:
                System.out.println("向左移动");
                break;
            case Constant.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
                break;
        }
    }
}
