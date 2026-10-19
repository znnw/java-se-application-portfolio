package demoZhiNengJiaJuXiTong;

import java.util.Scanner;
public class movieOperator {
    private movie[] movies;
    public movieOperator(movie[] movies){
        this.movies = movies;
    }
    public void printMovie(){
        for(int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getName());
            System.out.println(movies[i].getId());
            System.out.println(movies[i].getPrice());
            System.out.println(movies[i].getActor());
        }
    }
    public void searchMovieByid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的id");
        int id = sc.nextInt();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getId() == id){
                System.out.println(movies[i].getName());
                return;
            }
        }
    }

}
