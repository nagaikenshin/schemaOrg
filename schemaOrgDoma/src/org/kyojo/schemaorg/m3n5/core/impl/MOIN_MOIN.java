package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container;

public class MOIN_MOIN implements Clazz.MoinMoin, Container.MoinMoin {

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
	public List<Clazz.MoinMoin> moinMoinList;
	public String string;

	public MOIN_MOIN() {
	}

	public MOIN_MOIN(Long seq) {
		setSeq(seq);
	}

	public MOIN_MOIN(Clazz.MoinMoin moinMoin) {
		moinMoinList = new ArrayList<Clazz.MoinMoin>();
		moinMoinList.add(moinMoin);
	}

	@Override
	public MOIN_MOIN getMoinMoin() {
		Clazz.MoinMoin cls = null;
		if(moinMoinList != null && moinMoinList.size() > 0) {
			cls = moinMoinList.get(0);
		}
		if(cls == null && string == null) {
			return null;
		}

		MOIN_MOIN impl = new MOIN_MOIN(string);
		if(cls != null) {
			impl.copy(cls);
		}
		return impl;
	}

	@Override
	public void setMoinMoin(Clazz.MoinMoin moinMoin) {
		if(moinMoinList == null) {
			moinMoinList = new ArrayList<>();
		}
		if(moinMoinList.size() == 0) {
			moinMoinList.add(moinMoin);
		} else {
			moinMoinList.set(0, moinMoin);
		}
	}

	@Override
	public List<Clazz.MoinMoin> getMoinMoinList() {
		return moinMoinList;
	}

	@Override
	public void setMoinMoinList(List<Clazz.MoinMoin> moinMoinList) {
		this.moinMoinList = moinMoinList;
	}

	@Override
	public boolean hasMoinMoin() {
		return (moinMoinList != null && moinMoinList.size() > 0 && moinMoinList.get(0) != null)
				|| string != null;
	}

	public MOIN_MOIN(String string) {
		setString(string);
	}

	public String getString() {
		if(string != null) {
			return string;
		} else if(moinMoinList != null && moinMoinList.size() > 0 && moinMoinList.get(0) != null) {
			return moinMoinList.get(0).getString();
		} else {
			return null;
		}
	}

	@Override
	public void setString(String string) {
		this.string = string;
	}

	public MOIN_MOIN(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			List<Clazz.MoinMoin> moinMoinList,
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
		setMoinMoinList(moinMoinList);
		setString(string);
	}

	public void copy(Clazz.MoinMoin org) {
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

	public void copy(Container.MoinMoin org) {
		setMoinMoinList(org.getMoinMoinList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String value() {
		return Clazz.MoinMoin.class.getAnnotation(SampleValue.class).value();
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
