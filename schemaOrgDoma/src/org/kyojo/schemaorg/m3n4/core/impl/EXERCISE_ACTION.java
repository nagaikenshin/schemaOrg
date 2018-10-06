package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz;
import org.kyojo.schemaorg.m3n4.core.Container.ActionStatus;
import org.kyojo.schemaorg.m3n4.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n4.core.Container.Agent;
import org.kyojo.schemaorg.m3n4.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n4.core.Container.Audience;
import org.kyojo.schemaorg.m3n4.core.Container.Description;
import org.kyojo.schemaorg.m3n4.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n4.core.Container.Distance;
import org.kyojo.schemaorg.m3n4.core.Container.EndTime;
import org.kyojo.schemaorg.m3n4.core.Container.Error;
import org.kyojo.schemaorg.m3n4.core.Container.Event;
import org.kyojo.schemaorg.m3n4.core.Container.ExerciseCourse;
import org.kyojo.schemaorg.m3n4.core.Container.FromLocation;
import org.kyojo.schemaorg.m3n4.core.Container.Identifier;
import org.kyojo.schemaorg.m3n4.core.Container.Image;
import org.kyojo.schemaorg.m3n4.core.Container.Instrument;
import org.kyojo.schemaorg.m3n4.core.Container.Location;
import org.kyojo.schemaorg.m3n4.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n4.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n4.core.Container.Object;
import org.kyojo.schemaorg.m3n4.core.Container.Opponent;
import org.kyojo.schemaorg.m3n4.core.Container.Participant;
import org.kyojo.schemaorg.m3n4.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n4.core.Container.Result;
import org.kyojo.schemaorg.m3n4.core.Container.SameAs;
import org.kyojo.schemaorg.m3n4.core.Container.SportsActivityLocation;
import org.kyojo.schemaorg.m3n4.core.Container.SportsEvent;
import org.kyojo.schemaorg.m3n4.core.Container.SportsTeam;
import org.kyojo.schemaorg.m3n4.core.Container.StartTime;
import org.kyojo.schemaorg.m3n4.core.Container.Target;
import org.kyojo.schemaorg.m3n4.core.Container.ToLocation;
import org.kyojo.schemaorg.m3n4.core.Container.Url;
import org.kyojo.schemaorg.m3n4.core.DataType;
import org.kyojo.schemaorg.m3n4.core.impl.NAME;
import org.kyojo.schemaorg.m3n4.core.impl.TEXT;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Diet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExercisePlan;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseRelatedDiet;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.ExerciseType;
import org.kyojo.schemaorg.m3n4.pending.Container.SubjectOf;


public class EXERCISE_ACTION implements Clazz.ExerciseAction {

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
	public ActionStatus actionStatus;
	public AdditionalType additionalType;
	public Agent agent;
	public AlternateName alternateName;
	public Audience audience;
	public Description description;
	public Diet diet;
	public DisambiguatingDescription disambiguatingDescription;
	public Distance distance;
	public EndTime endTime;
	public Error error;
	public Event event;
	public ExerciseCourse exerciseCourse;
	public ExercisePlan exercisePlan;
	public ExerciseRelatedDiet exerciseRelatedDiet;
	public ExerciseType exerciseType;
	public FromLocation fromLocation;
	public Identifier identifier;
	public Image image;
	public Instrument instrument;
	public Location location;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Object object;
	public Opponent opponent;
	public Participant participant;
	public PotentialAction potentialAction;
	public Result result;
	public SameAs sameAs;
	public SportsActivityLocation sportsActivityLocation;
	public SportsEvent sportsEvent;
	public SportsTeam sportsTeam;
	public StartTime startTime;
	public SubjectOf subjectOf;
	public Target target;
	public ToLocation toLocation;
	public Url url;

	public EXERCISE_ACTION() {
	}

	public EXERCISE_ACTION(Long seq) {
		setSeq(seq);
	}

	public EXERCISE_ACTION(String string) {
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

	public EXERCISE_ACTION(ActionStatus actionStatus) {
		setActionStatus(actionStatus);
	}

	@Override
	public ActionStatus getActionStatus() {
		return actionStatus;
	}

	@Override
	public void setActionStatus(ActionStatus actionStatus) {
		this.actionStatus = actionStatus;
	}

	public EXERCISE_ACTION(AdditionalType additionalType) {
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

	public EXERCISE_ACTION(Agent agent) {
		setAgent(agent);
	}

	@Override
	public Agent getAgent() {
		return agent;
	}

	@Override
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public EXERCISE_ACTION(AlternateName alternateName) {
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

	public EXERCISE_ACTION(Audience audience) {
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

	public EXERCISE_ACTION(Description description) {
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

	public EXERCISE_ACTION(Diet diet) {
		setDiet(diet);
	}

	@Override
	public Diet getDiet() {
		return diet;
	}

	@Override
	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public EXERCISE_ACTION(DisambiguatingDescription disambiguatingDescription) {
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

	public EXERCISE_ACTION(Distance distance) {
		setDistance(distance);
	}

	@Override
	public Distance getDistance() {
		return distance;
	}

	@Override
	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	public EXERCISE_ACTION(EndTime endTime) {
		setEndTime(endTime);
	}

	@Override
	public EndTime getEndTime() {
		return endTime;
	}

	@Override
	public void setEndTime(EndTime endTime) {
		this.endTime = endTime;
	}

	public EXERCISE_ACTION(Error error) {
		setError(error);
	}

	@Override
	public Error getError() {
		return error;
	}

	@Override
	public void setError(Error error) {
		this.error = error;
	}

	public EXERCISE_ACTION(Event event) {
		setEvent(event);
	}

	@Override
	public Event getEvent() {
		return event;
	}

	@Override
	public void setEvent(Event event) {
		this.event = event;
	}

	public EXERCISE_ACTION(ExerciseCourse exerciseCourse) {
		setExerciseCourse(exerciseCourse);
	}

	@Override
	public ExerciseCourse getExerciseCourse() {
		return exerciseCourse;
	}

	@Override
	public void setExerciseCourse(ExerciseCourse exerciseCourse) {
		this.exerciseCourse = exerciseCourse;
	}

	public EXERCISE_ACTION(ExercisePlan exercisePlan) {
		setExercisePlan(exercisePlan);
	}

	@Override
	public ExercisePlan getExercisePlan() {
		return exercisePlan;
	}

	@Override
	public void setExercisePlan(ExercisePlan exercisePlan) {
		this.exercisePlan = exercisePlan;
	}

	public EXERCISE_ACTION(ExerciseRelatedDiet exerciseRelatedDiet) {
		setExerciseRelatedDiet(exerciseRelatedDiet);
	}

	@Override
	public ExerciseRelatedDiet getExerciseRelatedDiet() {
		return exerciseRelatedDiet;
	}

	@Override
	public void setExerciseRelatedDiet(ExerciseRelatedDiet exerciseRelatedDiet) {
		this.exerciseRelatedDiet = exerciseRelatedDiet;
	}

	public EXERCISE_ACTION(ExerciseType exerciseType) {
		setExerciseType(exerciseType);
	}

	@Override
	public ExerciseType getExerciseType() {
		return exerciseType;
	}

	@Override
	public void setExerciseType(ExerciseType exerciseType) {
		this.exerciseType = exerciseType;
	}

	public EXERCISE_ACTION(FromLocation fromLocation) {
		setFromLocation(fromLocation);
	}

	@Override
	public FromLocation getFromLocation() {
		return fromLocation;
	}

	@Override
	public void setFromLocation(FromLocation fromLocation) {
		this.fromLocation = fromLocation;
	}

	public EXERCISE_ACTION(Identifier identifier) {
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

	public EXERCISE_ACTION(Image image) {
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

	public EXERCISE_ACTION(Instrument instrument) {
		setInstrument(instrument);
	}

	@Override
	public Instrument getInstrument() {
		return instrument;
	}

	@Override
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public EXERCISE_ACTION(Location location) {
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

	public EXERCISE_ACTION(MainEntityOfPage mainEntityOfPage) {
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

	public EXERCISE_ACTION(Name name) {
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

	public EXERCISE_ACTION(NameFuzzy nameFuzzy) {
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

	public EXERCISE_ACTION(NameRuby nameRuby) {
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

	public EXERCISE_ACTION(Object object) {
		setObject(object);
	}

	@Override
	public Object getObject() {
		return object;
	}

	@Override
	public void setObject(Object object) {
		this.object = object;
	}

	public EXERCISE_ACTION(Opponent opponent) {
		setOpponent(opponent);
	}

	@Override
	public Opponent getOpponent() {
		return opponent;
	}

	@Override
	public void setOpponent(Opponent opponent) {
		this.opponent = opponent;
	}

	public EXERCISE_ACTION(Participant participant) {
		setParticipant(participant);
	}

	@Override
	public Participant getParticipant() {
		return participant;
	}

	@Override
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public EXERCISE_ACTION(PotentialAction potentialAction) {
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

	public EXERCISE_ACTION(Result result) {
		setResult(result);
	}

	@Override
	public Result getResult() {
		return result;
	}

	@Override
	public void setResult(Result result) {
		this.result = result;
	}

	public EXERCISE_ACTION(SameAs sameAs) {
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

	public EXERCISE_ACTION(SportsActivityLocation sportsActivityLocation) {
		setSportsActivityLocation(sportsActivityLocation);
	}

	@Override
	public SportsActivityLocation getSportsActivityLocation() {
		return sportsActivityLocation;
	}

	@Override
	public void setSportsActivityLocation(SportsActivityLocation sportsActivityLocation) {
		this.sportsActivityLocation = sportsActivityLocation;
	}

	public EXERCISE_ACTION(SportsEvent sportsEvent) {
		setSportsEvent(sportsEvent);
	}

	@Override
	public SportsEvent getSportsEvent() {
		return sportsEvent;
	}

	@Override
	public void setSportsEvent(SportsEvent sportsEvent) {
		this.sportsEvent = sportsEvent;
	}

	public EXERCISE_ACTION(SportsTeam sportsTeam) {
		setSportsTeam(sportsTeam);
	}

	@Override
	public SportsTeam getSportsTeam() {
		return sportsTeam;
	}

	@Override
	public void setSportsTeam(SportsTeam sportsTeam) {
		this.sportsTeam = sportsTeam;
	}

	public EXERCISE_ACTION(StartTime startTime) {
		setStartTime(startTime);
	}

	@Override
	public StartTime getStartTime() {
		return startTime;
	}

	@Override
	public void setStartTime(StartTime startTime) {
		this.startTime = startTime;
	}

	public EXERCISE_ACTION(SubjectOf subjectOf) {
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

	public EXERCISE_ACTION(Target target) {
		setTarget(target);
	}

	@Override
	public Target getTarget() {
		return target;
	}

	@Override
	public void setTarget(Target target) {
		this.target = target;
	}

	public EXERCISE_ACTION(ToLocation toLocation) {
		setToLocation(toLocation);
	}

	@Override
	public ToLocation getToLocation() {
		return toLocation;
	}

	@Override
	public void setToLocation(ToLocation toLocation) {
		this.toLocation = toLocation;
	}

	public EXERCISE_ACTION(Url url) {
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

	public void copy(Clazz.ExerciseAction org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setActionStatus(org.getActionStatus());
		setAdditionalType(org.getAdditionalType());
		setAgent(org.getAgent());
		setAlternateName(org.getAlternateName());
		setAudience(org.getAudience());
		setDescription(org.getDescription());
		setDiet(org.getDiet());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDistance(org.getDistance());
		setEndTime(org.getEndTime());
		setError(org.getError());
		setEvent(org.getEvent());
		setExerciseCourse(org.getExerciseCourse());
		setExercisePlan(org.getExercisePlan());
		setExerciseRelatedDiet(org.getExerciseRelatedDiet());
		setExerciseType(org.getExerciseType());
		setFromLocation(org.getFromLocation());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInstrument(org.getInstrument());
		setLocation(org.getLocation());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setObject(org.getObject());
		setOpponent(org.getOpponent());
		setParticipant(org.getParticipant());
		setPotentialAction(org.getPotentialAction());
		setResult(org.getResult());
		setSameAs(org.getSameAs());
		setSportsActivityLocation(org.getSportsActivityLocation());
		setSportsEvent(org.getSportsEvent());
		setSportsTeam(org.getSportsTeam());
		setStartTime(org.getStartTime());
		setSubjectOf(org.getSubjectOf());
		setTarget(org.getTarget());
		setToLocation(org.getToLocation());
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
