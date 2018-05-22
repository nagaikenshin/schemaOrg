package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARTICIPANT;
import org.kyojo.schemaOrg.m3n3.core.Container.Participant;

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
