package projects.nyinyihtunlwin.proofofconceptscreen.data.models;

import java.util.ArrayList;
import java.util.List;

import projects.nyinyihtunlwin.proofofconceptscreen.data.vo.MovieVO;
import projects.nyinyihtunlwin.proofofconceptscreen.network.MovieDataAgentImpl;
import projects.nyinyihtunlwin.proofofconceptscreen.utils.AppConstants;

/**
 * Created by Dell on 12/6/2017.
 */

public class MovieModel {

    private static MovieModel objectInstance;
    private int moviePageIndex = 1;

    private List<MovieVO> mMovies;

    private MovieModel() {
        mMovies = new ArrayList<>();
    }

    public static MovieModel getInstance() {
        if (objectInstance == null) {
            objectInstance = new MovieModel();
        }
        return objectInstance;
    }

    public void startLoadingPopularMovies() {
        MovieDataAgentImpl.getObjectInstance().loadPopularMovies(moviePageIndex, AppConstants.ACCESS_TOKEN);
    }
}