package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Clazz.BroadcastEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.BusinessEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.ChildrensEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.ComedyEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.CourseInstance;
import org.kyojo.schemaorg.m3n5.core.Clazz.DanceEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.DeliveryEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.EducationEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.ExhibitionEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.Festival;
import org.kyojo.schemaorg.m3n5.core.Clazz.FoodEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.LiteraryEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.MusicEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.OnDemandEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.PublicationEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.SaleEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.ScreeningEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.SocialEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.SportsEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.TheaterEvent;
import org.kyojo.schemaorg.m3n5.core.Clazz.VisualArtsEvent;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.About;
import org.kyojo.schemaorg.m3n5.core.Container.Actor;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AggregateRating;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.Attendee;
import org.kyojo.schemaorg.m3n5.core.Container.Audience;
import org.kyojo.schemaorg.m3n5.core.Container.Composer;
import org.kyojo.schemaorg.m3n5.core.Container.Contributor;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.Director;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.DoorTime;
import org.kyojo.schemaorg.m3n5.core.Container.Duration;
import org.kyojo.schemaorg.m3n5.core.Container.EndDate;
import org.kyojo.schemaorg.m3n5.core.Container.EventStatus;
import org.kyojo.schemaorg.m3n5.core.Container.Funder;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.InLanguage;
import org.kyojo.schemaorg.m3n5.core.Container.IsAccessibleForFree;
import org.kyojo.schemaorg.m3n5.core.Container.Location;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.MaximumAttendeeCapacity;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.Offers;
import org.kyojo.schemaorg.m3n5.core.Container.Organizer;
import org.kyojo.schemaorg.m3n5.core.Container.Performer;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.PreviousStartDate;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedIn;
import org.kyojo.schemaorg.m3n5.core.Container.RemainingAttendeeCapacity;
import org.kyojo.schemaorg.m3n5.core.Container.Review;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.Sponsor;
import org.kyojo.schemaorg.m3n5.core.Container.StartDate;
import org.kyojo.schemaorg.m3n5.core.Container.SubEvent;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.SuperEvent;
import org.kyojo.schemaorg.m3n5.core.Container.Translator;
import org.kyojo.schemaorg.m3n5.core.Container.TypicalAgeRange;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.Container.WorkFeatured;
import org.kyojo.schemaorg.m3n5.core.Container.WorkPerformed;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.EventSeries;

public class EVENT implements Clazz.Event, Container.Event {

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
	public List<BroadcastEvent> broadcastEventList;
	public List<BusinessEvent> businessEventList;
	public List<ChildrensEvent> childrensEventList;
	public List<ComedyEvent> comedyEventList;
	public Composer composer;
	public Contributor contributor;
	public List<CourseInstance> courseInstanceList;
	public List<DanceEvent> danceEventList;
	public List<DeliveryEvent> deliveryEventList;
	public Description description;
	public Director director;
	public DisambiguatingDescription disambiguatingDescription;
	public DoorTime doorTime;
	public Duration duration;
	public List<EducationEvent> educationEventList;
	public EndDate endDate;
	public List<Clazz.Event> eventList;
	public List<EventSeries> eventSeriesList;
	public EventStatus eventStatus;
	public List<ExhibitionEvent> exhibitionEventList;
	public List<Festival> festivalList;
	public List<FoodEvent> foodEventList;
	public Funder funder;
	public Identifier identifier;
	public Image image;
	public InLanguage inLanguage;
	public IsAccessibleForFree isAccessibleForFree;
	public List<LiteraryEvent> literaryEventList;
	public Location location;
	public MainEntityOfPage mainEntityOfPage;
	public MaximumAttendeeCapacity maximumAttendeeCapacity;
	public List<MusicEvent> musicEventList;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Offers offers;
	public List<OnDemandEvent> onDemandEventList;
	public Organizer organizer;
	public Performer performer;
	public PotentialAction potentialAction;
	public PreviousStartDate previousStartDate;
	public List<PublicationEvent> publicationEventList;
	public RecordedIn recordedIn;
	public RemainingAttendeeCapacity remainingAttendeeCapacity;
	public Review review;
	public List<SaleEvent> saleEventList;
	public SameAs sameAs;
	public List<ScreeningEvent> screeningEventList;
	public List<SocialEvent> socialEventList;
	public Sponsor sponsor;
	public List<SportsEvent> sportsEventList;
	public StartDate startDate;
	public SubEvent subEvent;
	public SubjectOf subjectOf;
	public SuperEvent superEvent;
	public List<TheaterEvent> theaterEventList;
	public Translator translator;
	public TypicalAgeRange typicalAgeRange;
	public Url url;
	public List<VisualArtsEvent> visualArtsEventList;
	public WorkFeatured workFeatured;
	public WorkPerformed workPerformed;

	public EVENT() {
	}

	public EVENT(Long seq) {
		setSeq(seq);
	}

	public EVENT(String string) {
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

	public EVENT(About about) {
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

	public EVENT(Actor actor) {
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

	public EVENT(AdditionalType additionalType) {
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

	public EVENT(AggregateRating aggregateRating) {
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

	public EVENT(AlternateName alternateName) {
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

	public EVENT(Attendee attendee) {
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

	public EVENT(Audience audience) {
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

	public EVENT(BroadcastEvent broadcastEvent) {
		broadcastEventList = new ArrayList<BroadcastEvent>();
		broadcastEventList.add(broadcastEvent);
	}

	@Override
	public BroadcastEvent getBroadcastEvent() {
		if(broadcastEventList != null && broadcastEventList.size() > 0) {
			return broadcastEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBroadcastEvent(BroadcastEvent broadcastEvent) {
		if(broadcastEventList == null) {
			broadcastEventList = new ArrayList<>();
		}
		if(broadcastEventList.size() == 0) {
			broadcastEventList.add(broadcastEvent);
		} else {
			broadcastEventList.set(0, broadcastEvent);
		}
	}

	@Override
	public List<BroadcastEvent> getBroadcastEventList() {
		return broadcastEventList;
	}

	@Override
	public void setBroadcastEventList(List<BroadcastEvent> broadcastEventList) {
		this.broadcastEventList = broadcastEventList;
	}

	@Override
	public boolean hasBroadcastEvent() {
		return broadcastEventList != null && broadcastEventList.size() > 0 && broadcastEventList.get(0) != null;
	}

	public EVENT(BusinessEvent businessEvent) {
		businessEventList = new ArrayList<BusinessEvent>();
		businessEventList.add(businessEvent);
	}

	@Override
	public BusinessEvent getBusinessEvent() {
		if(businessEventList != null && businessEventList.size() > 0) {
			return businessEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBusinessEvent(BusinessEvent businessEvent) {
		if(businessEventList == null) {
			businessEventList = new ArrayList<>();
		}
		if(businessEventList.size() == 0) {
			businessEventList.add(businessEvent);
		} else {
			businessEventList.set(0, businessEvent);
		}
	}

	@Override
	public List<BusinessEvent> getBusinessEventList() {
		return businessEventList;
	}

	@Override
	public void setBusinessEventList(List<BusinessEvent> businessEventList) {
		this.businessEventList = businessEventList;
	}

	@Override
	public boolean hasBusinessEvent() {
		return businessEventList != null && businessEventList.size() > 0 && businessEventList.get(0) != null;
	}

	public EVENT(ChildrensEvent childrensEvent) {
		childrensEventList = new ArrayList<ChildrensEvent>();
		childrensEventList.add(childrensEvent);
	}

	@Override
	public ChildrensEvent getChildrensEvent() {
		if(childrensEventList != null && childrensEventList.size() > 0) {
			return childrensEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChildrensEvent(ChildrensEvent childrensEvent) {
		if(childrensEventList == null) {
			childrensEventList = new ArrayList<>();
		}
		if(childrensEventList.size() == 0) {
			childrensEventList.add(childrensEvent);
		} else {
			childrensEventList.set(0, childrensEvent);
		}
	}

	@Override
	public List<ChildrensEvent> getChildrensEventList() {
		return childrensEventList;
	}

	@Override
	public void setChildrensEventList(List<ChildrensEvent> childrensEventList) {
		this.childrensEventList = childrensEventList;
	}

	@Override
	public boolean hasChildrensEvent() {
		return childrensEventList != null && childrensEventList.size() > 0 && childrensEventList.get(0) != null;
	}

	public EVENT(ComedyEvent comedyEvent) {
		comedyEventList = new ArrayList<ComedyEvent>();
		comedyEventList.add(comedyEvent);
	}

	@Override
	public ComedyEvent getComedyEvent() {
		if(comedyEventList != null && comedyEventList.size() > 0) {
			return comedyEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setComedyEvent(ComedyEvent comedyEvent) {
		if(comedyEventList == null) {
			comedyEventList = new ArrayList<>();
		}
		if(comedyEventList.size() == 0) {
			comedyEventList.add(comedyEvent);
		} else {
			comedyEventList.set(0, comedyEvent);
		}
	}

	@Override
	public List<ComedyEvent> getComedyEventList() {
		return comedyEventList;
	}

	@Override
	public void setComedyEventList(List<ComedyEvent> comedyEventList) {
		this.comedyEventList = comedyEventList;
	}

	@Override
	public boolean hasComedyEvent() {
		return comedyEventList != null && comedyEventList.size() > 0 && comedyEventList.get(0) != null;
	}

	public EVENT(Composer composer) {
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

	public EVENT(Contributor contributor) {
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

	public EVENT(CourseInstance courseInstance) {
		courseInstanceList = new ArrayList<CourseInstance>();
		courseInstanceList.add(courseInstance);
	}

	@Override
	public CourseInstance getCourseInstance() {
		if(courseInstanceList != null && courseInstanceList.size() > 0) {
			return courseInstanceList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCourseInstance(CourseInstance courseInstance) {
		if(courseInstanceList == null) {
			courseInstanceList = new ArrayList<>();
		}
		if(courseInstanceList.size() == 0) {
			courseInstanceList.add(courseInstance);
		} else {
			courseInstanceList.set(0, courseInstance);
		}
	}

	@Override
	public List<CourseInstance> getCourseInstanceList() {
		return courseInstanceList;
	}

	@Override
	public void setCourseInstanceList(List<CourseInstance> courseInstanceList) {
		this.courseInstanceList = courseInstanceList;
	}

	@Override
	public boolean hasCourseInstance() {
		return courseInstanceList != null && courseInstanceList.size() > 0 && courseInstanceList.get(0) != null;
	}

	public EVENT(DanceEvent danceEvent) {
		danceEventList = new ArrayList<DanceEvent>();
		danceEventList.add(danceEvent);
	}

	@Override
	public DanceEvent getDanceEvent() {
		if(danceEventList != null && danceEventList.size() > 0) {
			return danceEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDanceEvent(DanceEvent danceEvent) {
		if(danceEventList == null) {
			danceEventList = new ArrayList<>();
		}
		if(danceEventList.size() == 0) {
			danceEventList.add(danceEvent);
		} else {
			danceEventList.set(0, danceEvent);
		}
	}

	@Override
	public List<DanceEvent> getDanceEventList() {
		return danceEventList;
	}

	@Override
	public void setDanceEventList(List<DanceEvent> danceEventList) {
		this.danceEventList = danceEventList;
	}

	@Override
	public boolean hasDanceEvent() {
		return danceEventList != null && danceEventList.size() > 0 && danceEventList.get(0) != null;
	}

	public EVENT(DeliveryEvent deliveryEvent) {
		deliveryEventList = new ArrayList<DeliveryEvent>();
		deliveryEventList.add(deliveryEvent);
	}

	@Override
	public DeliveryEvent getDeliveryEvent() {
		if(deliveryEventList != null && deliveryEventList.size() > 0) {
			return deliveryEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeliveryEvent(DeliveryEvent deliveryEvent) {
		if(deliveryEventList == null) {
			deliveryEventList = new ArrayList<>();
		}
		if(deliveryEventList.size() == 0) {
			deliveryEventList.add(deliveryEvent);
		} else {
			deliveryEventList.set(0, deliveryEvent);
		}
	}

	@Override
	public List<DeliveryEvent> getDeliveryEventList() {
		return deliveryEventList;
	}

	@Override
	public void setDeliveryEventList(List<DeliveryEvent> deliveryEventList) {
		this.deliveryEventList = deliveryEventList;
	}

	@Override
	public boolean hasDeliveryEvent() {
		return deliveryEventList != null && deliveryEventList.size() > 0 && deliveryEventList.get(0) != null;
	}

	public EVENT(Description description) {
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

	public EVENT(Director director) {
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

	public EVENT(DisambiguatingDescription disambiguatingDescription) {
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

	public EVENT(DoorTime doorTime) {
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

	public EVENT(Duration duration) {
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

	public EVENT(EducationEvent educationEvent) {
		educationEventList = new ArrayList<EducationEvent>();
		educationEventList.add(educationEvent);
	}

	@Override
	public EducationEvent getEducationEvent() {
		if(educationEventList != null && educationEventList.size() > 0) {
			return educationEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEducationEvent(EducationEvent educationEvent) {
		if(educationEventList == null) {
			educationEventList = new ArrayList<>();
		}
		if(educationEventList.size() == 0) {
			educationEventList.add(educationEvent);
		} else {
			educationEventList.set(0, educationEvent);
		}
	}

	@Override
	public List<EducationEvent> getEducationEventList() {
		return educationEventList;
	}

	@Override
	public void setEducationEventList(List<EducationEvent> educationEventList) {
		this.educationEventList = educationEventList;
	}

	@Override
	public boolean hasEducationEvent() {
		return educationEventList != null && educationEventList.size() > 0 && educationEventList.get(0) != null;
	}

	public EVENT(EndDate endDate) {
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

	public EVENT(Clazz.Event event) {
		eventList = new ArrayList<Clazz.Event>();
		eventList.add(event);
	}

	@Override
	public Clazz.Event getEvent() {
		if(eventList != null && eventList.size() > 0) {
			return eventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEvent(Clazz.Event event) {
		if(eventList == null) {
			eventList = new ArrayList<>();
		}
		if(eventList.size() == 0) {
			eventList.add(event);
		} else {
			eventList.set(0, event);
		}
	}

	@Override
	public List<Clazz.Event> getEventList() {
		return eventList;
	}

	@Override
	public void setEventList(List<Clazz.Event> eventList) {
		this.eventList = eventList;
	}

	@Override
	public boolean hasEvent() {
		return eventList != null && eventList.size() > 0 && eventList.get(0) != null;
	}

	public EVENT(EventSeries eventSeries) {
		eventSeriesList = new ArrayList<EventSeries>();
		eventSeriesList.add(eventSeries);
	}

	@Override
	public EventSeries getEventSeries() {
		if(eventSeriesList != null && eventSeriesList.size() > 0) {
			return eventSeriesList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEventSeries(EventSeries eventSeries) {
		if(eventSeriesList == null) {
			eventSeriesList = new ArrayList<>();
		}
		if(eventSeriesList.size() == 0) {
			eventSeriesList.add(eventSeries);
		} else {
			eventSeriesList.set(0, eventSeries);
		}
	}

	@Override
	public List<EventSeries> getEventSeriesList() {
		return eventSeriesList;
	}

	@Override
	public void setEventSeriesList(List<EventSeries> eventSeriesList) {
		this.eventSeriesList = eventSeriesList;
	}

	@Override
	public boolean hasEventSeries() {
		return eventSeriesList != null && eventSeriesList.size() > 0 && eventSeriesList.get(0) != null;
	}

	public EVENT(EventStatus eventStatus) {
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

	public EVENT(ExhibitionEvent exhibitionEvent) {
		exhibitionEventList = new ArrayList<ExhibitionEvent>();
		exhibitionEventList.add(exhibitionEvent);
	}

	@Override
	public ExhibitionEvent getExhibitionEvent() {
		if(exhibitionEventList != null && exhibitionEventList.size() > 0) {
			return exhibitionEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExhibitionEvent(ExhibitionEvent exhibitionEvent) {
		if(exhibitionEventList == null) {
			exhibitionEventList = new ArrayList<>();
		}
		if(exhibitionEventList.size() == 0) {
			exhibitionEventList.add(exhibitionEvent);
		} else {
			exhibitionEventList.set(0, exhibitionEvent);
		}
	}

	@Override
	public List<ExhibitionEvent> getExhibitionEventList() {
		return exhibitionEventList;
	}

	@Override
	public void setExhibitionEventList(List<ExhibitionEvent> exhibitionEventList) {
		this.exhibitionEventList = exhibitionEventList;
	}

	@Override
	public boolean hasExhibitionEvent() {
		return exhibitionEventList != null && exhibitionEventList.size() > 0 && exhibitionEventList.get(0) != null;
	}

	public EVENT(Festival festival) {
		festivalList = new ArrayList<Festival>();
		festivalList.add(festival);
	}

	@Override
	public Festival getFestival() {
		if(festivalList != null && festivalList.size() > 0) {
			return festivalList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFestival(Festival festival) {
		if(festivalList == null) {
			festivalList = new ArrayList<>();
		}
		if(festivalList.size() == 0) {
			festivalList.add(festival);
		} else {
			festivalList.set(0, festival);
		}
	}

	@Override
	public List<Festival> getFestivalList() {
		return festivalList;
	}

	@Override
	public void setFestivalList(List<Festival> festivalList) {
		this.festivalList = festivalList;
	}

	@Override
	public boolean hasFestival() {
		return festivalList != null && festivalList.size() > 0 && festivalList.get(0) != null;
	}

	public EVENT(FoodEvent foodEvent) {
		foodEventList = new ArrayList<FoodEvent>();
		foodEventList.add(foodEvent);
	}

	@Override
	public FoodEvent getFoodEvent() {
		if(foodEventList != null && foodEventList.size() > 0) {
			return foodEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFoodEvent(FoodEvent foodEvent) {
		if(foodEventList == null) {
			foodEventList = new ArrayList<>();
		}
		if(foodEventList.size() == 0) {
			foodEventList.add(foodEvent);
		} else {
			foodEventList.set(0, foodEvent);
		}
	}

	@Override
	public List<FoodEvent> getFoodEventList() {
		return foodEventList;
	}

	@Override
	public void setFoodEventList(List<FoodEvent> foodEventList) {
		this.foodEventList = foodEventList;
	}

	@Override
	public boolean hasFoodEvent() {
		return foodEventList != null && foodEventList.size() > 0 && foodEventList.get(0) != null;
	}

	public EVENT(Funder funder) {
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

	public EVENT(Identifier identifier) {
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

	public EVENT(Image image) {
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

	public EVENT(InLanguage inLanguage) {
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

	public EVENT(IsAccessibleForFree isAccessibleForFree) {
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

	public EVENT(LiteraryEvent literaryEvent) {
		literaryEventList = new ArrayList<LiteraryEvent>();
		literaryEventList.add(literaryEvent);
	}

	@Override
	public LiteraryEvent getLiteraryEvent() {
		if(literaryEventList != null && literaryEventList.size() > 0) {
			return literaryEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLiteraryEvent(LiteraryEvent literaryEvent) {
		if(literaryEventList == null) {
			literaryEventList = new ArrayList<>();
		}
		if(literaryEventList.size() == 0) {
			literaryEventList.add(literaryEvent);
		} else {
			literaryEventList.set(0, literaryEvent);
		}
	}

	@Override
	public List<LiteraryEvent> getLiteraryEventList() {
		return literaryEventList;
	}

	@Override
	public void setLiteraryEventList(List<LiteraryEvent> literaryEventList) {
		this.literaryEventList = literaryEventList;
	}

	@Override
	public boolean hasLiteraryEvent() {
		return literaryEventList != null && literaryEventList.size() > 0 && literaryEventList.get(0) != null;
	}

	public EVENT(Location location) {
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

	public EVENT(MainEntityOfPage mainEntityOfPage) {
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

	public EVENT(MaximumAttendeeCapacity maximumAttendeeCapacity) {
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

	public EVENT(MusicEvent musicEvent) {
		musicEventList = new ArrayList<MusicEvent>();
		musicEventList.add(musicEvent);
	}

	@Override
	public MusicEvent getMusicEvent() {
		if(musicEventList != null && musicEventList.size() > 0) {
			return musicEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMusicEvent(MusicEvent musicEvent) {
		if(musicEventList == null) {
			musicEventList = new ArrayList<>();
		}
		if(musicEventList.size() == 0) {
			musicEventList.add(musicEvent);
		} else {
			musicEventList.set(0, musicEvent);
		}
	}

	@Override
	public List<MusicEvent> getMusicEventList() {
		return musicEventList;
	}

	@Override
	public void setMusicEventList(List<MusicEvent> musicEventList) {
		this.musicEventList = musicEventList;
	}

	@Override
	public boolean hasMusicEvent() {
		return musicEventList != null && musicEventList.size() > 0 && musicEventList.get(0) != null;
	}

	public EVENT(Name name) {
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

	public EVENT(NameFuzzy nameFuzzy) {
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

	public EVENT(NameRuby nameRuby) {
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

	public EVENT(Offers offers) {
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

	public EVENT(OnDemandEvent onDemandEvent) {
		onDemandEventList = new ArrayList<OnDemandEvent>();
		onDemandEventList.add(onDemandEvent);
	}

	@Override
	public OnDemandEvent getOnDemandEvent() {
		if(onDemandEventList != null && onDemandEventList.size() > 0) {
			return onDemandEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOnDemandEvent(OnDemandEvent onDemandEvent) {
		if(onDemandEventList == null) {
			onDemandEventList = new ArrayList<>();
		}
		if(onDemandEventList.size() == 0) {
			onDemandEventList.add(onDemandEvent);
		} else {
			onDemandEventList.set(0, onDemandEvent);
		}
	}

	@Override
	public List<OnDemandEvent> getOnDemandEventList() {
		return onDemandEventList;
	}

	@Override
	public void setOnDemandEventList(List<OnDemandEvent> onDemandEventList) {
		this.onDemandEventList = onDemandEventList;
	}

	@Override
	public boolean hasOnDemandEvent() {
		return onDemandEventList != null && onDemandEventList.size() > 0 && onDemandEventList.get(0) != null;
	}

	public EVENT(Organizer organizer) {
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

	public EVENT(Performer performer) {
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

	public EVENT(PotentialAction potentialAction) {
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

	public EVENT(PreviousStartDate previousStartDate) {
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

	public EVENT(PublicationEvent publicationEvent) {
		publicationEventList = new ArrayList<PublicationEvent>();
		publicationEventList.add(publicationEvent);
	}

	@Override
	public PublicationEvent getPublicationEvent() {
		if(publicationEventList != null && publicationEventList.size() > 0) {
			return publicationEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPublicationEvent(PublicationEvent publicationEvent) {
		if(publicationEventList == null) {
			publicationEventList = new ArrayList<>();
		}
		if(publicationEventList.size() == 0) {
			publicationEventList.add(publicationEvent);
		} else {
			publicationEventList.set(0, publicationEvent);
		}
	}

	@Override
	public List<PublicationEvent> getPublicationEventList() {
		return publicationEventList;
	}

	@Override
	public void setPublicationEventList(List<PublicationEvent> publicationEventList) {
		this.publicationEventList = publicationEventList;
	}

	@Override
	public boolean hasPublicationEvent() {
		return publicationEventList != null && publicationEventList.size() > 0 && publicationEventList.get(0) != null;
	}

	public EVENT(RecordedIn recordedIn) {
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

	public EVENT(RemainingAttendeeCapacity remainingAttendeeCapacity) {
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

	public EVENT(Review review) {
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

	public EVENT(SaleEvent saleEvent) {
		saleEventList = new ArrayList<SaleEvent>();
		saleEventList.add(saleEvent);
	}

	@Override
	public SaleEvent getSaleEvent() {
		if(saleEventList != null && saleEventList.size() > 0) {
			return saleEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSaleEvent(SaleEvent saleEvent) {
		if(saleEventList == null) {
			saleEventList = new ArrayList<>();
		}
		if(saleEventList.size() == 0) {
			saleEventList.add(saleEvent);
		} else {
			saleEventList.set(0, saleEvent);
		}
	}

	@Override
	public List<SaleEvent> getSaleEventList() {
		return saleEventList;
	}

	@Override
	public void setSaleEventList(List<SaleEvent> saleEventList) {
		this.saleEventList = saleEventList;
	}

	@Override
	public boolean hasSaleEvent() {
		return saleEventList != null && saleEventList.size() > 0 && saleEventList.get(0) != null;
	}

	public EVENT(SameAs sameAs) {
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

	public EVENT(ScreeningEvent screeningEvent) {
		screeningEventList = new ArrayList<ScreeningEvent>();
		screeningEventList.add(screeningEvent);
	}

	@Override
	public ScreeningEvent getScreeningEvent() {
		if(screeningEventList != null && screeningEventList.size() > 0) {
			return screeningEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScreeningEvent(ScreeningEvent screeningEvent) {
		if(screeningEventList == null) {
			screeningEventList = new ArrayList<>();
		}
		if(screeningEventList.size() == 0) {
			screeningEventList.add(screeningEvent);
		} else {
			screeningEventList.set(0, screeningEvent);
		}
	}

	@Override
	public List<ScreeningEvent> getScreeningEventList() {
		return screeningEventList;
	}

	@Override
	public void setScreeningEventList(List<ScreeningEvent> screeningEventList) {
		this.screeningEventList = screeningEventList;
	}

	@Override
	public boolean hasScreeningEvent() {
		return screeningEventList != null && screeningEventList.size() > 0 && screeningEventList.get(0) != null;
	}

	public EVENT(SocialEvent socialEvent) {
		socialEventList = new ArrayList<SocialEvent>();
		socialEventList.add(socialEvent);
	}

	@Override
	public SocialEvent getSocialEvent() {
		if(socialEventList != null && socialEventList.size() > 0) {
			return socialEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSocialEvent(SocialEvent socialEvent) {
		if(socialEventList == null) {
			socialEventList = new ArrayList<>();
		}
		if(socialEventList.size() == 0) {
			socialEventList.add(socialEvent);
		} else {
			socialEventList.set(0, socialEvent);
		}
	}

	@Override
	public List<SocialEvent> getSocialEventList() {
		return socialEventList;
	}

	@Override
	public void setSocialEventList(List<SocialEvent> socialEventList) {
		this.socialEventList = socialEventList;
	}

	@Override
	public boolean hasSocialEvent() {
		return socialEventList != null && socialEventList.size() > 0 && socialEventList.get(0) != null;
	}

	public EVENT(Sponsor sponsor) {
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

	public EVENT(SportsEvent sportsEvent) {
		sportsEventList = new ArrayList<SportsEvent>();
		sportsEventList.add(sportsEvent);
	}

	@Override
	public SportsEvent getSportsEvent() {
		if(sportsEventList != null && sportsEventList.size() > 0) {
			return sportsEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSportsEvent(SportsEvent sportsEvent) {
		if(sportsEventList == null) {
			sportsEventList = new ArrayList<>();
		}
		if(sportsEventList.size() == 0) {
			sportsEventList.add(sportsEvent);
		} else {
			sportsEventList.set(0, sportsEvent);
		}
	}

	@Override
	public List<SportsEvent> getSportsEventList() {
		return sportsEventList;
	}

	@Override
	public void setSportsEventList(List<SportsEvent> sportsEventList) {
		this.sportsEventList = sportsEventList;
	}

	@Override
	public boolean hasSportsEvent() {
		return sportsEventList != null && sportsEventList.size() > 0 && sportsEventList.get(0) != null;
	}

	public EVENT(StartDate startDate) {
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

	public EVENT(SubEvent subEvent) {
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

	public EVENT(SubjectOf subjectOf) {
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

	public EVENT(SuperEvent superEvent) {
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

	public EVENT(TheaterEvent theaterEvent) {
		theaterEventList = new ArrayList<TheaterEvent>();
		theaterEventList.add(theaterEvent);
	}

	@Override
	public TheaterEvent getTheaterEvent() {
		if(theaterEventList != null && theaterEventList.size() > 0) {
			return theaterEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTheaterEvent(TheaterEvent theaterEvent) {
		if(theaterEventList == null) {
			theaterEventList = new ArrayList<>();
		}
		if(theaterEventList.size() == 0) {
			theaterEventList.add(theaterEvent);
		} else {
			theaterEventList.set(0, theaterEvent);
		}
	}

	@Override
	public List<TheaterEvent> getTheaterEventList() {
		return theaterEventList;
	}

	@Override
	public void setTheaterEventList(List<TheaterEvent> theaterEventList) {
		this.theaterEventList = theaterEventList;
	}

	@Override
	public boolean hasTheaterEvent() {
		return theaterEventList != null && theaterEventList.size() > 0 && theaterEventList.get(0) != null;
	}

	public EVENT(Translator translator) {
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

	public EVENT(TypicalAgeRange typicalAgeRange) {
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

	public EVENT(Url url) {
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

	public EVENT(VisualArtsEvent visualArtsEvent) {
		visualArtsEventList = new ArrayList<VisualArtsEvent>();
		visualArtsEventList.add(visualArtsEvent);
	}

	@Override
	public VisualArtsEvent getVisualArtsEvent() {
		if(visualArtsEventList != null && visualArtsEventList.size() > 0) {
			return visualArtsEventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVisualArtsEvent(VisualArtsEvent visualArtsEvent) {
		if(visualArtsEventList == null) {
			visualArtsEventList = new ArrayList<>();
		}
		if(visualArtsEventList.size() == 0) {
			visualArtsEventList.add(visualArtsEvent);
		} else {
			visualArtsEventList.set(0, visualArtsEvent);
		}
	}

	@Override
	public List<VisualArtsEvent> getVisualArtsEventList() {
		return visualArtsEventList;
	}

	@Override
	public void setVisualArtsEventList(List<VisualArtsEvent> visualArtsEventList) {
		this.visualArtsEventList = visualArtsEventList;
	}

	@Override
	public boolean hasVisualArtsEvent() {
		return visualArtsEventList != null && visualArtsEventList.size() > 0 && visualArtsEventList.get(0) != null;
	}

	public EVENT(WorkFeatured workFeatured) {
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

	public EVENT(WorkPerformed workPerformed) {
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

	public void copy(Clazz.Event org) {
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
		setSubjectOf(org.getSubjectOf());
		setSuperEvent(org.getSuperEvent());
		setTranslator(org.getTranslator());
		setTypicalAgeRange(org.getTypicalAgeRange());
		setUrl(org.getUrl());
		setWorkFeatured(org.getWorkFeatured());
		setWorkPerformed(org.getWorkPerformed());
	}

	public void copy(Container.Event org) {
		setBroadcastEventList(org.getBroadcastEventList());
		setBusinessEventList(org.getBusinessEventList());
		setChildrensEventList(org.getChildrensEventList());
		setComedyEventList(org.getComedyEventList());
		setCourseInstanceList(org.getCourseInstanceList());
		setDanceEventList(org.getDanceEventList());
		setDeliveryEventList(org.getDeliveryEventList());
		setEducationEventList(org.getEducationEventList());
		setEventList(org.getEventList());
		setEventSeriesList(org.getEventSeriesList());
		setExhibitionEventList(org.getExhibitionEventList());
		setFestivalList(org.getFestivalList());
		setFoodEventList(org.getFoodEventList());
		setLiteraryEventList(org.getLiteraryEventList());
		setMusicEventList(org.getMusicEventList());
		setOnDemandEventList(org.getOnDemandEventList());
		setPublicationEventList(org.getPublicationEventList());
		setSaleEventList(org.getSaleEventList());
		setScreeningEventList(org.getScreeningEventList());
		setSocialEventList(org.getSocialEventList());
		setSportsEventList(org.getSportsEventList());
		setTheaterEventList(org.getTheaterEventList());
		setVisualArtsEventList(org.getVisualArtsEventList());
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
