package com.mb.api.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "movie_name")
	private String name;
	
	@Column(name = "movie_category")
	private String category;
	
	@Column(name = "actor")
	private String actor;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "banner_url")
	private String bannerUrl;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price")
	private Double price;
	
	public Movie() {}

	public Movie(Integer id, String name, String category, String actor, String director, String bannerUrl, String description, Double price)
	{
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.actor = actor;
		this.director = director;
		this.bannerUrl = bannerUrl;
		this.description = description;
		this.price = price;
	}

	public Integer getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getCategory()
	{
		return category;
	}

	public String getActor()
	{
		return actor;
	}

	public String getDirector()
	{
		return director;
	}

	public String getBannerUrl()
	{
		return bannerUrl;
	}

	public String getDescription()
	{
		return description;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public void setActor(String actor)
	{
		this.actor = actor;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}

	public void setBannerUrl(String bannerUrl)
	{
		this.bannerUrl = bannerUrl;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}
	
		
}
