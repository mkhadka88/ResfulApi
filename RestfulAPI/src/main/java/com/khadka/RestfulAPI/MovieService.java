package com.khadka.RestfulAPI;

public class MovieService {
private String status;

private MovieResponse data;

public MovieService() {
	super();
}

public MovieService(String status, MovieResponse data) {
	super();
	this.status = status;
	this.data = data;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public MovieResponse getData() {
	return data;
}

public void setData(MovieResponse data) {
	this.data = data;
}


}
