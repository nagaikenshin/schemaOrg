package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.BlogPosting;
import org.kyojo.schemaorg.m3n5.core.Clazz.LiveBlogPosting;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class LIVE_BLOG_UPDATE implements Container.LiveBlogUpdate {

	private static final long serialVersionUID = 1L;

	public List<BlogPosting> blogPostingList;
	public List<LiveBlogPosting> liveBlogPostingList;

	public LIVE_BLOG_UPDATE() {
	}

	public LIVE_BLOG_UPDATE(String string) {
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

	public LIVE_BLOG_UPDATE(BlogPosting blogPosting) {
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

	public LIVE_BLOG_UPDATE(LiveBlogPosting liveBlogPosting) {
		liveBlogPostingList = new ArrayList<LiveBlogPosting>();
		liveBlogPostingList.add(liveBlogPosting);
	}

	@Override
	public LiveBlogPosting getLiveBlogPosting() {
		if(liveBlogPostingList != null && liveBlogPostingList.size() > 0) {
			return liveBlogPostingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiveBlogPosting(LiveBlogPosting liveBlogPosting) {
		if(liveBlogPostingList == null) {
			liveBlogPostingList = new ArrayList<>();
		}
		if(liveBlogPostingList.size() == 0) {
			liveBlogPostingList.add(liveBlogPosting);
		} else {
			liveBlogPostingList.set(0, liveBlogPosting);
		}
	}

	@Override
	public List<LiveBlogPosting> getLiveBlogPostingList() {
		return liveBlogPostingList;
	}

	@Override
	public void setLiveBlogPostingList(List<LiveBlogPosting> liveBlogPostingList) {
		this.liveBlogPostingList = liveBlogPostingList;
	}

	@Override
	public boolean hasLiveBlogPosting() {
		return liveBlogPostingList != null && liveBlogPostingList.size() > 0 && liveBlogPostingList.get(0) != null;
	}

	public LIVE_BLOG_UPDATE(List<BlogPosting> blogPostingList,
			List<LiveBlogPosting> liveBlogPostingList) {
		setBlogPostingList(blogPostingList);
		setLiveBlogPostingList(liveBlogPostingList);
	}

	public void copy(Container.LiveBlogUpdate org) {
		setBlogPostingList(org.getBlogPostingList());
		setLiveBlogPostingList(org.getLiveBlogPostingList());
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
