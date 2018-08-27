package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.RELEVANT_OCCUPATION;
import org.kyojo.schemaorg.m3n4.pending.Container.RelevantOccupation;

@ExternalDomain
public class RelevantOccupationConverter implements DomainConverter<RelevantOccupation, String> {

	@Override
	public String fromDomainToValue(RelevantOccupation domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelevantOccupation fromValueToDomain(String value) {
		return new RELEVANT_OCCUPATION(value);
	}

}
