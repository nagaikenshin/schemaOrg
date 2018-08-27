package org.kyojo.schemaorg.m3n4.pending.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastChannelId;
import org.kyojo.schemaorg.m3n4.core.Container.BroadcastServiceTier;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Genre;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.InBroadcastLineup;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.ProvidesBroadcastService;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.pending.Clazz;
import org.kyojo.schemaorg.m3n4.pending.Container.BroadcastFrequency;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;

public class FM_RADIO_CHANNEL implements Clazz.FMRadioChannel {

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
	public AlternateName alternateName;
	public BroadcastChannelId broadcastChannelId;
	public BroadcastFrequency broadcastFrequency;
	public BroadcastServiceTier broadcastServiceTier;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Genre genre;
	public Identifier identifier;
	public Image image;
	public InBroadcastLineup inBroadcastLineup;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PotentialAction potentialAction;
	public ProvidesBroadcastService providesBroadcastService;
	public SameAs sameAs;
	public SubjectOf subjectOf;
	public Url url;

	public FM_RADIO_CHANNEL() {
	}

	public FM_RADIO_CHANNEL(Long seq) {
		setSeq(seq);
	}

	public FM_RADIO_CHANNEL(String string) {
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

	public FM_RADIO_CHANNEL(AdditionalType additionalType) {
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

	public FM_RADIO_CHANNEL(AlternateName alternateName) {
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

	public FM_RADIO_CHANNEL(BroadcastChannelId broadcastChannelId) {
		setBroadcastChannelId(broadcastChannelId);
	}

	@Override
	public BroadcastChannelId getBroadcastChannelId() {
		return broadcastChannelId;
	}

	@Override
	public void setBroadcastChannelId(BroadcastChannelId broadcastChannelId) {
		this.broadcastChannelId = broadcastChannelId;
	}

	public FM_RADIO_CHANNEL(BroadcastFrequency broadcastFrequency) {
		setBroadcastFrequency(broadcastFrequency);
	}

	@Override
	public BroadcastFrequency getBroadcastFrequency() {
		return broadcastFrequency;
	}

	@Override
	public void setBroadcastFrequency(BroadcastFrequency broadcastFrequency) {
		this.broadcastFrequency = broadcastFrequency;
	}

	public FM_RADIO_CHANNEL(BroadcastServiceTier broadcastServiceTier) {
		setBroadcastServiceTier(broadcastServiceTier);
	}

	@Override
	public BroadcastServiceTier getBroadcastServiceTier() {
		return broadcastServiceTier;
	}

	@Override
	public void setBroadcastServiceTier(BroadcastServiceTier broadcastServiceTier) {
		this.broadcastServiceTier = broadcastServiceTier;
	}

	public FM_RADIO_CHANNEL(Description description) {
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

	public FM_RADIO_CHANNEL(DisambiguatingDescription disambiguatingDescription) {
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

	public FM_RADIO_CHANNEL(Genre genre) {
		setGenre(genre);
	}

	@Override
	public Genre getGenre() {
		return genre;
	}

	@Override
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public FM_RADIO_CHANNEL(Identifier identifier) {
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

	public FM_RADIO_CHANNEL(Image image) {
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

	public FM_RADIO_CHANNEL(InBroadcastLineup inBroadcastLineup) {
		setInBroadcastLineup(inBroadcastLineup);
	}

	@Override
	public InBroadcastLineup getInBroadcastLineup() {
		return inBroadcastLineup;
	}

	@Override
	public void setInBroadcastLineup(InBroadcastLineup inBroadcastLineup) {
		this.inBroadcastLineup = inBroadcastLineup;
	}

	public FM_RADIO_CHANNEL(MainEntityOfPage mainEntityOfPage) {
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

	public FM_RADIO_CHANNEL(Name name) {
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

	public FM_RADIO_CHANNEL(NameFuzzy nameFuzzy) {
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

	public FM_RADIO_CHANNEL(NameRuby nameRuby) {
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

	public FM_RADIO_CHANNEL(PotentialAction potentialAction) {
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

	public FM_RADIO_CHANNEL(ProvidesBroadcastService providesBroadcastService) {
		setProvidesBroadcastService(providesBroadcastService);
	}

	@Override
	public ProvidesBroadcastService getProvidesBroadcastService() {
		return providesBroadcastService;
	}

	@Override
	public void setProvidesBroadcastService(ProvidesBroadcastService providesBroadcastService) {
		this.providesBroadcastService = providesBroadcastService;
	}

	public FM_RADIO_CHANNEL(SameAs sameAs) {
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

	public FM_RADIO_CHANNEL(SubjectOf subjectOf) {
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

	public FM_RADIO_CHANNEL(Url url) {
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

	public FM_RADIO_CHANNEL(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			AdditionalType additionalType,
			AlternateName alternateName,
			BroadcastChannelId broadcastChannelId,
			BroadcastFrequency broadcastFrequency,
			BroadcastServiceTier broadcastServiceTier,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			Genre genre,
			Identifier identifier,
			Image image,
			InBroadcastLineup inBroadcastLineup,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			PotentialAction potentialAction,
			ProvidesBroadcastService providesBroadcastService,
			SameAs sameAs,
			SubjectOf subjectOf,
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
		setAlternateName(alternateName);
		setBroadcastChannelId(broadcastChannelId);
		setBroadcastFrequency(broadcastFrequency);
		setBroadcastServiceTier(broadcastServiceTier);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setGenre(genre);
		setIdentifier(identifier);
		setImage(image);
		setInBroadcastLineup(inBroadcastLineup);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setPotentialAction(potentialAction);
		setProvidesBroadcastService(providesBroadcastService);
		setSameAs(sameAs);
		setSubjectOf(subjectOf);
		setUrl(url);
	}

	public void copy(Clazz.FMRadioChannel org) {
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
		setAlternateName(org.getAlternateName());
		setBroadcastChannelId(org.getBroadcastChannelId());
		setBroadcastFrequency(org.getBroadcastFrequency());
		setBroadcastServiceTier(org.getBroadcastServiceTier());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setGenre(org.getGenre());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInBroadcastLineup(org.getInBroadcastLineup());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPotentialAction(org.getPotentialAction());
		setProvidesBroadcastService(org.getProvidesBroadcastService());
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
