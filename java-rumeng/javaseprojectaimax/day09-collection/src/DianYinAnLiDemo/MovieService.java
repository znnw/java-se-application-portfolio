package DianYinAnLiDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    private static List<Movie> movies = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("=====电影操作系统======");
        System.out.println("1. 添加电影");
        System.out.println("2. 查询电影");
        System.out.println("3. 下架电影");
        System.out.println("4. 封杀某个明星");
        System.out.println("5. 退出");

        String command =sc.next();
        switch(command){
            case"1":
                addMovie();
                break;
            case"2":
                queryMovie();
                break;
            case"3":
                break;
            case"4":
                deleteStar();
                break;

            case"5":
                System.out.println("退出成功");
                return;
            default:
                System.out.println("命令错误");

        }
    }

    private void deleteStar() {
        System.out.println("=====封杀某个明星=====");
        System.out.println("请输入要封杀的明星");
        String name = sc.next();

        for (Movie movie : movies) {
            if(movie.getActor().equals(name)){
                movies.remove(movie);
                System.out.println("封杀成功");
                return;
            }
        }
    }

    private void queryMovie() {
        System.out.println("=====查询电影=====");
        System.out.println("请输入电影名称");
        String name = sc.next();
        for (Movie movie : movies) {
            if(movie.getName().equals(name)){
                System.out.println(movie);
                return;
            }else {
                System.out.println("没有此电影");
            }
        }


    }

    public void addMovie(){
        System.out.println("=====添加电影=====");
        Movie movie = new Movie();
        System.out.println("请输入电影名称");
        movie.setName(sc.next());
        System.out.println("请输入电影评分");
         movie.setScore(sc.nextDouble());
        System.out.println("请输入电影主演");
         movie.setActor(sc.next());
        System.out.println("请输入电影价格");
        movie.setPrice(sc.nextDouble());
        movies.add(movie);
        System.out.println("添加成功");
    }
}
