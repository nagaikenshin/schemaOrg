package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.Barcode;
import org.kyojo.schemaorg.m3n5.core.Clazz.ImageObject;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class THUMBNAIL implements Container.Thumbnail {

	private static final long serialVersionUID = 1L;

	public List<Barcode> barcodeList;
	public List<ImageObject> imageObjectList;

	public THUMBNAIL() {
	}

	public THUMBNAIL(String string) {
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

	public THUMBNAIL(Barcode barcode) {
		barcodeList = new ArrayList<Barcode>();
		barcodeList.add(barcode);
	}

	@Override
	public Barcode getBarcode() {
		if(barcodeList != null && barcodeList.size() > 0) {
			return barcodeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBarcode(Barcode barcode) {
		if(barcodeList == null) {
			barcodeList = new ArrayList<>();
		}
		if(barcodeList.size() == 0) {
			barcodeList.add(barcode);
		} else {
			barcodeList.set(0, barcode);
		}
	}

	@Override
	public List<Barcode> getBarcodeList() {
		return barcodeList;
	}

	@Override
	public void setBarcodeList(List<Barcode> barcodeList) {
		this.barcodeList = barcodeList;
	}

	@Override
	public boolean hasBarcode() {
		return barcodeList != null && barcodeList.size() > 0 && barcodeList.get(0) != null;
	}

	public THUMBNAIL(ImageObject imageObject) {
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

	public THUMBNAIL(List<Barcode> barcodeList,
			List<ImageObject> imageObjectList) {
		setBarcodeList(barcodeList);
		setImageObjectList(imageObjectList);
	}

	public void copy(Container.Thumbnail org) {
		setBarcodeList(org.getBarcodeList());
		setImageObjectList(org.getImageObjectList());
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
