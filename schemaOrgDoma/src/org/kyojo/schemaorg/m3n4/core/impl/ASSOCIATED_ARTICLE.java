package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class ASSOCIATED_ARTICLE implements Container.AssociatedArticle {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<NewsArticle> newsArticleList;

	public ASSOCIATED_ARTICLE() {
	}

	public ASSOCIATED_ARTICLE(String string) {
		this(new NEWS_ARTICLE(string));
	}

	public String getString() {
		if(newsArticleList == null || newsArticleList.size() == 0 || newsArticleList.get(0) == null) {
			return null;
		} else {
			Name name = newsArticleList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<NewsArticle>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(new NEWS_ARTICLE(string));
		} else {
			newsArticleList.set(0, new NEWS_ARTICLE(string));
		}
	}

	public ASSOCIATED_ARTICLE(NewsArticle newsArticle) {
		newsArticleList = new ArrayList<NewsArticle>();
		newsArticleList.add(newsArticle);
	}

	@Override
	public NewsArticle getNewsArticle() {
		if(newsArticleList != null && newsArticleList.size() > 0) {
			return newsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewsArticle(NewsArticle newsArticle) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(newsArticle);
		} else {
			newsArticleList.set(0, newsArticle);
		}
	}

	@Override
	public List<NewsArticle> getNewsArticleList() {
		return newsArticleList;
	}

	@Override
	public void setNewsArticleList(List<NewsArticle> newsArticleList) {
		this.newsArticleList = newsArticleList;
	}

	@Override
	public boolean hasNewsArticle() {
		return newsArticleList != null && newsArticleList.size() > 0 && newsArticleList.get(0) != null;
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
