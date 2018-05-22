package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.GUIDELINE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Guideline;

@ExternalDomain
public class GuidelineConverter implements DomainConverter<Guideline, String> {

	@Override
	public String fromDomainToValue(Guideline domain) {
		return domain.getNativeValue();
	}

	@Override
	public Guideline fromValueToDomain(String value) {
		return new GUIDELINE(value);
	}

}
