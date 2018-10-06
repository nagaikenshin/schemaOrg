package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.BroadcastEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.BusinessEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildrensEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ComedyEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.CourseInstance;
import org.kyojo.schemaorg.m3n4.core.Clazz.DanceEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeliveryEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.EducationEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.Event;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExhibitionEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.Festival;
import org.kyojo.schemaorg.m3n4.core.Clazz.FoodEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiteraryEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.MusicEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.OnDemandEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.SaleEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScreeningEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.SocialEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.SportsEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.TheaterEvent;
import org.kyojo.schemaorg.m3n4.core.Clazz.VisualArtsEvent;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.EventSeries;

public class BROADCAST_OF_EVENT implements Container.BroadcastOfEvent {

	private static final long serialVersionUID = 1L;

	public List<BroadcastEvent> broadcastEventList;
	public List<BusinessEvent> businessEventList;
	public List<ChildrensEvent> childrensEventList;
	public List<ComedyEvent> comedyEventList;
	public List<CourseInstance> courseInstanceList;
	public List<DanceEvent> danceEventList;
	public List<DeliveryEvent> deliveryEventList;
	public List<EducationEvent> educationEventList;
	public List<Event> eventList;
	public List<EventSeries> eventSeriesList;
	public List<ExhibitionEvent> exhibitionEventList;
	public List<Festival> festivalList;
	public List<FoodEvent> foodEventList;
	public List<LiteraryEvent> literaryEventList;
	public List<MusicEvent> musicEventList;
	public List<OnDemandEvent> onDemandEventList;
	public List<PublicationEvent> publicationEventList;
	public List<SaleEvent> saleEventList;
	public List<ScreeningEvent> screeningEventList;
	public List<SocialEvent> socialEventList;
	public List<SportsEvent> sportsEventList;
	public List<TheaterEvent> theaterEventList;
	public List<VisualArtsEvent> visualArtsEventList;

	public BROADCAST_OF_EVENT() {
	}

	public BROADCAST_OF_EVENT(String string) {
		this(new EVENT(string));
	}

	public String getString() {
		if(eventList == null || eventList.size() == 0 || eventList.get(0) == null) {
			return null;
		} else {
			Name name = eventList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(eventList == null) {
			eventList = new ArrayList<Event>();
		}
		if(eventList.size() == 0) {
			eventList.add(new EVENT(string));
		} else {
			eventList.set(0, new EVENT(string));
		}
	}

	public BROADCAST_OF_EVENT(BroadcastEvent broadcastEvent) {
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

	public BROADCAST_OF_EVENT(BusinessEvent businessEvent) {
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

	public BROADCAST_OF_EVENT(ChildrensEvent childrensEvent) {
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

	public BROADCAST_OF_EVENT(ComedyEvent comedyEvent) {
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

	public BROADCAST_OF_EVENT(CourseInstance courseInstance) {
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

	public BROADCAST_OF_EVENT(DanceEvent danceEvent) {
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

	public BROADCAST_OF_EVENT(DeliveryEvent deliveryEvent) {
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

	public BROADCAST_OF_EVENT(EducationEvent educationEvent) {
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

	public BROADCAST_OF_EVENT(Event event) {
		eventList = new ArrayList<Event>();
		eventList.add(event);
	}

	@Override
	public Event getEvent() {
		if(eventList != null && eventList.size() > 0) {
			return eventList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEvent(Event event) {
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
	public List<Event> getEventList() {
		return eventList;
	}

	@Override
	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

	@Override
	public boolean hasEvent() {
		return eventList != null && eventList.size() > 0 && eventList.get(0) != null;
	}

	public BROADCAST_OF_EVENT(EventSeries eventSeries) {
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

	public BROADCAST_OF_EVENT(ExhibitionEvent exhibitionEvent) {
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

	public BROADCAST_OF_EVENT(Festival festival) {
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

	public BROADCAST_OF_EVENT(FoodEvent foodEvent) {
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

	public BROADCAST_OF_EVENT(LiteraryEvent literaryEvent) {
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

	public BROADCAST_OF_EVENT(MusicEvent musicEvent) {
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

	public BROADCAST_OF_EVENT(OnDemandEvent onDemandEvent) {
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

	public BROADCAST_OF_EVENT(PublicationEvent publicationEvent) {
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

	public BROADCAST_OF_EVENT(SaleEvent saleEvent) {
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

	public BROADCAST_OF_EVENT(ScreeningEvent screeningEvent) {
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

	public BROADCAST_OF_EVENT(SocialEvent socialEvent) {
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

	public BROADCAST_OF_EVENT(SportsEvent sportsEvent) {
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

	public BROADCAST_OF_EVENT(TheaterEvent theaterEvent) {
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

	public BROADCAST_OF_EVENT(VisualArtsEvent visualArtsEvent) {
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

	public void copy(Container.BroadcastOfEvent org) {
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
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
