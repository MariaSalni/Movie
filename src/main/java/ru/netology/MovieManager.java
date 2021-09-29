package ru.netology;

public class MovieManager {

    private int defaultMovieLength = 10;



    private MovieManager[] items = new MovieManager[0];

    public void add (MovieManager item) {
        int length = items.length + 1;
        MovieManager[] tmp = new MovieManager[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieManager[] findAll () { return items;}

    //public void getById (int id) {
        //int length = items.length - 1;
       // MovieManager[] tmp = new MovieManager[length];
        //int index = 0;
        //for (MovieManager item : items) {
         //   if (item.getId() != id) {
         //       tmp[index] = item;
         //       index ++;
        //    }
        //}
        //items = tmp;
    //}

    public MovieManager[] getLastAdd() {
        int moviesLength = items.length;
        if (moviesLength < defaultMovieLength) {
            defaultMovieLength = moviesLength;
        }
        MovieManager[] customFilm = new MovieManager[defaultMovieLength];
        for (int i = 0; i < customFilm.length; i++) {
            int result = moviesLength - i - 1;
            customFilm[i] = items[result];

        }
        return customFilm;
    }


}
