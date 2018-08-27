package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/EventStatusType")
@CamelizedName("eventStatusType")
@ConstantizedName("EVENT_STATUS_TYPE")
public interface EventStatusType extends Clazz.EventStatusType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventCancelled")
	@SchemaOrgLabel("EventCancelled")
	@SchemaOrgComment(""
			+ "The event has been cancelled. If the event has multiple startDate values, all"
			+ " are assumed to be cancelled. Either startDate or previousStartDate may be used"
			+ " to specify the event's cancelled date(s).")
	@CamelizedName("eventCancelled")
	@ConstantizedName("EVENT_CANCELLED")
	@SampleValue("1")
	public interface EventCancelled extends EventStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventPostponed")
	@SchemaOrgLabel("EventPostponed")
	@SchemaOrgComment(""
			+ "The event has been postponed and no new date has been set. The event's"
			+ " previousStartDate should be set.")
	@CamelizedName("eventPostponed")
	@ConstantizedName("EVENT_POSTPONED")
	@SampleValue("2")
	public interface EventPostponed extends EventStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventRescheduled")
	@SchemaOrgLabel("EventRescheduled")
	@SchemaOrgComment(""
			+ "The event has been rescheduled. The event's previousStartDate should be set to"
			+ " the old date and the startDate should be set to the event's new date. (If the"
			+ " event has been rescheduled multiple times, the previousStartDate property may"
			+ " be repeated).")
	@CamelizedName("eventRescheduled")
	@ConstantizedName("EVENT_RESCHEDULED")
	@SampleValue("3")
	public interface EventRescheduled extends EventStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EventScheduled")
	@SchemaOrgLabel("EventScheduled")
	@SchemaOrgComment(""
			+ "The event is taking place or has taken place on the startDate as scheduled. Use"
			+ " of this value is optional, as it is assumed by default.")
	@CamelizedName("eventScheduled")
	@ConstantizedName("EVENT_SCHEDULED")
	@SampleValue("4")
	public interface EventScheduled extends EventStatusType {

	}

}
