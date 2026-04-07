package com.hh.demo;

import java.util.Scanner;

public class MovieOpertor
{
    private Movie[] movies;
    public MovieOpertor(Movie[] movies)
    {
        this.movies = movies;
    }

    // 打印所有电影信息
    public void printAllMovie()
    {
        System.out.println("所有电影信息如下：");
        System.out.println("编号\t电影名\t价格\t主演\t");
        for (int i = 0; i < movies.length; i++)
        {
            Movie movie = movies[i];
            System.out.println(movie.getId() + "\t" + movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getActor());
        }
    }
    // 根据id获取电影信息
    public Movie getMovieById()
    {
        System.out.println("请输入要查询的电影编号:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++)
        {
            Movie movie = movies[i];
            if (id == movie.getId())
            {
                System.out.println(movie.getId() + "\t" + movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getActor());
                return movie;
            }
        }
        System.out.println("没有此编号电影");
        return null;
    }
}
