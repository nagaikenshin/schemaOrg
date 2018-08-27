package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.Article;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreativeWork;
import org.kyojo.schemaorg.m3n4.core.Clazz.URL;
import org.kyojo.schemaorg.m3n4.pending.Container;

public class DIVERSITY_STAFFING_REPORT implements Container.DiversityStaffingReport {

	private static final long serialVersionUID = 1L;

	public List<Article> articleList;
	public List<CreativeWork> creativeWorkList;
	public List<URL> urlList;

	public DIVERSITY_STAFFING_REPORT() {
	}

	public DIVERSITY_STAFFING_REPORT(String string) {
		this(new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
	}

	public String getString() {
		if(urlList == null || urlList.size() == 0 || urlList.get(0) == null) {
			return null;
		} else {
			return urlList.get(0).getString();
		}
	}

	public void setString(String string) {
		if(urlList == null) {
			urlList = new ArrayList<URL>();
		}
		if(urlList.size() == 0) {
			urlList.add(new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
		} else {
			urlList.set(0, new org.kyojo.schemaorg.m3n4.core.impl.URL(string));
		}
	}

	public DIVERSITY_STAFFING_REPORT(Article article) {
		articleList = new ArrayList<Article>();
		articleList.add(article);
	}

	@Override
	public Article getArticle() {
		if(articleList != null && articleList.size() > 0) {
			return articleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArticle(Article article) {
		if(articleList == null) {
			articleList = new ArrayList<>();
		}
		if(articleList.size() == 0) {
			articleList.add(article);
		} else {
			articleList.set(0, article);
		}
	}

	@Override
	public List<Article> getArticleList() {
		return articleList;
	}

	@Override
	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
	}

	@Override
	public boolean hasArticle() {
		return articleList != null && articleList.size() > 0 && articleList.get(0) != null;
	}

	public DIVERSITY_STAFFING_REPORT(CreativeWork creativeWork) {
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

	public DIVERSITY_STAFFING_REPORT(URL url) {
		urlList = new ArrayList<URL>();
		urlList.add(url);
	}

	@Override
	public URL getURL() {
		if(urlList != null && urlList.size() > 0) {
			return urlList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setURL(URL url) {
		if(urlList == null) {
			urlList = new ArrayList<>();
		}
		if(urlList.size() == 0) {
			urlList.add(url);
		} else {
			urlList.set(0, url);
		}
	}

	@Override
	public List<URL> getURLList() {
		return urlList;
	}

	@Override
	public void setURLList(List<URL> urlList) {
		this.urlList = urlList;
	}

	@Override
	public boolean hasURL() {
		return urlList != null && urlList.size() > 0 && urlList.get(0) != null;
	}

	public DIVERSITY_STAFFING_REPORT(List<Article> articleList,
			List<CreativeWork> creativeWorkList,
			List<URL> urlList) {
		setArticleList(articleList);
		setCreativeWorkList(creativeWorkList);
		setURLList(urlList);
	}

	public void copy(Container.DiversityStaffingReport org) {
		setArticleList(org.getArticleList());
		setCreativeWorkList(org.getCreativeWorkList());
		setURLList(org.getURLList());
	}

	@Override
	public String getNativeValue() {
		if(getURL() == null) return null;
		return getURL().getNativeValue();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
