package demoZhiNengJiaJuXiTong;

public class Test {
    public static void main(String[] args) {
         movie[] movies = new movie[6];

         movies[0] = new movie("唐顿庄园1", 1,9.5,"Thispuseng");
         movies[1] = new movie("唐顿庄园2", 2,9.5,"Thispuseng");
         movies[2] = new movie("唐顿庄园3", 3,9.5,"Thispuseng");
         movies[3] = new movie("唐顿庄园4", 4,9.5,"Thispuseng");
         movies[4] = new movie("唐顿庄园5", 5,9.5,"Thispuseng");
         movies[5] = new movie("唐顿庄园6", 6,9.5,"Thispuseng");
         movieOperator mo = new movieOperator(movies);
         mo.printMovie();
         mo.searchMovieByid();

    }
}