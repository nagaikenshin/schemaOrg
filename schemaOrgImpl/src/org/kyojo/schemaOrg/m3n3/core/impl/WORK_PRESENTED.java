package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n3.core.Clazz.Movie;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

public class WORK_PRESENTED implements Container.WorkPresented {

	private static final long serialVersionUID = 1L;

	public List<CreativeWork> creativeWorkList;
	public List<Movie> movieList;

	public WORK_PRESENTED() {
	}

	public WORK_PRESENTED(String string) {
		this(new CREATIVE_WORK(string));
	}

	public String getString() {
		if(creativeWorkList == null || creativeWorkList.size() == 0 || creativeWorkList.get(0) == null) {
			return null;
		} else {
			Name name = creativeWorkList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<CreativeWork>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(new CREATIVE_WORK(string));
		} else {
			creativeWorkList.set(0, new CREATIVE_WORK(string));
		}
	}

	public WORK_PRESENTED(CreativeWork creativeWork) {
		creativeWorkList = new ArrayList<CreativeWork>();
		creativeWorkList.add(creativeWork);
	}

	@Override
	public CreativeWork getCreativeWork() {
		if(creativeWorkList != null && creativeWorkList.size() > 0) {
			return creativeWorkList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreativeWork(CreativeWork creativeWork) {
		if(creativeWorkList == null) {
			creativeWorkList = new ArrayList<>();
		}
		if(creativeWorkList.size() == 0) {
			creativeWorkList.add(creativeWork);
		} else {
			creativeWorkList.set(0, creativeWork);
		}
	}

	@Override
	public List<CreativeWork> getCreativeWorkList() {
		return creativeWorkList;
	}

	@Override
	public void setCreativeWorkList(List<CreativeWork> creativeWorkList) {
		this.creativeWorkList = creativeWorkList;
	}

	@Override
	public boolean hasCreativeWork() {
		return creativeWorkList != null && creativeWorkList.size() > 0 && creativeWorkList.get(0) != null;
	}

	public WORK_PRESENTED(Movie movie) {
		movieList = new ArrayList<Movie>();
		movieList.add(movie);
	}

	@Override
	public Movie getMovie() {
		if(movieList != null && movieList.size() > 0) {
			return movieList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMovie(Movie movie) {
		if(movieList == null) {
			movieList = new ArrayList<>();
		}
		if(movieList.size() == 0) {
			movieList.add(movie);
		} else {
			movieList.set(0, movie);
		}
	}

	@Override
	public List<Movie> getMovieList() {
		return movieList;
	}

	@Override
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	@Override
	public boolean hasMovie() {
		return movieList != null && movieList.size() > 0 && movieList.get(0) != null;
	}

	public WORK_PRESENTED(List<CreativeWork> creativeWorkList,
			List<Movie> movieList) {
		setCreativeWorkList(creativeWorkList);
		setMovieList(movieList);
	}

	public void copy(Container.WorkPresented org) {
		setCreativeWorkList(org.getCreativeWorkList());
		setMovieList(org.getMovieList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
