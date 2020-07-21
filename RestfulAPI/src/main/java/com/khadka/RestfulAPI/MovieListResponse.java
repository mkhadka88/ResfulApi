package com.khadka.RestfulAPI;

import java.util.List;

public class MovieListResponse {
private String status;
private List<MovieResponse> data;
public MovieListResponse() {
	super();
	
}
public MovieListResponse(String status, List<MovieResponse> data) {
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
public List<MovieResponse> getData() {
	return data;
}
public void setData(List<MovieResponse> data) {
	this.data = data;
}


}
