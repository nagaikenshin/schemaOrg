package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookFormatType;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class BOOK_FORMAT implements Container.BookFormat {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<BookFormatType> bookFormatTypeList;

	public BOOK_FORMAT() {
	}

	public BOOK_FORMAT(String string) {
		this(new BOOK_FORMAT_TYPE(string));
	}

	public String getString() {
		if(bookFormatTypeList == null || bookFormatTypeList.size() == 0 || bookFormatTypeList.get(0) == null) {
			return null;
		} else {
			Name name = bookFormatTypeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(bookFormatTypeList == null) {
			bookFormatTypeList = new ArrayList<BookFormatType>();
		}
		if(bookFormatTypeList.size() == 0) {
			bookFormatTypeList.add(new BOOK_FORMAT_TYPE(string));
		} else {
			bookFormatTypeList.set(0, new BOOK_FORMAT_TYPE(string));
		}
	}

	public BOOK_FORMAT(BookFormatType bookFormatType) {
		bookFormatTypeList = new ArrayList<BookFormatType>();
		bookFormatTypeList.add(bookFormatType);
	}

	@Override
	public BookFormatType getBookFormatType() {
		if(bookFormatTypeList != null && bookFormatTypeList.size() > 0) {
			return bookFormatTypeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookFormatType(BookFormatType bookFormatType) {
		if(bookFormatTypeList == null) {
			bookFormatTypeList = new ArrayList<>();
		}
		if(bookFormatTypeList.size() == 0) {
			bookFormatTypeList.add(bookFormatType);
		} else {
			bookFormatTypeList.set(0, bookFormatType);
		}
	}

	@Override
	public List<BookFormatType> getBookFormatTypeList() {
		return bookFormatTypeList;
	}

	@Override
	public void setBookFormatTypeList(List<BookFormatType> bookFormatTypeList) {
		this.bookFormatTypeList = bookFormatTypeList;
	}

	@Override
	public boolean hasBookFormatType() {
		return bookFormatTypeList != null && bookFormatTypeList.size() > 0 && bookFormatTypeList.get(0) != null;
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
