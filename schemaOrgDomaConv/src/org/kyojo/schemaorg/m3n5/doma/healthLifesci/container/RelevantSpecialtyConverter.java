package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RELEVANT_SPECIALTY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.RelevantSpecialty;

@ExternalDomain
public class RelevantSpecialtyConverter implements DomainConverter<RelevantSpecialty, String> {

	@Override
	public String fromDomainToValue(RelevantSpecialty domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelevantSpecialty fromValueToDomain(String value) {
		return new RELEVANT_SPECIALTY(value);
	}

}
