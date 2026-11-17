package com.hh.demo;

public class Test
{
    public static void main(String[] args)
    {
        //完成面向对象综合案例
        //1.设计电影类Movie
        //2.封装系统中的电影数据
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "唐顿庄园", 9.5, "罗宾·怀特");
        movies[1] = new Movie(2,"泰坦尼克号",9.6,"莱昂纳多·迪卡普里奥");
        movies[2] = new Movie(3,"星际穿越",9.7,"阿森纳·莫娜·莱普ziggy");
        movies[3] = new Movie(4,"速度与激情8",9.8,"瑞秋·米勒");
        movies[4] = new Movie(5,"夏洛特烦恼",9.9,"沈腾");
        movies[5] = new Movie(6,"蝙蝠侠",9.0,"罗bert· Downey Jr.");

        //3.创建电影操作对象
        MovieOpertor mo = new MovieOpertor(movies);
        mo.printAllMovie();
        mo.getMovieById();


    }
}
