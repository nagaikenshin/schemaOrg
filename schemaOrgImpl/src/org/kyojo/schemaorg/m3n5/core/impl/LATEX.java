package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container;

public class LATEX implements Clazz.LaTeX, Container.LaTeX {

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
	public List<Clazz.LaTeX> latexList;
	public String string;

	public LATEX() {
	}

	public LATEX(Long seq) {
		setSeq(seq);
	}

	public LATEX(Clazz.LaTeX latex) {
		latexList = new ArrayList<Clazz.LaTeX>();
		latexList.add(latex);
	}

	@Override
	public LATEX getLaTeX() {
		Clazz.LaTeX cls = null;
		if(latexList != null && latexList.size() > 0) {
			cls = latexList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		LATEX impl = new LATEX(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setLaTeX(Clazz.LaTeX latex) {
		if(latexList == null) {
			latexList = new ArrayList<>();
		}
		if(latexList.size() == 0) {
			latexList.add(latex);
		} else {
			latexList.set(0, latex);
		}
	}

	@Override
	public List<Clazz.LaTeX> getLaTeXList() {
		return latexList;
	}

	@Override
	public void setLaTeXList(List<Clazz.LaTeX> latexList) {
		this.latexList = latexList;
	}

	@Override
	public boolean hasLaTeX() {
		return (latexList != null && latexList.size() > 0 && latexList.get(0) != null)
				|| string != null;
	}

	public LATEX(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(latexList != null && latexList.size() > 0 && latexList.get(0) != null) {
			return latexList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public LATEX(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.LaTeX> latexList,
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
		setLaTeXList(latexList);
		setString(string);
	}

	public void copy(Clazz.LaTeX org) {
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

	public void copy(Container.LaTeX org) {
		setLaTeXList(org.getLaTeXList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.LaTeX.class.getAnnotation(SampleValue.class).value();
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
