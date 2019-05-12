package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.Address;
import org.kyojo.schemaorg.m3n5.core.Container.AddressCountry;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Box;
import org.kyojo.schemaorg.m3n5.core.Container.Circle;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.Elevation;
import org.kyojo.schemaorg.m3n5.core.Container.GeoMidpoint;
import org.kyojo.schemaorg.m3n5.core.Container.GeoRadius;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.Line;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Polygon;
import org.kyojo.schemaorg.m3n5.core.Container.PostalCode;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;

public class GEO_CIRCLE implements Clazz.GeoCircle {

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
	public GeoMidpoint geoMidpoint;
	public GeoRadius geoRadius;
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
	public SubjectOf subjectOf;
	public Url url;

	public GEO_CIRCLE() {
	}

	public GEO_CIRCLE(Long seq) {
		setSeq(seq);
	}

	public GEO_CIRCLE(String string) {
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

	public GEO_CIRCLE(AdditionalType additionalType) {
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

	public GEO_CIRCLE(Address address) {
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

	public GEO_CIRCLE(AddressCountry addressCountry) {
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

	public GEO_CIRCLE(AlternateName alternateName) {
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

	public GEO_CIRCLE(Box box) {
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

	public GEO_CIRCLE(Circle circle) {
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

	public GEO_CIRCLE(Description description) {
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

	public GEO_CIRCLE(DisambiguatingDescription disambiguatingDescription) {
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

	public GEO_CIRCLE(Elevation elevation) {
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

	public GEO_CIRCLE(GeoMidpoint geoMidpoint) {
		setGeoMidpoint(geoMidpoint);
	}

	@Override
	public GeoMidpoint getGeoMidpoint() {
		return geoMidpoint;
	}

	@Override
	public void setGeoMidpoint(GeoMidpoint geoMidpoint) {
		this.geoMidpoint = geoMidpoint;
	}

	public GEO_CIRCLE(GeoRadius geoRadius) {
		setGeoRadius(geoRadius);
	}

	@Override
	public GeoRadius getGeoRadius() {
		return geoRadius;
	}

	@Override
	public void setGeoRadius(GeoRadius geoRadius) {
		this.geoRadius = geoRadius;
	}

	public GEO_CIRCLE(Identifier identifier) {
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

	public GEO_CIRCLE(Image image) {
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

	public GEO_CIRCLE(Line line) {
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

	public GEO_CIRCLE(MainEntityOfPage mainEntityOfPage) {
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

	public GEO_CIRCLE(Name name) {
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

	public GEO_CIRCLE(NameFuzzy nameFuzzy) {
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

	public GEO_CIRCLE(NameRuby nameRuby) {
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

	public GEO_CIRCLE(Polygon polygon) {
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

	public GEO_CIRCLE(PostalCode postalCode) {
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

	public GEO_CIRCLE(PotentialAction potentialAction) {
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

	public GEO_CIRCLE(SameAs sameAs) {
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

	public GEO_CIRCLE(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public GEO_CIRCLE(Url url) {
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

	public void copy(Clazz.GeoCircle org) {
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
		setGeoMidpoint(org.getGeoMidpoint());
		setGeoRadius(org.getGeoRadius());
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
		setSubjectOf(org.getSubjectOf());
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
