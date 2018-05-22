package org.kyojo.schemaOrg.m3n3.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaOrg.m3n3.SimpleJsonBuilder;
import org.kyojo.schemaOrg.m3n3.core.Clazz;
import org.kyojo.schemaOrg.m3n3.core.Container.ActionStatus;
import org.kyojo.schemaOrg.m3n3.core.Container.AdditionalType;
import org.kyojo.schemaOrg.m3n3.core.Container.Agent;
import org.kyojo.schemaOrg.m3n3.core.Container.AlternateName;
import org.kyojo.schemaOrg.m3n3.core.Container.DeliveryMethod;
import org.kyojo.schemaOrg.m3n3.core.Container.Description;
import org.kyojo.schemaOrg.m3n3.core.Container.DisambiguatingDescription;
import org.kyojo.schemaOrg.m3n3.core.Container.EndTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Error;
import org.kyojo.schemaOrg.m3n3.core.Container.Identifier;
import org.kyojo.schemaOrg.m3n3.core.Container.Image;
import org.kyojo.schemaOrg.m3n3.core.Container.Instrument;
import org.kyojo.schemaOrg.m3n3.core.Container.Location;
import org.kyojo.schemaOrg.m3n3.core.Container.MainEntityOfPage;
import org.kyojo.schemaOrg.m3n3.core.Container.Name;
import org.kyojo.schemaOrg.m3n3.core.Container.NameFuzzy;
import org.kyojo.schemaOrg.m3n3.core.Container.NameRuby;
import org.kyojo.schemaOrg.m3n3.core.Container.Object;
import org.kyojo.schemaOrg.m3n3.core.Container.Participant;
import org.kyojo.schemaOrg.m3n3.core.Container.PotentialAction;
import org.kyojo.schemaOrg.m3n3.core.Container.Price;
import org.kyojo.schemaOrg.m3n3.core.Container.PriceSpecification;
import org.kyojo.schemaOrg.m3n3.core.Container.Result;
import org.kyojo.schemaOrg.m3n3.core.Container.SameAs;
import org.kyojo.schemaOrg.m3n3.core.Container.StartTime;
import org.kyojo.schemaOrg.m3n3.core.Container.Target;
import org.kyojo.schemaOrg.m3n3.core.Container.Url;
import org.kyojo.schemaOrg.m3n3.core.DataType;
import org.kyojo.schemaOrg.m3n3.core.impl.NAME;
import org.kyojo.schemaOrg.m3n3.core.impl.TEXT;

public class ORDER_ACTION implements Clazz.OrderAction {

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
	public DeliveryMethod deliveryMethod;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public EndTime endTime;
	public Error error;
	public Identifier identifier;
	public Image image;
	public Instrument instrument;
	public Location location;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public Object object;
	public Participant participant;
	public PotentialAction potentialAction;
	public Price price;
	public PriceSpecification priceSpecification;
	public Result result;
	public SameAs sameAs;
	public StartTime startTime;
	public Target target;
	public Url url;

	public ORDER_ACTION() {
	}

	public ORDER_ACTION(Long seq) {
		setSeq(seq);
	}

	public ORDER_ACTION(String string) {
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

	public ORDER_ACTION(ActionStatus actionStatus) {
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

	public ORDER_ACTION(AdditionalType additionalType) {
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

	public ORDER_ACTION(Agent agent) {
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

	public ORDER_ACTION(AlternateName alternateName) {
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

	public ORDER_ACTION(DeliveryMethod deliveryMethod) {
		setDeliveryMethod(deliveryMethod);
	}

	@Override
	public DeliveryMethod getDeliveryMethod() {
		return deliveryMethod;
	}

	@Override
	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public ORDER_ACTION(Description description) {
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

	public ORDER_ACTION(DisambiguatingDescription disambiguatingDescription) {
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

	public ORDER_ACTION(EndTime endTime) {
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

	public ORDER_ACTION(Error error) {
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

	public ORDER_ACTION(Identifier identifier) {
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

	public ORDER_ACTION(Image image) {
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

	public ORDER_ACTION(Instrument instrument) {
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

	public ORDER_ACTION(Location location) {
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

	public ORDER_ACTION(MainEntityOfPage mainEntityOfPage) {
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

	public ORDER_ACTION(Name name) {
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

	public ORDER_ACTION(NameFuzzy nameFuzzy) {
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

	public ORDER_ACTION(NameRuby nameRuby) {
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

	public ORDER_ACTION(Object object) {
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

	public ORDER_ACTION(Participant participant) {
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

	public ORDER_ACTION(PotentialAction potentialAction) {
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

	public ORDER_ACTION(Price price) {
		setPrice(price);
	}

	@Override
	public Price getPrice() {
		return price;
	}

	@Override
	public void setPrice(Price price) {
		this.price = price;
	}

	public ORDER_ACTION(PriceSpecification priceSpecification) {
		setPriceSpecification(priceSpecification);
	}

	@Override
	public PriceSpecification getPriceSpecification() {
		return priceSpecification;
	}

	@Override
	public void setPriceSpecification(PriceSpecification priceSpecification) {
		this.priceSpecification = priceSpecification;
	}

	public ORDER_ACTION(Result result) {
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

	public ORDER_ACTION(SameAs sameAs) {
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

	public ORDER_ACTION(StartTime startTime) {
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

	public ORDER_ACTION(Target target) {
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

	public ORDER_ACTION(Url url) {
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

	public ORDER_ACTION(Long seq,
			Long refSeq,
			String refAcr,
			java.util.Date createdAt,
			Long createdBy,
			java.util.Date updatedAt,
			Long updatedBy,
			java.util.Date expiredAt,
			Long expiredBy,
			ActionStatus actionStatus,
			AdditionalType additionalType,
			Agent agent,
			AlternateName alternateName,
			DeliveryMethod deliveryMethod,
			Description description,
			DisambiguatingDescription disambiguatingDescription,
			EndTime endTime,
			Error error,
			Identifier identifier,
			Image image,
			Instrument instrument,
			Location location,
			MainEntityOfPage mainEntityOfPage,
			Name name,
			NameFuzzy nameFuzzy,
			NameRuby nameRuby,
			Object object,
			Participant participant,
			PotentialAction potentialAction,
			Price price,
			PriceSpecification priceSpecification,
			Result result,
			SameAs sameAs,
			StartTime startTime,
			Target target,
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
		setActionStatus(actionStatus);
		setAdditionalType(additionalType);
		setAgent(agent);
		setAlternateName(alternateName);
		setDeliveryMethod(deliveryMethod);
		setDescription(description);
		setDisambiguatingDescription(disambiguatingDescription);
		setEndTime(endTime);
		setError(error);
		setIdentifier(identifier);
		setImage(image);
		setInstrument(instrument);
		setLocation(location);
		setMainEntityOfPage(mainEntityOfPage);
		setName(name);
		setNameFuzzy(nameFuzzy);
		setNameRuby(nameRuby);
		setObject(object);
		setParticipant(participant);
		setPotentialAction(potentialAction);
		setPrice(price);
		setPriceSpecification(priceSpecification);
		setResult(result);
		setSameAs(sameAs);
		setStartTime(startTime);
		setTarget(target);
		setUrl(url);
	}

	public void copy(Clazz.OrderAction org) {
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
		setDeliveryMethod(org.getDeliveryMethod());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setEndTime(org.getEndTime());
		setError(org.getError());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setInstrument(org.getInstrument());
		setLocation(org.getLocation());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setObject(org.getObject());
		setParticipant(org.getParticipant());
		setPotentialAction(org.getPotentialAction());
		setPrice(org.getPrice());
		setPriceSpecification(org.getPriceSpecification());
		setResult(org.getResult());
		setSameAs(org.getSameAs());
		setStartTime(org.getStartTime());
		setTarget(org.getTarget());
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
