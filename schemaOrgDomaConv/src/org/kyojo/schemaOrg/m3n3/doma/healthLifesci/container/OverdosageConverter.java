package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.OVERDOSAGE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Overdosage;

@ExternalDomain
public class OverdosageConverter implements DomainConverter<Overdosage, String> {

	@Override
	public String fromDomainToValue(Overdosage domain) {
		return domain.getNativeValue();
	}

	@Override
	public Overdosage fromValueToDomain(String value) {
		return new OVERDOSAGE(value);
	}

}
