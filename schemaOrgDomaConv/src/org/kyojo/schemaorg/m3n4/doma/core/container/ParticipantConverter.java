package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PARTICIPANT;
import org.kyojo.schemaorg.m3n4.core.Container.Participant;

@ExternalDomain
public class ParticipantConverter implements DomainConverter<Participant, String> {

	@Override
	public String fromDomainToValue(Participant domain) {
		return domain.getNativeValue();
	}

	@Override
	public Participant fromValueToDomain(String value) {
		return new PARTICIPANT(value);
	}

}
