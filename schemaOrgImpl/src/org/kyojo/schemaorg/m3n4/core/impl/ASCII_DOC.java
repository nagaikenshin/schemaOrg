package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container;

public class ASCII_DOC implements Clazz.AsciiDoc, Container.AsciiDoc {

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
	public List<Clazz.AsciiDoc> asciiDocList;
	public String string;

	public ASCII_DOC() {
	}

	public ASCII_DOC(Long seq) {
		setSeq(seq);
	}

	public ASCII_DOC(Clazz.AsciiDoc asciiDoc) {
		asciiDocList = new ArrayList<Clazz.AsciiDoc>();
		asciiDocList.add(asciiDoc);
	}

	@Override
	public ASCII_DOC getAsciiDoc() {
		Clazz.AsciiDoc cls = null;
		if(asciiDocList != null && asciiDocList.size() > 0) {
			cls = asciiDocList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		ASCII_DOC impl = new ASCII_DOC(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setAsciiDoc(Clazz.AsciiDoc asciiDoc) {
		if(asciiDocList == null) {
			asciiDocList = new ArrayList<>();
		}
		if(asciiDocList.size() == 0) {
			asciiDocList.add(asciiDoc);
		} else {
			asciiDocList.set(0, asciiDoc);
		}
	}

	@Override
	public List<Clazz.AsciiDoc> getAsciiDocList() {
		return asciiDocList;
	}

	@Override
	public void setAsciiDocList(List<Clazz.AsciiDoc> asciiDocList) {
		this.asciiDocList = asciiDocList;
	}

	@Override
	public boolean hasAsciiDoc() {
		return (asciiDocList != null && asciiDocList.size() > 0 && asciiDocList.get(0) != null)
				|| string != null;
	}

	public ASCII_DOC(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(asciiDocList != null && asciiDocList.size() > 0 && asciiDocList.get(0) != null) {
			return asciiDocList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public ASCII_DOC(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.AsciiDoc> asciiDocList,
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
		setAsciiDocList(asciiDocList);
		setString(string);
	}

	public void copy(Clazz.AsciiDoc org) {
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

	public void copy(Container.AsciiDoc org) {
		setAsciiDocList(org.getAsciiDocList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.AsciiDoc.class.getAnnotation(SampleValue.class).value();
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
