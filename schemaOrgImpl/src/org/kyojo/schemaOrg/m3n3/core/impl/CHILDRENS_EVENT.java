package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.About;
import org.kyojo.schemaOrg.m3n3.core.Container.Actor;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.AggregateRating;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.Attendee;
import org.kyojo.schemaOrg.m3n3.core.Container.Audience;
import org.kyojo.schemaOrg.m3n3.core.Container.Composer;
import org.kyojo.schemaOrg.m3n3.core.Container.Contributor;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.Director;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.DoorTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Duration;
import org.kyojo.schemaOrg.m3n3.core.Container.EndDate;
import org.kyojo.schemaOrg.m3n3.core.Container.EventStatus;
import org.kyojo.schemaOrg.m3n3.core.Container.Funder;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.InLanguage;
import org.kyojo.schemaOrg.m3n3.core.Container.IsAccessibleForFree;
import org.kyojo.schemaOrg.m3n3.core.Container.Location;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;
import org.kyojo.schemaOrg.m3n3.core.Container.Organizer;
import org.kyojo.schemaOrg.m3n3.core.Container.Performer;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.PreviousStartDate;
import org.kyojo.schemaOrg.m3n3.core.Container.RecordedIn;
import org.kyojo.schemaOrg.m3n3.core.Container.RemainingAttendeeCapacity;
import org.kyojo.schemaOrg.m3n3.core.Container.Review;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.Sponsor;
import org.kyojo.schemaOrg.m3n3.core.Container.StartDate;
import org.kyojo.schemaOrg.m3n3.core.Container.SubEvent;
import org.kyojo.schemaOrg.m3n3.core.Container.SuperEvent;
import org.kyojo.schemaOrg.m3n3.core.Container.Translator;
import org.kyojo.schemaOrg.m3n3.core.Container.TypicalAgeRange;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkFeatured;
import org.kyojo.schemaOrg.m3n3.core.Container.WorkPerformed;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class CHILDRENS_EVENT implements Clazz.ChildrensEvent {

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
	public About about;
	public Actor actor;
	public AdditionalType additionalType;
	public AggregateRating aggregateRating;
	public AlternateName alternateName;
	public Attendee attendee;
	public Audience audience;
	public Composer composer;
	public Contributor contributor;
	public Description description;
	public Director director;
	public DisambiguatingDescription disambiguatingDescription;
	public DoorTime doorTime;
	public Duration duration;
	public EndDate endDate;
	public EventStatus eventStatus;
	public Funder funder;
	public Identifier identifier;
	public Image image;
	public InLanguage inLanguage;
	public IsAccessibleForFree isAccessibleForFree;
	public Location location;
	public MainEntityOfPage mainEntityOfPage;
	public MaximumAttendeeCapacity maximumAttendeeCapacity;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public Organizer organizer;
	public Performer performer;
	public PotentialAction potentialAction;
	public PreviousStartDate previousStartDate;
	public RecordedIn recordedIn;
	public RemainingAttendeeCapacity remainingAttendeeCapacity;
	public Review review;
	public SameAs sameAs;
	public Sponsor sponsor;
	public StartDate startDate;
	public SubEvent subEvent;
	public SuperEvent superEvent;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public WorkFeatured workFeatured;
	public WorkPerformed workPerformed;

	public CHILDRENS_EVENT() {
	}

	public CHILDRENS_EVENT(Long seq) {
		setSeq(seq);
	}

	public CHILDRENS_EVENT(String string) {
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

	public CHILDRENS_EVENT(About about) {
		setAbout(about);
	}

	@Override
	public About getAbout() {
		return about;
	}

	@Override
	public void setAbout(About about) {
		this.about = about;
	}

	public CHILDRENS_EVENT(Actor actor) {
		setActor(actor);
	}

	@Override
	public Actor getActor() {
		return actor;
	}

	@Override
	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public CHILDRENS_EVENT(AdditionalType additionalType) {
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

	public CHILDRENS_EVENT(AggregateRating aggregateRating) {
		setAggregateRating(aggregateRating);
	}

	@Override
	public AggregateRating getAggregateRating() {
		return aggregateRating;
	}

	@Override
	public void setAggregateRating(AggregateRating aggregateRating) {
		this.aggregateRating = aggregateRating;
	}

	public CHILDRENS_EVENT(AlternateName alternateName) {
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

	public CHILDRENS_EVENT(Attendee attendee) {
		setAttendee(attendee);
	}

	@Override
	public Attendee getAttendee() {
		return attendee;
	}

	@Override
	public void setAttendee(Attendee attendee) {
		this.attendee = attendee;
	}

	public CHILDRENS_EVENT(Audience audience) {
		setAudience(audience);
	}

	@Override
	public Audience getAudience() {
		return audience;
	}

	@Override
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

	public CHILDRENS_EVENT(Composer composer) {
		setComposer(composer);
	}

	@Override
	public Composer getComposer() {
		return composer;
	}

	@Override
	public void setComposer(Composer composer) {
		this.composer = composer;
	}

	public CHILDRENS_EVENT(Contributor contributor) {
		setContributor(contributor);
	}

	@Override
	public Contributor getContributor() {
		return contributor;
	}

	@Override
	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}

	public CHILDRENS_EVENT(Description description) {
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

	public CHILDRENS_EVENT(Director director) {
		setDirector(director);
	}

	@Override
	public Director getDirector() {
		return director;
	}

	@Override
	public void setDirector(Director director) {
		this.director = director;
	}

	public CHILDRENS_EVENT(DisambiguatingDescription disambiguatingDescription) {
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

	public CHILDRENS_EVENT(DoorTime doorTime) {
		setDoorTime(doorTime);
	}

	@Override
	public DoorTime getDoorTime() {
		return doorTime;
	}

	@Override
	public void setDoorTime(DoorTime doorTime) {
		this.doorTime = doorTime;
	}

	public CHILDRENS_EVENT(Duration duration) {
		setDuration(duration);
	}

	@Override
	public Duration getDuration() {
		return duration;
	}

	@Override
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public CHILDRENS_EVENT(EndDate endDate) {
		setEndDate(endDate);
	}

	@Override
	public EndDate getEndDate() {
		return endDate;
	}

	@Override
	public void setEndDate(EndDate endDate) {
		this.endDate = endDate;
	}

	public CHILDRENS_EVENT(EventStatus eventStatus) {
		setEventStatus(eventStatus);
	}

	@Override
	public EventStatus getEventStatus() {
		return eventStatus;
	}

	@Override
	public void setEventStatus(EventStatus eventStatus) {
		this.eventStatus = eventStatus;
	}

	public CHILDRENS_EVENT(Funder funder) {
		setFunder(funder);
	}

	@Override
	public Funder getFunder() {
		return funder;
	}

	@Override
	public void setFunder(Funder funder) {
		this.funder = funder;
	}

	public CHILDRENS_EVENT(Identifier identifier) {
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

	public CHILDRENS_EVENT(Image image) {
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

	public CHILDRENS_EVENT(InLanguage inLanguage) {
		setInLanguage(inLanguage);
	}

	@Override
	public InLanguage getInLanguage() {
		return inLanguage;
	}

	@Override
	public void setInLanguage(InLanguage inLanguage) {
		this.inLanguage = inLanguage;
	}

	public CHILDRENS_EVENT(IsAccessibleForFree isAccessibleForFree) {
		setIsAccessibleForFree(isAccessibleForFree);
	}

	@Override
	public IsAccessibleForFree getIsAccessibleForFree() {
		return isAccessibleForFree;
	}

	@Override
	public void setIsAccessibleForFree(IsAccessibleForFree isAccessibleForFree) {
		this.isAccessibleForFree = isAccessibleForFree;
	}

	public CHILDRENS_EVENT(Location location) {
		setLocation(location);
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;
	}

	public CHILDRENS_EVENT(MainEntityOfPage mainEntityOfPage) {
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

	public CHILDRENS_EVENT(MaximumAttendeeCapacity maximumAttendeeCapacity) {
		setMaximumAttendeeCapacity(maximumAttendeeCapacity);
	}

	@Override
	public MaximumAttendeeCapacity getMaximumAttendeeCapacity() {
		return maximumAttendeeCapacity;
	}

	@Override
	public void setMaximumAttendeeCapacity(MaximumAttendeeCapacity maximumAttendeeCapacity) {
		this.maximumAttendeeCapacity = maximumAttendeeCapacity;
	}

	public CHILDRENS_EVENT(Name name) {
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

	public CHILDRENS_EVENT(NameFuzzy nameFuzzy) {
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

	public CHILDRENS_EVENT(NameRuby nameRuby) {
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

	public CHILDRENS_EVENT(Offers offers) {
		setOffers(offers);
	}

	@Override
	public Offers getOffers() {
		return offers;
	}

	@Override
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	public CHILDRENS_EVENT(Organizer organizer) {
		setOrganizer(organizer);
	}

	@Override
	public Organizer getOrganizer() {
		return organizer;
	}

	@Override
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public CHILDRENS_EVENT(Performer performer) {
		setPerformer(performer);
	}

	@Override
	public Performer getPerformer() {
		return performer;
	}

	@Override
	public void setPerformer(Performer performer) {
		this.performer = performer;
	}

	public CHILDRENS_EVENT(PotentialAction potentialAction) {
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

	public CHILDRENS_EVENT(PreviousStartDate previousStartDate) {
		setPreviousStartDate(previousStartDate);
	}

	@Override
	public PreviousStartDate getPreviousStartDate() {
		return previousStartDate;
	}

	@Override
	public void setPreviousStartDate(PreviousStartDate previousStartDate) {
		this.previousStartDate = previousStartDate;
	}

	public CHILDRENS_EVENT(RecordedIn recordedIn) {
		setRecordedIn(recordedIn);
	}

	@Override
	public RecordedIn getRecordedIn() {
		return recordedIn;
	}

	@Override
	public void setRecordedIn(RecordedIn recordedIn) {
		this.recordedIn = recordedIn;
	}

	public CHILDRENS_EVENT(RemainingAttendeeCapacity remainingAttendeeCapacity) {
		setRemainingAttendeeCapacity(remainingAttendeeCapacity);
	}

	@Override
	public RemainingAttendeeCapacity getRemainingAttendeeCapacity() {
		return remainingAttendeeCapacity;
	}

	@Override
	public void setRemainingAttendeeCapacity(RemainingAttendeeCapacity remainingAttendeeCapacity) {
		this.remainingAttendeeCapacity = remainingAttendeeCapacity;
	}

	public CHILDRENS_EVENT(Review review) {
		setReview(review);
	}

	@Override
	public Review getReview() {
		return review;
	}

	@Override
	public void setReview(Review review) {
		this.review = review;
	}

	public CHILDRENS_EVENT(SameAs sameAs) {
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

	public CHILDRENS_EVENT(Sponsor sponsor) {
		setSponsor(sponsor);
	}

	@Override
	public Sponsor getSponsor() {
		return sponsor;
	}

	@Override
	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public CHILDRENS_EVENT(StartDate startDate) {
		setStartDate(startDate);
	}

	@Override
	public StartDate getStartDate() {
		return startDate;
	}

	@Override
	public void setStartDate(StartDate startDate) {
		this.startDate = startDate;
	}

	public CHILDRENS_EVENT(SubEvent subEvent) {
		setSubEvent(subEvent);
	}

	@Override
	public SubEvent getSubEvent() {
		return subEvent;
	}

	@Override
	public void setSubEvent(SubEvent subEvent) {
		this.subEvent = subEvent;
	}

	public CHILDRENS_EVENT(SuperEvent superEvent) {
		setSuperEvent(superEvent);
	}

	@Override
	public SuperEvent getSuperEvent() {
		return superEvent;
	}

	@Override
	public void setSuperEvent(SuperEvent superEvent) {
		this.superEvent = superEvent;
	}

	public CHILDRENS_EVENT(Translator translator) {
		setTranslator(translator);
	}

	@Override
	public Translator getTranslator() {
		return translator;
	}

	@Override
	public void setTranslator(Translator translator) {
		this.translator = translator;
	}

	public CHILDRENS_EVENT(TypicalAgeRange typicalAgeRange) {
		setTypicalAgeRange(typicalAgeRange);
	}

	@Override
	public TypicalAgeRange getTypicalAgeRange() {
		return typicalAgeRange;
	}

	@Override
	public void setTypicalAgeRange(TypicalAgeRange typicalAgeRange) {
		this.typicalAgeRange = typicalAgeRange;
	}

	public CHILDRENS_EVENT(Url url) {
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

	public CHILDRENS_EVENT(WorkFeatured workFeatured) {
		setWorkFeatured(workFeatured);
	}

	@Override
	public WorkFeatured getWorkFeatured() {
		return workFeatured;
	}

	@Override
	public void setWorkFeatured(WorkFeatured workFeatured) {
		this.workFeatured = workFeatured;
	}

	public CHILDRENS_EVENT(WorkPerformed workPerformed) {
		setWorkPerformed(workPerformed);
	}

	@Override
	public WorkPerformed getWorkPerformed() {
		return workPerformed;
	}

	@Override
	public void setWorkPerformed(WorkPerformed workPerformed) {
		this.workPerformed = workPerformed;
	}

	public CHILDRENS_EVENT(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			About about,
			Actor actor,
			AdditionalType additionalType,
			AggregateRating aggregateRating,
			AlternateName alternateName,
			Attendee attendee,
			Audience audience,
			Composer composer,
			Contributor contributor,
			Description description,
			Director director,
			DisambiguatingDescription disambiguatingDescription,
			DoorTime doorTime,
			Duration duration,
			EndDate endDate,
			EventStatus eventStatus,
			Funder funder,
			Identifier identifier,
			Image image,
			InLanguage inLanguage,
			IsAccessibleForFree isAccessibleForFree,
			Location location,
			MainEntityOfPage mainEntityOfPage,
			MaximumAttendeeCapacity maximumAttendeeCapacity,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Offers offers,
			Organizer organizer,
			Performer performer,
			PotentialAction potentialAction,
			PreviousStartDate previousStartDate,
			RecordedIn recordedIn,
			RemainingAttendeeCapacity remainingAttendeeCapacity,
			Review review,
			SameAs sameAs,
			Sponsor sponsor,
			StartDate startDate,
			SubEvent subEvent,
			SuperEvent superEvent,
			Translator translator,
			TypicalAgeRange typicalAgeRange,
			Url url,
			WorkFeatured workFeatured,
			WorkPerformed workPerformed) {
		setSeq(seq);
		setRefSeq(refSeq);
		setRefAcr(refAcr);
		setCreatedAt(createdAt);
		setCreatedBy(createdBy);
		setUpdatedAt(updatedAt);
		setUpdatedBy(updatedBy);
		setExpiredAt(expiredAt);
		setExpiredBy(expiredBy);
		setAbout(about);
		setActor(actor);
		setAdditionalType(additionalType);
		setAggregateRating(aggregateRating);
		setAlternateName(alternateName);
		setAttendee(attendee);
		setAudience(audience);
		setComposer(composer);
		setContributor(contributor);
		setDescription(description);
		setDirector(director);
		setDisambiguatingDescription(disambiguatingDescription);
		setDoorTime(doorTime);
		setDuration(duration);
		setEndDate(endDate);
		setEventStatus(eventStatus);
		setFunder(funder);
		setIdentifier(identifier);
		setImage(image);
		setInLanguage(inLanguage);
		setIsAccessibleForFree(isAccessibleForFree);
		setLocation(location);
		setMainEntityOfPage(mainEntityOfPage);
		setMaximumAttendeeCapacity(maximumAttendeeCapacity);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setOffers(offers);
		setOrganizer(organizer);
		setPerformer(performer);
		setPotentialAction(potentialAction);
		setPreviousStartDate(previousStartDate);
		setRecordedIn(recordedIn);
		setRemainingAttendeeCapacity(remainingAttendeeCapacity);
		setReview(review);
		setSameAs(sameAs);
		setSponsor(sponsor);
		setStartDate(startDate);
		setSubEvent(subEvent);
		setSuperEvent(superEvent);
		setTranslator(translator);
		setTypicalAgeRange(typicalAgeRange);
		setUrl(url);
		setWorkFeatured(workFeatured);
		setWorkPerformed(workPerformed);
	}

	public void copy(Clazz.ChildrensEvent org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAbout(org.getAbout());
		setActor(org.getActor());
		setAdditionalType(org.getAdditionalType());
		setAggregateRating(org.getAggregateRating());
		setAlternateName(org.getAlternateName());
		setAttendee(org.getAttendee());
		setAudience(org.getAudience());
		setComposer(org.getComposer());
		setContributor(org.getContributor());
		setDescription(org.getDescription());
		setDirector(org.getDirector());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDoorTime(org.getDoorTime());
		setDuration(org.getDuration());
		setEndDate(org.getEndDate());
		setEventStatus(org.getEventStatus());
		setFunder(org.getFunder());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInLanguage(org.getInLanguage());
		setIsAccessibleForFree(org.getIsAccessibleForFree());
		setLocation(org.getLocation());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMaximumAttendeeCapacity(org.getMaximumAttendeeCapacity());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOffers(org.getOffers());
		setOrganizer(org.getOrganizer());
		setPerformer(org.getPerformer());
		setPotentialAction(org.getPotentialAction());
		setPreviousStartDate(org.getPreviousStartDate());
		setRecordedIn(org.getRecordedIn());
		setRemainingAttendeeCapacity(org.getRemainingAttendeeCapacity());
		setReview(org.getReview());
		setSameAs(org.getSameAs());
		setSponsor(org.getSponsor());
		setStartDate(org.getStartDate());
		setSubEvent(org.getSubEvent());
		setSuperEvent(org.getSuperEvent());
		setTranslator(org.getTranslator());
		setTypicalAgeRange(org.getTypicalAgeRange());
		setUrl(org.getUrl());
		setWorkFeatured(org.getWorkFeatured());
		setWorkPerformed(org.getWorkPerformed());
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
