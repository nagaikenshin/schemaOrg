package org.kyojo.schemaOrg.m3n3.healthLifesci.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ImageObject;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.impl.IMAGE_OBJECT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container;

import org.seasar.doma.Transient;

public class DIAGRAM implements Container.Diagram {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<ImageObject> imageObjectList;

	public DIAGRAM() {
	}

	public DIAGRAM(String string) {
		this(new IMAGE_OBJECT(string));
	}

	public String getString() {
		if(imageObjectList == null || imageObjectList.size() == 0 || imageObjectList.get(0) == null) {
			return null;
		} else {
			Name name = imageObjectList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(imageObjectList == null) {
			imageObjectList = new ArrayList<ImageObject>();
		}
		if(imageObjectList.size() == 0) {
			imageObjectList.add(new IMAGE_OBJECT(string));
		} else {
			imageObjectList.set(0, new IMAGE_OBJECT(string));
		}
	}

	public DIAGRAM(ImageObject imageObject) {
		imageObjectList = new ArrayList<ImageObject>();
		imageObjectList.add(imageObject);
	}

	@Override
	public ImageObject getImageObject() {
		if(imageObjectList != null && imageObjectList.size() > 0) {
			return imageObjectList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setImageObject(ImageObject imageObject) {
		if(imageObjectList == null) {
			imageObjectList = new ArrayList<>();
		}
		if(imageObjectList.size() == 0) {
			imageObjectList.add(imageObject);
		} else {
			imageObjectList.set(0, imageObject);
		}
	}

	@Override
	public List<ImageObject> getImageObjectList() {
		return imageObjectList;
	}

	@Override
	public void setImageObjectList(List<ImageObject> imageObjectList) {
		this.imageObjectList = imageObjectList;
	}

	@Override
	public boolean hasImageObject() {
		return imageObjectList != null && imageObjectList.size() > 0 && imageObjectList.get(0) != null;
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
