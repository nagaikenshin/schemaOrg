package org.kyojo.schemaorg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n3.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n3.core.Container;
import org.kyojo.schemaorg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class BLOG_POST implements Container.BlogPost {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BlogPosting> blogPostingList;

	public BLOG_POST() {
	}

	public BLOG_POST(String string) {
		this(new BLOG_POSTING(string));
	}

	public String getString() {
		if(blogPostingList == null || blogPostingList.size() == 0 || blogPostingList.get(0) == null) {
			return null;
		} else {
			Name name = blogPostingList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(blogPostingList == null) {
			blogPostingList = new ArrayList<BlogPosting>();
		}
		if(blogPostingList.size() == 0) {
			blogPostingList.add(new BLOG_POSTING(string));
		} else {
			blogPostingList.set(0, new BLOG_POSTING(string));
		}
	}

	public BLOG_POST(BlogPosting blogPosting) {
		blogPostingList = new ArrayList<BlogPosting>();
		blogPostingList.add(blogPosting);
	}

	@Override
	public BlogPosting getBlogPosting() {
		if(blogPostingList != null && blogPostingList.size() > 0) {
			return blogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBlogPosting(BlogPosting blogPosting) {
		if(blogPostingList == null) {
			blogPostingList = new ArrayList<>();
		}
		if(blogPostingList.size() == 0) {
			blogPostingList.add(blogPosting);
		} else {
			blogPostingList.set(0, blogPosting);
		}
	}

	@Override
	public List<BlogPosting> getBlogPostingList() {
		return blogPostingList;
	}

	@Override
	public void setBlogPostingList(List<BlogPosting> blogPostingList) {
		this.blogPostingList = blogPostingList;
	}

	@Override
	public boolean hasBlogPosting() {
		return blogPostingList != null && blogPostingList.size() > 0 && blogPostingList.get(0) != null;
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
