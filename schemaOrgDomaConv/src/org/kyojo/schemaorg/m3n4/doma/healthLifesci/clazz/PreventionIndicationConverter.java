package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PREVENTION_INDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PreventionIndication;

@ExternalDomain
public class PreventionIndicationConverter implements DomainConverter<PreventionIndication, String> {

	@Override
	public String fromDomainToValue(PreventionIndication domain) {
		return domain.getNativeValue();
	}

	@Override
	public PreventionIndication fromValueToDomain(String value) {
		return new PREVENTION_INDICATION(value);
	}

}
