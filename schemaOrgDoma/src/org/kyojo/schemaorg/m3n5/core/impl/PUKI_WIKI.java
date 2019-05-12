package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container;

public class PUKI_WIKI implements Clazz.PukiWiki, Container.PukiWiki {

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
	public List<Clazz.PukiWiki> pukiWikiList;
	public String string;

	public PUKI_WIKI() {
	}

	public PUKI_WIKI(Long seq) {
		setSeq(seq);
	}

	public PUKI_WIKI(Clazz.PukiWiki pukiWiki) {
		pukiWikiList = new ArrayList<Clazz.PukiWiki>();
		pukiWikiList.add(pukiWiki);
	}

	@Override
	public PUKI_WIKI getPukiWiki() {
		Clazz.PukiWiki cls = null;
		if(pukiWikiList != null && pukiWikiList.size() > 0) {
			cls = pukiWikiList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		PUKI_WIKI impl = new PUKI_WIKI(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setPukiWiki(Clazz.PukiWiki pukiWiki) {
		if(pukiWikiList == null) {
			pukiWikiList = new ArrayList<>();
		}
		if(pukiWikiList.size() == 0) {
			pukiWikiList.add(pukiWiki);
		} else {
			pukiWikiList.set(0, pukiWiki);
		}
	}

	@Override
	public List<Clazz.PukiWiki> getPukiWikiList() {
		return pukiWikiList;
	}

	@Override
	public void setPukiWikiList(List<Clazz.PukiWiki> pukiWikiList) {
		this.pukiWikiList = pukiWikiList;
	}

	@Override
	public boolean hasPukiWiki() {
		return (pukiWikiList != null && pukiWikiList.size() > 0 && pukiWikiList.get(0) != null)
				|| string != null;
	}

	public PUKI_WIKI(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(pukiWikiList != null && pukiWikiList.size() > 0 && pukiWikiList.get(0) != null) {
			return pukiWikiList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public PUKI_WIKI(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.PukiWiki> pukiWikiList,
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
		setPukiWikiList(pukiWikiList);
		setString(string);
	}

	public void copy(Clazz.PukiWiki org) {
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

	public void copy(Container.PukiWiki org) {
		setPukiWikiList(org.getPukiWikiList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.PukiWiki.class.getAnnotation(SampleValue.class).value();
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
