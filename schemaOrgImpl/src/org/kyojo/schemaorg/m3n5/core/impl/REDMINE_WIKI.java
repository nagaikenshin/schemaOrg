package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container;

public class REDMINE_WIKI implements Clazz.RedmineWiki, Container.RedmineWiki {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public List<Clazz.RedmineWiki> redmineWikiList;
	public String string;

	public REDMINE_WIKI() {
	}

	public REDMINE_WIKI(Long seq) {
		setSeq(seq);
	}

	public REDMINE_WIKI(Clazz.RedmineWiki redmineWiki) {
		redmineWikiList = new ArrayList<Clazz.RedmineWiki>();
		redmineWikiList.add(redmineWiki);
	}

	@Override
	public REDMINE_WIKI getRedmineWiki() {
		Clazz.RedmineWiki cls = null;
		if(redmineWikiList != null && redmineWikiList.size() > 0) {
			cls = redmineWikiList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		REDMINE_WIKI impl = new REDMINE_WIKI(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setRedmineWiki(Clazz.RedmineWiki redmineWiki) {
		if(redmineWikiList == null) {
			redmineWikiList = new ArrayList<>();
		}
		if(redmineWikiList.size() == 0) {
			redmineWikiList.add(redmineWiki);
		} else {
			redmineWikiList.set(0, redmineWiki);
		}
	}

	@Override
	public List<Clazz.RedmineWiki> getRedmineWikiList() {
		return redmineWikiList;
	}

	@Override
	public void setRedmineWikiList(List<Clazz.RedmineWiki> redmineWikiList) {
		this.redmineWikiList = redmineWikiList;
	}

	@Override
	public boolean hasRedmineWiki() {
		return (redmineWikiList != null && redmineWikiList.size() > 0 && redmineWikiList.get(0) != null)
				|| string != null;
	}

	public REDMINE_WIKI(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(redmineWikiList != null && redmineWikiList.size() > 0 && redmineWikiList.get(0) != null) {
			return redmineWikiList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public REDMINE_WIKI(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.RedmineWiki> redmineWikiList,
			String string) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setRedmineWikiList(redmineWikiList);
		setString(string);
	}

	public void copy(Clazz.RedmineWiki org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setString(org.getString());
	}

	public void copy(Container.RedmineWiki org) {
		setRedmineWikiList(org.getRedmineWikiList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.RedmineWiki.class.getAnnotation(SampleValue.class).value();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
