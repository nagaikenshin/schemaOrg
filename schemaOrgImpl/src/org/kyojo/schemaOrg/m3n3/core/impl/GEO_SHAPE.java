package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.Address;
import org.kyojo.schemaOrg.m3n3.core.Container.AddressCountry;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Box;
import org.kyojo.schemaOrg.m3n3.core.Container.Circle;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.Elevation;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.Line;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.Polygon;
import org.kyojo.schemaOrg.m3n3.core.Container.PostalCode;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class GEO_SHAPE implements Clazz.GeoShape {

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
	public AdditionalType additionalType;
	public Address address;
	public AddressCountry addressCountry;
	public AlternateName alternateName;
	public Box box;
	public Circle circle;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Elevation elevation;
	public Identifier identifier;
	public Image image;
	public Line line;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Polygon polygon;
	public PostalCode postalCode;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public Url url;

	public GEO_SHAPE() {
	}

	public GEO_SHAPE(Long seq) {
		setSeq(seq);
	}

	public GEO_SHAPE(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public GEO_SHAPE(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public GEO_SHAPE(Address address) {
		setAddress(address);
	}

	@Override
	public Address getAddress() {
		return address;
	}

	@Override
	public void setAddress(Address address) {
		this.address = address;
	}

	public GEO_SHAPE(AddressCountry addressCountry) {
		setAddressCountry(addressCountry);
	}

	@Override
	public AddressCountry getAddressCountry() {
		return addressCountry;
	}

	@Override
	public void setAddressCountry(AddressCountry addressCountry) {
		this.addressCountry = addressCountry;
	}

	public GEO_SHAPE(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public GEO_SHAPE(Box box) {
		setBox(box);
	}

	@Override
	public Box getBox() {
		return box;
	}

	@Override
	public void setBox(Box box) {
		this.box = box;
	}

	public GEO_SHAPE(Circle circle) {
		setCircle(circle);
	}

	@Override
	public Circle getCircle() {
		return circle;
	}

	@Override
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public GEO_SHAPE(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public GEO_SHAPE(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public GEO_SHAPE(Elevation elevation) {
		setElevation(elevation);
	}

	@Override
	public Elevation getElevation() {
		return elevation;
	}

	@Override
	public void setElevation(Elevation elevation) {
		this.elevation = elevation;
	}

	public GEO_SHAPE(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public GEO_SHAPE(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public GEO_SHAPE(Line line) {
		setLine(line);
	}

	@Override
	public Line getLine() {
		return line;
	}

	@Override
	public void setLine(Line line) {
		this.line = line;
	}

	public GEO_SHAPE(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public GEO_SHAPE(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public GEO_SHAPE(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public GEO_SHAPE(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public GEO_SHAPE(Polygon polygon) {
		setPolygon(polygon);
	}

	@Override
	public Polygon getPolygon() {
		return polygon;
	}

	@Override
	public void setPolygon(Polygon polygon) {
		this.polygon = polygon;
	}

	public GEO_SHAPE(PostalCode postalCode) {
		setPostalCode(postalCode);
	}

	@Override
	public PostalCode getPostalCode() {
		return postalCode;
	}

	@Override
	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	public GEO_SHAPE(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public GEO_SHAPE(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public GEO_SHAPE(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public GEO_SHAPE(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			Address address,
			AddressCountry addressCountry,
			AlternateName alternateName,
			Box box,
			Circle circle,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Elevation elevation,
			Identifier identifier,
			Image image,
			Line line,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Polygon polygon,
			PostalCode postalCode,
			PotentialAction potentialAction,
			SameAs sameAs,
			Url url) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAdditionalType(additionalType);
		setAddress(address);
		setAddressCountry(addressCountry);
		setAlternateName(alternateName);
		setBox(box);
		setCircle(circle);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setElevation(elevation);
		setIdentifier(identifier);
		setImage(image);
		setLine(line);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPolygon(polygon);
		setPostalCode(postalCode);
		setPotentialAction(potentialAction);
		setSameAs(sameAs);
		setUrl(url);
	}

	public void copy(Clazz.GeoShape org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAdditionalType(org.getAdditionalType());
		setAddress(org.getAddress());
		setAddressCountry(org.getAddressCountry());
		setAlternateName(org.getAlternateName());
		setBox(org.getBox());
		setCircle(org.getCircle());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setElevation(org.getElevation());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setLine(org.getLine());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPolygon(org.getPolygon());
		setPostalCode(org.getPostalCode());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
		setUrl(org.getUrl());
	}

	@Override
	public String getNativeValue() {
		return getString();
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
