package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Comment;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Thing;
import org.kyojo.schemaOrg.m3n3.core.Container;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;

import org.seasar.doma.Transient;

public class RESULT_COMMENT implements Container.ResultComment {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<Comment> commentList;
	@Transient
	public List<Thing> thingList;

	public RESULT_COMMENT() {
	}

	public RESULT_COMMENT(String string) {
		this(new COMMENT(string));
	}

	public String getString() {
		if(commentList == null || commentList.size() == 0 || commentList.get(0) == null) {
			return null;
		} else {
			Name name = commentList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(commentList == null) {
			commentList = new ArrayList<Comment>();
		}
		if(commentList.size() == 0) {
			commentList.add(new COMMENT(string));
		} else {
			commentList.set(0, new COMMENT(string));
		}
	}

	public RESULT_COMMENT(Comment comment) {
		commentList = new ArrayList<Comment>();
		commentList.add(comment);
	}

	@Override
	public Comment getComment() {
		if(commentList != null && commentList.size() > 0) {
			return commentList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComment(Comment comment) {
		if(commentList == null) {
			commentList = new ArrayList<>();
		}
		if(commentList.size() == 0) {
			commentList.add(comment);
		} else {
			commentList.set(0, comment);
		}
	}

	@Override
	public List<Comment> getCommentList() {
		return commentList;
	}

	@Override
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	@Override
	public boolean hasComment() {
		return commentList != null && commentList.size() > 0 && commentList.get(0) != null;
	}

	public RESULT_COMMENT(Thing thing) {
		thingList = new ArrayList<Thing>();
		thingList.add(thing);
	}

	@Override
	public Thing getThing() {
		if(thingList != null && thingList.size() > 0) {
			return thingList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setThing(Thing thing) {
		if(thingList == null) {
			thingList = new ArrayList<>();
		}
		if(thingList.size() == 0) {
			thingList.add(thing);
		} else {
			thingList.set(0, thing);
		}
	}

	@Override
	public List<Thing> getThingList() {
		return thingList;
	}

	@Override
	public void setThingList(List<Thing> thingList) {
		this.thingList = thingList;
	}

	@Override
	public boolean hasThing() {
		return thingList != null && thingList.size() > 0 && thingList.get(0) != null;
	}

	public RESULT_COMMENT(List<Comment> commentList,
			List<Thing> thingList) {
		setCommentList(commentList);
		setThingList(thingList);
	}

	public void copy(Container.ResultComment org) {
		setCommentList(org.getCommentList());
		setThingList(org.getThingList());
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
