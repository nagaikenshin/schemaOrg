package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AfterMedia;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.BeforeMedia;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.DuringMedia;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.Item;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.NextItem;
import org.kyojo.schemaOrg.m3n3.core.Container.PerformTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Position;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.PrepTime;
import org.kyojo.schemaOrg.m3n3.core.Container.PreviousItem;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Supply;
import org.kyojo.schemaOrg.m3n3.core.Container.Tool;
import org.kyojo.schemaOrg.m3n3.core.Container.TotalTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class HOW_TO_DIRECTION implements Clazz.HowToDirection {

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
	public AfterMedia afterMedia;
	public AlternateName alternateName;
	public BeforeMedia beforeMedia;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public DuringMedia duringMedia;
	public Identifier identifier;
	public Image image;
	public Item item;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public NextItem nextItem;
	public PerformTime performTime;
	public Position position;
	public PotentialAction potentialAction;
	public PrepTime prepTime;
	public PreviousItem previousItem;
	public SameAs sameAs;
	public Supply supply;
	public Tool tool;
	public TotalTime totalTime;
	public Url url;

	public HOW_TO_DIRECTION() {
	}

	public HOW_TO_DIRECTION(Long seq) {
		setSeq(seq);
	}

	public HOW_TO_DIRECTION(String string) {
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

	public HOW_TO_DIRECTION(AdditionalType additionalType) {
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

	public HOW_TO_DIRECTION(AfterMedia afterMedia) {
		setAfterMedia(afterMedia);
	}

	@Override
	public AfterMedia getAfterMedia() {
		return afterMedia;
	}

	@Override
	public void setAfterMedia(AfterMedia afterMedia) {
		this.afterMedia = afterMedia;
	}

	public HOW_TO_DIRECTION(AlternateName alternateName) {
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

	public HOW_TO_DIRECTION(BeforeMedia beforeMedia) {
		setBeforeMedia(beforeMedia);
	}

	@Override
	public BeforeMedia getBeforeMedia() {
		return beforeMedia;
	}

	@Override
	public void setBeforeMedia(BeforeMedia beforeMedia) {
		this.beforeMedia = beforeMedia;
	}

	public HOW_TO_DIRECTION(Description description) {
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

	public HOW_TO_DIRECTION(DisambiguatingDescription disambiguatingDescription) {
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

	public HOW_TO_DIRECTION(DuringMedia duringMedia) {
		setDuringMedia(duringMedia);
	}

	@Override
	public DuringMedia getDuringMedia() {
		return duringMedia;
	}

	@Override
	public void setDuringMedia(DuringMedia duringMedia) {
		this.duringMedia = duringMedia;
	}

	public HOW_TO_DIRECTION(Identifier identifier) {
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

	public HOW_TO_DIRECTION(Image image) {
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

	public HOW_TO_DIRECTION(Item item) {
		setItem(item);
	}

	@Override
	public Item getItem() {
		return item;
	}

	@Override
	public void setItem(Item item) {
		this.item = item;
	}

	public HOW_TO_DIRECTION(MainEntityOfPage mainEntityOfPage) {
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

	public HOW_TO_DIRECTION(Name name) {
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

	public HOW_TO_DIRECTION(NameFuzzy nameFuzzy) {
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

	public HOW_TO_DIRECTION(NameRuby nameRuby) {
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

	public HOW_TO_DIRECTION(NextItem nextItem) {
		setNextItem(nextItem);
	}

	@Override
	public NextItem getNextItem() {
		return nextItem;
	}

	@Override
	public void setNextItem(NextItem nextItem) {
		this.nextItem = nextItem;
	}

	public HOW_TO_DIRECTION(PerformTime performTime) {
		setPerformTime(performTime);
	}

	@Override
	public PerformTime getPerformTime() {
		return performTime;
	}

	@Override
	public void setPerformTime(PerformTime performTime) {
		this.performTime = performTime;
	}

	public HOW_TO_DIRECTION(Position position) {
		setPosition(position);
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	public HOW_TO_DIRECTION(PotentialAction potentialAction) {
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

	public HOW_TO_DIRECTION(PrepTime prepTime) {
		setPrepTime(prepTime);
	}

	@Override
	public PrepTime getPrepTime() {
		return prepTime;
	}

	@Override
	public void setPrepTime(PrepTime prepTime) {
		this.prepTime = prepTime;
	}

	public HOW_TO_DIRECTION(PreviousItem previousItem) {
		setPreviousItem(previousItem);
	}

	@Override
	public PreviousItem getPreviousItem() {
		return previousItem;
	}

	@Override
	public void setPreviousItem(PreviousItem previousItem) {
		this.previousItem = previousItem;
	}

	public HOW_TO_DIRECTION(SameAs sameAs) {
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

	public HOW_TO_DIRECTION(Supply supply) {
		setSupply(supply);
	}

	@Override
	public Supply getSupply() {
		return supply;
	}

	@Override
	public void setSupply(Supply supply) {
		this.supply = supply;
	}

	public HOW_TO_DIRECTION(Tool tool) {
		setTool(tool);
	}

	@Override
	public Tool getTool() {
		return tool;
	}

	@Override
	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public HOW_TO_DIRECTION(TotalTime totalTime) {
		setTotalTime(totalTime);
	}

	@Override
	public TotalTime getTotalTime() {
		return totalTime;
	}

	@Override
	public void setTotalTime(TotalTime totalTime) {
		this.totalTime = totalTime;
	}

	public HOW_TO_DIRECTION(Url url) {
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

	public HOW_TO_DIRECTION(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AfterMedia afterMedia,
			AlternateName alternateName,
			BeforeMedia beforeMedia,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			DuringMedia duringMedia,
			Identifier identifier,
			Image image,
			Item item,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			NextItem nextItem,
			PerformTime performTime,
			Position position,
			PotentialAction potentialAction,
			PrepTime prepTime,
			PreviousItem previousItem,
			SameAs sameAs,
			Supply supply,
			Tool tool,
			TotalTime totalTime,
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
		setAfterMedia(afterMedia);
		setAlternateName(alternateName);
		setBeforeMedia(beforeMedia);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setDuringMedia(duringMedia);
		setIdentifier(identifier);
		setImage(image);
		setItem(item);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setNextItem(nextItem);
		setPerformTime(performTime);
		setPosition(position);
		setPotentialAction(potentialAction);
		setPrepTime(prepTime);
		setPreviousItem(previousItem);
		setSameAs(sameAs);
		setSupply(supply);
		setTool(tool);
		setTotalTime(totalTime);
		setUrl(url);
	}

	public void copy(Clazz.HowToDirection org) {
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
		setAfterMedia(org.getAfterMedia());
		setAlternateName(org.getAlternateName());
		setBeforeMedia(org.getBeforeMedia());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDuringMedia(org.getDuringMedia());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setItem(org.getItem());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setNextItem(org.getNextItem());
		setPerformTime(org.getPerformTime());
		setPosition(org.getPosition());
		setPotentialAction(org.getPotentialAction());
		setPrepTime(org.getPrepTime());
		setPreviousItem(org.getPreviousItem());
		setSameAs(org.getSameAs());
		setSupply(org.getSupply());
		setTool(org.getTool());
		setTotalTime(org.getTotalTime());
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
