package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container;

public class MEDIA_WIKI implements Clazz.MediaWiki, Container.MediaWiki {

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
	public List<Clazz.MediaWiki> mediaWikiList;
	public String string;

	public MEDIA_WIKI() {
	}

	public MEDIA_WIKI(Long seq) {
		setSeq(seq);
	}

	public MEDIA_WIKI(Clazz.MediaWiki mediaWiki) {
		mediaWikiList = new ArrayList<Clazz.MediaWiki>();
		mediaWikiList.add(mediaWiki);
	}

	@Override
	public MEDIA_WIKI getMediaWiki() {
		Clazz.MediaWiki cls = null;
		if(mediaWikiList != null && mediaWikiList.size() > 0) {
			cls = mediaWikiList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		MEDIA_WIKI impl = new MEDIA_WIKI(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setMediaWiki(Clazz.MediaWiki mediaWiki) {
		if(mediaWikiList == null) {
			mediaWikiList = new ArrayList<>();
		}
		if(mediaWikiList.size() == 0) {
			mediaWikiList.add(mediaWiki);
		} else {
			mediaWikiList.set(0, mediaWiki);
		}
	}

	@Override
	public List<Clazz.MediaWiki> getMediaWikiList() {
		return mediaWikiList;
	}

	@Override
	public void setMediaWikiList(List<Clazz.MediaWiki> mediaWikiList) {
		this.mediaWikiList = mediaWikiList;
	}

	@Override
	public boolean hasMediaWiki() {
		return (mediaWikiList != null && mediaWikiList.size() > 0 && mediaWikiList.get(0) != null)
				|| string != null;
	}

	public MEDIA_WIKI(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(mediaWikiList != null && mediaWikiList.size() > 0 && mediaWikiList.get(0) != null) {
			return mediaWikiList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public MEDIA_WIKI(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.MediaWiki> mediaWikiList,
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
		setMediaWikiList(mediaWikiList);
		setString(string);
	}

	public void copy(Clazz.MediaWiki org) {
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

	public void copy(Container.MediaWiki org) {
		setMediaWikiList(org.getMediaWikiList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.MediaWiki.class.getAnnotation(SampleValue.class).value();
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
