package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container;

public class HTML implements Clazz.HTML, Container.Html {

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
	public List<Clazz.HTML> htmlList;
	public String string;

	public HTML() {
	}

	public HTML(Long seq) {
		setSeq(seq);
	}

	public HTML(Clazz.HTML html) {
		htmlList = new ArrayList<Clazz.HTML>();
		htmlList.add(html);
	}

	@Override
	public HTML getHTML() {
		Clazz.HTML cls = null;
		if(htmlList != null && htmlList.size() > 0) {
			cls = htmlList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		HTML impl = new HTML(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setHTML(Clazz.HTML html) {
		if(htmlList == null) {
			htmlList = new ArrayList<>();
		}
		if(htmlList.size() == 0) {
			htmlList.add(html);
		} else {
			htmlList.set(0, html);
		}
	}

	@Override
	public List<Clazz.HTML> getHTMLList() {
		return htmlList;
	}

	@Override
	public void setHTMLList(List<Clazz.HTML> htmlList) {
		this.htmlList = htmlList;
	}

	@Override
	public boolean hasHTML() {
		return (htmlList != null && htmlList.size() > 0 && htmlList.get(0) != null)
				|| string != null;
	}

	public HTML(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(htmlList != null && htmlList.size() > 0 && htmlList.get(0) != null) {
			return htmlList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public HTML(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.HTML> htmlList,
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
		setHTMLList(htmlList);
		setString(string);
	}

	public void copy(Clazz.HTML org) {
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

	public void copy(Container.Html org) {
		setHTMLList(org.getHTMLList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.HTML.class.getAnnotation(SampleValue.class).value();
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
