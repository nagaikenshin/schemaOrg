package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.POSSIBLE_COMPLICATION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PossibleComplication;

@ExternalDomain
public class PossibleComplicationConverter implements DomainConverter<PossibleComplication, String> {

	@Override
	public String fromDomainToValue(PossibleComplication domain) {
		return domain.getNativeValue();
	}

	@Override
	public PossibleComplication fromValueToDomain(String value) {
		return new POSSIBLE_COMPLICATION(value);
	}

}
