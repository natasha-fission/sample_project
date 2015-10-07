package com.fission.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.fission.beans.Movie;

public class MovieDAOImpl implements MovieDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addMovie(Movie m) {
		System.out.println("in add movie");
		Session session = this.sessionFactory.openSession();
		session.persist(m);
		
	}

	@Override
	public void updateMovie(Movie m) {
		Session session = this.sessionFactory.openSession();
		session.update(m);
		
	}

	@Override
	public List<Movie> listMovies() {
		Session session = this.sessionFactory.openSession();
		List<Movie> MList = session.createQuery("from Movie").list();
		
		return MList;
	}

	@Override
	public Movie getMovieById(int id) {
		Session session = this.sessionFactory.openSession();
		Movie m = (Movie) session.load(Movie.class, new Integer(id));
		
		return m;
	}

	@Override
	public void removeMovie(int id) {
		Session session = this.sessionFactory.openSession();
		Movie m = (Movie) session.load(Movie.class, new Integer(id));
		if(null != m){
			session.delete(m);
		}
	}

}
